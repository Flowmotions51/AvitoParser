package ru.fedorov.avitoparser.parser;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.client.HttpClientErrorException;
import ru.fedorov.avitoparser.data.Brand;
import ru.fedorov.avitoparser.data.Car;
import ru.fedorov.avitoparser.data.CarCell;
import ru.fedorov.avitoparser.data.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private Document doc;
    private List<CarCell> carCells;

    public List<CarCell> getCarCells(String params) {
        if (carCells != null) carCells.clear();
        try {
            doc = Jsoup.connect("https://www.avito.ru/moskva_i_mo/avtomobili/" + params.toLowerCase() + "?cd=1&s=104").get();
            Elements elements = doc.select("[data-marker=item]");
            int listSize = doc.select("[data-marker=item]").size();
            carCells = new ArrayList<>();
            for (int i = 0; i < listSize; i++) {
                String previewImageHref;
                String firstImageHref;
                String itemName;
                String link;
                if (elements.get(i).children().size() > 1) {
                    Element previewImagePlaceHolder = elements.get(i).child(1).child(0).child(0).child(0).child(0).child(0).child(0);
                    if (!previewImagePlaceHolder.html().equals("")) {
                        previewImageHref = previewImagePlaceHolder.attr("data-marker").substring(19);
                        itemName = elements.get(i).child(1).child(1).child(1).child(0).child(0).html();
                        link = "https://www.avito.ru"
                                + elements.get(i).child(1).child(0).child(0).attr("href");
                    } else {
                        continue;
                    }
                } else {
                    previewImageHref = elements.get(i).child(0).child(0).child(0).child(0).child(0).child(0).child(0).attr("data-marker").substring(19);
                    itemName = elements.get(i).child(0).child(1).child(1).child(0).child(0).html();
                    link = "https://www.avito.ru"
                            + elements.get(i).child(0).child(0).child(0).attr("href");
                }
                carCells.add(new CarCell(previewImageHref, "", link, itemName));
            }
        } catch (IOException exception) {
            exception.getMessage();
            throw new RuntimeException("RE");
        }
        return carCells;
    }

    public Car getCarInfo(String link) {
        List<String> photosLinks = new ArrayList<>();
        String mainPhotoLink = null;
        String telephonePhotoLink = null;
        String carDescription = null;
        String phone = null;
        link = "https://www.avito.ru/moskva/avtomobili/" + link;
        try {
            Document carPage = Jsoup.connect(link).get();
            mainPhotoLink = carPage
                    .select("[class=gallery-imgs-container js-gallery-imgs-container]")
                    .get(0).child(0).child(0).attr("data-url");
            Elements photoWrappers
                    = carPage.select("[class=gallery-imgs-container js-gallery-imgs-container]").get(0).children();
            for (Element e : photoWrappers) {
                photosLinks.add(e.child(0).attr("data-url"));
            }
            if (carPage.select("[class=item-description-html]").size() == 0) {
                carDescription = carPage.select("[class=item-description-text]").get(0).html();
            } else {
                carDescription = carPage.select("[class=item-description-html]").get(0).html();
            }

            phone = carPage.select("[class=item-phone-button-sub-text]").html();

        } catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("RE");
        }
        return new Car("CarName", mainPhotoLink, telephonePhotoLink, photosLinks, carDescription, phone);
    }

    public List<Brand> getBrandList() {
        List<Brand> brandList = new ArrayList<>();
        try {
            doc = Jsoup.connect("https://www.avito.ru/moskva/avtomobili?radius=0").get();
            Elements elements = doc.select("[data-marker=popular-rubricator/links/row]");
            for (Element e : elements) {
                String brandName = e.child(0).html();
                String brandModelsLink = doc.select("[title='" + brandName + "']").get(0).attr("href");
                Brand brand = new Brand(brandName, brandModelsLink);
                brandList.add(brand);
            }

        } catch (Exception e) {

        }

        return brandList;
    }


    public List<Model> getModelsList(String brand) {
        List<Model> modelsList = new ArrayList<>();
        try {
            doc = Jsoup.connect("https://www.avito.ru/moskva/avtomobili/" + brand).get();
            Elements elements = doc.select("[data-marker=popular-rubricator/link]");
            for(Element e : elements) {
                String name = e.html();
                String link = e.attr("href");
                Model model = new Model(name, link);
                modelsList.add(model);
            }
        } catch (Exception e) {

        }

        return modelsList;
    }
}

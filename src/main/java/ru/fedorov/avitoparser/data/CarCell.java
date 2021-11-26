package ru.fedorov.avitoparser.data;

import java.util.Objects;

public class CarCell {
    private String previewImageUrl;
    private String firstImgUrl;
    private String linkToItem;
    private String carName;
    private String price;


    public String getPreviewImageUrl() {
        return previewImageUrl;
    }

    public String getFirstImgUrl() {
        return firstImgUrl;
    }

    public String getLinkToItem() {
        return linkToItem;
    }

    public String getCarName() {
        return carName;
    }

    public String getPrice() {
        return price;
    }

    public CarCell(String previewImageUrl, String firstImgUrl, String linkToItem, String carName, String price) {
        this.previewImageUrl = previewImageUrl;
        this.firstImgUrl = firstImgUrl;
        this.linkToItem = linkToItem;
        this.carName = carName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarCell carCell = (CarCell) o;

        if (previewImageUrl != null ? !previewImageUrl.equals(carCell.previewImageUrl) : carCell.previewImageUrl != null)
            return false;
        if (firstImgUrl != null ? !firstImgUrl.equals(carCell.firstImgUrl) : carCell.firstImgUrl != null) return false;
        if (linkToItem != null ? !linkToItem.equals(carCell.linkToItem) : carCell.linkToItem != null) return false;
        if (carName != null ? !carName.equals(carCell.carName) : carCell.carName != null) return false;
        return price != null ? price.equals(carCell.price) : carCell.price == null;
    }

    @Override
    public int hashCode() {
        int result = previewImageUrl != null ? previewImageUrl.hashCode() : 0;
        result = 31 * result + (firstImgUrl != null ? firstImgUrl.hashCode() : 0);
        result = 31 * result + (linkToItem != null ? linkToItem.hashCode() : 0);
        result = 31 * result + (carName != null ? carName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}

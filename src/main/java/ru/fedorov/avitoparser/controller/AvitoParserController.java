package ru.fedorov.avitoparser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.fedorov.avitoparser.data.Brand;
import ru.fedorov.avitoparser.data.Car;
import ru.fedorov.avitoparser.data.CarCell;
import ru.fedorov.avitoparser.data.Model;
import ru.fedorov.avitoparser.parser.Parser;
import ru.fedorov.avitoparser.response.GetItemsResponse;
import ru.fedorov.avitoparser.response.ItemResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AvitoParserController {

    @GetMapping("getCells/{brand}/{model}")
    public ResponseEntity<GetItemsResponse> getItems(@PathVariable String brand, @PathVariable String model) {
        List<CarCell> carCellList = null;
        Parser parser = new Parser();
        carCellList = parser.getCarCells(brand + "/" + model + "/");
        return ResponseEntity.status(200).body(new GetItemsResponse("Ok", carCellList));
    }

    @GetMapping("getItem/{link}")
    public ResponseEntity<Car> getItems(@PathVariable String link) {
        Parser parser = new Parser();
        Car car = parser.getCarInfo(link);
        return ResponseEntity.status(200).body(car);
    }

    @GetMapping("getBrandList")
    public ResponseEntity<List<Brand>> getBrandList() {
//        List<Brand> brandList = new Parser().getBrandList();
        List<Brand> brandList = new ArrayList<>(Arrays.asList(
                new Brand("Audi", "audi"),
                new Brand("BMW", "bmw"),
                new Brand("Chevrolet", "chevrolet"),
                new Brand("Citroen", "citroen"),
                new Brand("Ford", "ford"),
                new Brand("Honda", "honda"),
                new Brand("Hyundai", "hyundai"),
                new Brand("Infiniti", "infiniti"),
                new Brand("Kia", "kia"),
                new Brand("Land Rover", "land_rover"),
                new Brand("Lexus", "lexus"),
                new Brand("Mercedes-Benz", "mercedes-benz"),
                new Brand("Toyota", "toyota")
        ));
        return ResponseEntity.status(200).body(brandList);
    }

    @GetMapping("getModelsList/{brand}")
    public ResponseEntity<List<Model>> getModelsList(@PathVariable String brand) {
//        List<Model> modelsList = new Parser().getModelsList(brand);
        List<Model> modelsList = null;
        switch (brand) {
            case "audi": {
                modelsList = new ArrayList<>(Arrays.asList(
                        new Model("100", "100_2420"),
                        new Model("80", "80"),
                        new Model("A1", "a1"),
                        new Model("A3", "a3"),
                        new Model("A4", "a4"),
                        new Model("A5", "a5"),
                        new Model("A6", "a6"),
                        new Model("A7", "a7"),
                        new Model("A8", "a8"),
                        new Model("Q3", "q3"),
                        new Model("Q5", "q5"),
                        new Model("Q7", "q7"),
                        new Model("Q8", "q8")
                ));
                break;
            }
            case "bmw": {
                modelsList = new ArrayList<>(Arrays.asList(
                        new Model("1 серия", "1-seriya"),
                        new Model("3 серия", "3-seriya"),
                        new Model("4 серия", "4-seriya"),
                        new Model("5 серия", "5-seriya"),
                        new Model("6 серия", "6-seriya"),
                        new Model("7 серия", "7-seriya")
                ));
                break;
            }
            case "chevrolet": {
                modelsList = new ArrayList<>(Arrays.asList(
                        new Model("Blazer", "blazer"),
                        new Model("Camaro", "camaro"),
                        new Model("Caprice", "caprice"),
                        new Model("Corvette", "corvette"),
                        new Model("Suburban", "suburban"),
                        new Model("Tahoe", "tahoe")
                ));
                break;
            }
            case "toyota": {
                modelsList = new ArrayList<>(Arrays.asList(
                        new Model("Crown", "crown"),
                        new Model("Mark X", "mark_x"),
                        new Model("Altezza", "altezza"),
                        new Model("Aristo", "aristo"),
                        new Model("Chaser", "chaser"),
                        new Model("Cresta", "cresta"),
                        new Model("Cresta", "cresta"),
                        new Model("Mark II", "mark_ii"),
                        new Model("Supra", "supra")
                ));
                break;
            }

        }
        return ResponseEntity.status(200).body(modelsList);
    }
}

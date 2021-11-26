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
import ru.fedorov.avitoparser.storage.CarCellsStorage;
import ru.fedorov.avitoparser.storage.CarStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class AvitoParserController {

    @GetMapping("getCells/{brand}/{model}")
    public ResponseEntity<List<CarCell>> getItems(@PathVariable String brand, @PathVariable String model) throws InterruptedException {
        List<CarCell> carCellList = new ArrayList<>();
        Parser parser = new Parser();
        carCellList = parser.getCarCells(brand + "/" + model + "/");
        return ResponseEntity.status(200).body(carCellList);
    }

    @GetMapping("getItem/{link}")
    public ResponseEntity<Car> getItems(@PathVariable String link) throws InterruptedException {
        Parser parser = new Parser();
        Car car = parser.getCarInfo(link);
        return ResponseEntity.status(200).body(car);
    }

    @GetMapping("getBrandList")
    public ResponseEntity<List<Brand>> getBrandList() throws InterruptedException {
        Thread.sleep(1000);
        List<Brand> brandList = new Parser().getBrandList();
        return ResponseEntity.status(200).body(brandList);
    }

    @GetMapping("getModelsList/{brand}")
    public ResponseEntity<List<Model>> getModelsList(@PathVariable String brand) throws InterruptedException {
        List<Model> modelsList = new Parser().getModelsList(brand);
        return ResponseEntity.status(200).body(modelsList);
    }
}

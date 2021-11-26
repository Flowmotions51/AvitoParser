package ru.fedorov.avitoparser.storage;

import ru.fedorov.avitoparser.data.CarCell;

import java.util.ArrayList;
import java.util.List;

public class CarCellsStorage {

    public static List<CarCell> getCarCells(String brand, String model) {
        List<CarCell> carCells = new ArrayList<>();
        switch (brand) {
            case "bmw": {
                switch (model) {
                    case "1-seriya": {
                        carCells.add(new CarCell("https://96.img.avito.st/208x156/12326479296.jpg", "", "bmw_1_link_1", "BMW 1 Серия, 2008", "900 000"));
                        carCells.add(new CarCell("https://61.img.avito.st/208x156/12297994561.jpg", "", "bmw_1_link_2", "BMW 1 Серия, 2009", "1 000 000"));
                        carCells.add(new CarCell("https://75.img.avito.st/208x156/11984019375.jpg", "", "bmw_1_link_3", "BMW 1 Серия, 2008", "1 200 000"));
                        carCells.add(new CarCell("https://48.img.avito.st/208x156/12176507348.jpg", "", "bmw_1_link_4", "BMW 1 Серия, 2010", "950 000"));
                        carCells.add(new CarCell("https://47.img.avito.st/208x156/12019015347.jpg", "", "bmw_1_link_5", "BMW 1 Серия, 2008", "900 000"));
                        carCells.add(new CarCell("https://22.img.avito.st/208x156/12157863722.jpg", "", "bmw_1_link_6", "BMW 1 Серия, 2011", "3 000 000"));
                        break;
                    }
                    case "3-seriya": {
                        carCells.add(new CarCell("https://09.img.avito.st/208x156/11941764809.jpg", "", "bmw_3_link_1", "BMW 3 серия, 2021", "4 300 000"));
                        carCells.add(new CarCell("https://25.img.avito.st/208x156/12322027225.jpg", "", "bmw_3_link_2", "BMW 3 серия, 2013", "1 750 000"));
                        carCells.add(new CarCell("https://79.img.avito.st/208x156/12268638879.jpg", "", "bmw_3_link_3", "BMW 3 серия, 2013", "1 733 000"));
                        carCells.add(new CarCell("https://57.img.avito.st/208x156/12271554257.jpg", "", "bmw_3_link_4", "BMW 3 серия, 2011", "790 000"));
                        carCells.add(new CarCell("https://41.img.avito.st/208x156/11959086941.jpg", "", "bmw_3_link_5", "BMW 3 серия, 2017", "1 990 000"));
                        carCells.add(new CarCell("https://85.img.avito.st/208x156/12239031485.jpg", "", "bmw_3_link_6", "BMW 3 серия, 1985", "300 000"));
                        carCells.add(new CarCell("https://09.img.avito.st/208x156/12309729609.jpg", "", "bmw_3_link_7", "BMW 3 серия, 1994", "950 000"));
                        carCells.add(new CarCell("https://81.img.avito.st/208x156/12292070881.jpg", "", "bmw_3_link_8", "BMW 3 серия, 2000", "550 000"));
                        break;
                    }
                    case "5-seriya": {
                        carCells.add(new CarCell("https://48.img.avito.st/208x156/12333040848.jpg", "", "bmw_5_link_1", "BMW 5 серия, 2016", "2 100 000"));
                        carCells.add(new CarCell("https://81.img.avito.st/208x156/12119021881.jpg", "", "bmw_5_link_2", "BMW 5 серия, 2020", "5 800 000"));
                        carCells.add(new CarCell("https://81.img.avito.st/208x156/12078507681.jpg", "", "bmw_5_link_3", "BMW 5 серия, 1984", "800 000"));
                        carCells.add(new CarCell("https://76.img.avito.st/208x156/11863913476.jpg", "", "bmw_5_link_4", "BMW 5 серия, 2001", "520 000"));
                        carCells.add(new CarCell("https://12.img.avito.st/208x156/12173000612.jpg", "", "bmw_5_link_5", "BMW 5 серия, 2022", "6 458 100"));
                        break;
                    }
                }
                break;
            }
        }
        return carCells;
    }
}

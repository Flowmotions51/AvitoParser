package ru.fedorov.avitoparser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.fedorov.avitoparser.data.Car;

public class ItemResponse {
    @JsonProperty
    private final String message;

    @JsonProperty
    private final Car car;

    public ItemResponse(String message, Car car) {
        this.message = message;
        this.car = car;
    }
}

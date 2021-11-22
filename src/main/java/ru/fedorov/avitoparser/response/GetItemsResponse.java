package ru.fedorov.avitoparser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.fedorov.avitoparser.data.CarCell;

import java.util.List;

public class GetItemsResponse {
    @JsonProperty
    private final String message;

    @JsonProperty
    private final List<CarCell> carcells;

    public GetItemsResponse(String message, List<CarCell> carcells) {
        this.message = message;
        this.carcells = carcells;
    }
}

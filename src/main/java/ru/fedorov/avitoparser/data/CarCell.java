package ru.fedorov.avitoparser.data;

import java.util.Objects;

public class CarCell {
    private String previewImageUrl;
    private String firstImgUrl;
    private String linkToItem;
    private String carName;

    public CarCell(String previewImageUrl, String firstImgUrl, String linkToItem, String carName) {
        this.previewImageUrl = previewImageUrl;
        this.firstImgUrl = firstImgUrl;
        this.linkToItem = linkToItem;
        this.carName = carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarCell carCell = (CarCell) o;
        return Objects.equals(previewImageUrl, carCell.previewImageUrl) && Objects.equals(firstImgUrl, carCell.firstImgUrl) && Objects.equals(linkToItem, carCell.linkToItem) && Objects.equals(carName, carCell.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previewImageUrl, firstImgUrl, linkToItem, carName);
    }

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
}

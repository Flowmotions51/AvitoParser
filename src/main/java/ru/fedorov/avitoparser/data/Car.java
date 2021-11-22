package ru.fedorov.avitoparser.data;

import java.util.List;
import java.util.Objects;

public class Car {
    private String carName;
    private String mainPhotoLink;
    private String telephonePhotoLink;
    private List<String> photoLinks;

    private String phone;

    private String carDescription;

    public Car(String carName, String mainPhotoLink, String telephonePhotoLink, List<String> photoLinks,
               String carDescription, String phone) {
        this.carName = carName;
        this.mainPhotoLink = mainPhotoLink;
        this.telephonePhotoLink = telephonePhotoLink;
        this.photoLinks = photoLinks;
        this.carDescription = carDescription;
        this.phone = phone;
    }

    public String getCarName() {
        return carName;
    }

    public String getMainPhotoLink() {
        return mainPhotoLink;
    }

    public String getTelephonePhotoLink() {
        return telephonePhotoLink;
    }

    public List<String> getPhotoLinks() {
        return photoLinks;
    }


    public String getCarDescription() {
        return carDescription;
    }

    public String getPhone() { return phone; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(mainPhotoLink, car.mainPhotoLink) && Objects.equals(telephonePhotoLink, car.telephonePhotoLink) && Objects.equals(photoLinks, car.photoLinks) && Objects.equals(carDescription, car.carDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, mainPhotoLink, telephonePhotoLink, photoLinks, carDescription);
    }
}

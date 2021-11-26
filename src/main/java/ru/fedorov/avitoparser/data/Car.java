package ru.fedorov.avitoparser.data;

import java.util.List;
import java.util.Objects;

public class Car {
    private String carName;
    private String link;
    private List<String> photoLinks;
    private String phone;
    private String carDescription;

    public Car(String carName, String link, List<String> photoLinks,
               String carDescription, String phone) {
        this.link = link;
        this.carName = carName;
        this.photoLinks = photoLinks;
        this.carDescription = carDescription;
        this.phone = phone;
    }

    public String getLink() {
        return link;
    }

    public String getCarName() {
        return carName;
    }

    public List<String> getPhotoLinks() {
        return photoLinks;
    }


    public String getCarDescription() {
        return carDescription;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carName != null ? !carName.equals(car.carName) : car.carName != null) return false;
        if (link != null ? !link.equals(car.link) : car.link != null) return false;
        if (photoLinks != null ? !photoLinks.equals(car.photoLinks) : car.photoLinks != null) return false;
        if (phone != null ? !phone.equals(car.phone) : car.phone != null) return false;
        return carDescription != null ? carDescription.equals(car.carDescription) : car.carDescription == null;
    }

    @Override
    public int hashCode() {
        int result = carName != null ? carName.hashCode() : 0;
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (photoLinks != null ? photoLinks.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (carDescription != null ? carDescription.hashCode() : 0);
        return result;
    }
}

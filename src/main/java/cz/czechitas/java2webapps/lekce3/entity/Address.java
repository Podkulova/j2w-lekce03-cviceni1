package cz.czechitas.java2webapps.lekce3.entity;

public class Address {
    private String streetNumber;
    private  String city;
    private String ziCode;

    public Address(String streetNumber, String city, String ziCode) {
        this.streetNumber = streetNumber;
        this.city = city;
        this.ziCode = ziCode;
    }

    public Address() {
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZiCode() {
        return ziCode;
    }

    public void setZiCode(String ziCode) {
        this.ziCode = ziCode;
    }
}

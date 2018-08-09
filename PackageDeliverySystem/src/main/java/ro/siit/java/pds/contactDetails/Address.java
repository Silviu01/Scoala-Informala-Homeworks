package ro.siit.java.pds.contactDetails;

import ro.siit.java.pds.dijkstra.City;

public class Address {

    private City city;
    private String street;
    private String zipCode;

    public Address(City city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }
}

package hotel.entities;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "latitude")
    Double latitude;

    @Column(name = "longitude")
    Double longitude;

    @Column(name = "pinCode")
    int pinCode;

    @Column(name = "street")
    String street;

    @Column(name = "area")
    String area;

    @Column(name = "city")
    String city;

    @Column(name = "currency")
    String currency;

    public Location() {
    }

    public Location(Double latitude, Double longitude, int pinCode, String street, String area, String city, String currency) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.pinCode = pinCode;
        this.street = street;
        this.area = area;
        this.city = city;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

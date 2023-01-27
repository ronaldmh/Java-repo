package person;

// 1 - Class Address
public class Address {

    //Variables
    private String address;
    private String postalCode;
    private String city;
    private String province;
    private String country;


    // 2 - Full Constructor
    public Address(String address, String postalCode, String city, String province, String country) {
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    // 3 - Getter and Setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }




}

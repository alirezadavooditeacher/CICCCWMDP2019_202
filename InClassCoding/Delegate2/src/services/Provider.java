package services;

public class Provider {
    private String name;
    private String address;
    private String company;

    public Provider(String name, String address, String company){
        this.name = name;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}

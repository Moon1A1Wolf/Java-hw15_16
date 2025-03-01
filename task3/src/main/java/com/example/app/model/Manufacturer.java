package main.java.com.example.app.model;

public class Manufacturer {

    private String name;
    private String country;
    private int employeeCount;
    private String description;
    private String logo;

    public Manufacturer(String name, String country, int employeeCount, String description, String logo) {
        this.name = name;
        this.country = country;
        this.employeeCount = employeeCount;
        this.description = description;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

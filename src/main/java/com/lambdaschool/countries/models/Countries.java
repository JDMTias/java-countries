package com.lambdaschool.countries.models;


import javax.persistence.*;

@Entity
@Table (name = "countries")

public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long countryId;
    private String name;
    private long population;
    private long landmasskm2;
    private int medianage;

    public Countries(String name, long population, long landmasskm2, int medianage) {
        this.name = name;
        this.population = population;
        this.landmasskm2 = landmasskm2;
        this.medianage = medianage;
    }

    public Countries() {
    }

    public long getCountryId() {
        return countryId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getLandmasskm2() {
        return landmasskm2;
    }

    public void setLandmasskm2(long landmasskm2) {
        this.landmasskm2 = landmasskm2;
    }

    public int getMedianage() {
        return medianage;
    }

    public void setMedianage(int medianage) {
        this.medianage = medianage;
    }

    @Override
    public String toString() {
        return "Countries {" +
                ", Country Id= " + countryId +
                ", Name= " + name +
                ", Landmass= " + landmasskm2 +
                ", Median Age= " + medianage +
                "}";

    }
}

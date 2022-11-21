package model;



public class Animal {


    private Date arrivalDate;
    private double weight;
    private long regNumber;
    private String origin;



    private String species;



    public Animal(){

    }

    public Animal(Date arrivalDate, double weight, long regNumber, String origin, String species) {
        this.arrivalDate = arrivalDate;
        this.weight = weight;
        this.regNumber = regNumber;
        this.origin = origin;
        this.species = species;
    }

    public Animal(Date arrivalDate, double weight, long regNumber, String origin) {
        this.arrivalDate = arrivalDate;
        this.weight = weight;
        this.regNumber = regNumber;
        this.origin = origin;
        this.species = "not specified";
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {

        this.arrivalDate = arrivalDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

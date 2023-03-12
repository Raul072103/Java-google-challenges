public class Apartment {

    private String location;
    private int monthlyRentalCost;

    public Apartment(String location, int monthlyRentalCost){
        this.location = location;
        this.monthlyRentalCost = monthlyRentalCost;
    }

    public int getMonthlyRentalCost() {
        return monthlyRentalCost;
    }

    public String getLocation() {
        return location;
    }


    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentalCost +
                '}';
    }

}

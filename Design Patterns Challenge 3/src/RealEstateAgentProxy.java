import java.util.Arrays;

public class RealEstateAgentProxy {

    private Apartment[] apartments = new Apartment[0];
    void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length - 1] = apartment;
    }

    Apartment rent(Student student){

        Apartment rentedApartment = null;

        String studentName = student.getName();
        if(studentName.charAt(0) == 'P')
            for(int i = 0; i < this.apartments.length ; i++)
                if(this.apartments[i].getMonthlyRentalCost() < student.getMoney()){
                    rentedApartment = this.apartments[i];
                    int removedIndex = i;
                    System.arraycopy(this.apartments, removedIndex + 1, this.apartments, removedIndex, this.apartments.length - 1);

                    return rentedApartment;
                }
    return null;
    }




}

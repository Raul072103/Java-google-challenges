import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person.Builder("Andrei")
                .setJob("Avocat")
                .setDrivingLicence("DA")
                .build();

        Person person2 = new Person.Builder("Raul")
                .setJob("Programator")
                .setDrivingLicence("DA")
                .setUniversity("UTCN")
                .build();


        }

    }


}
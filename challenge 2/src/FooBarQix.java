
import java.util.Scanner;

public class FooBarQix{

    public static String compute(int i, int step){
        String s = "";

        NumberWordCorrelation[] correlations = {
                new NumberWordCorrelation("Foo", 3),
                new NumberWordCorrelation("Bar", 5),
                new NumberWordCorrelation("Qix", 7)
        };

        for(NumberWordCorrelation correlation : correlations)
            if(i % correlation.getNumber() == 0)
                s = s.concat(correlation.getWord());

        int reversedNumber = 0;

        while(i != 0)
        {
            reversedNumber = reversedNumber * 10 + i % 10;
            i = i/10;
        }

        while(reversedNumber != 0) {
            for(NumberWordCorrelation correlation : correlations)
                if(reversedNumber % 10 == correlation.getNumber())
                    s = s.concat(correlation.getWord());

                if(step == 2)
                    if(reversedNumber % 10 == 0)
                        s = s.concat("*");

            reversedNumber = reversedNumber/10;
        }
        return s;
    }

    public static void main(String[] args) {

        //FooBarQix smth;
        int step;

        Scanner scanner = new Scanner(System.in);

        step = scanner.nextInt();

        for(int i=1;i<=200;i++)
            if(compute(i, step) == "")
                System.out.println(i + " -> " + i);
        else
                System.out.println(i + " -> " + compute(i, step));

    }
}

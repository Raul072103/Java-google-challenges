public class FizzBuzzRizzJazz {

    NumberWordCorrelation[] correlations = {
            new NumberWordCorrelation("Fizz", 3),
            new NumberWordCorrelation("Buzz", 5),
            new NumberWordCorrelation("Rizz", 7),
            new NumberWordCorrelation("Jazz", 11)
    };

    public static String printWord(NumberWordCorrelation[] correlations, int i)
    {
        String s = "";

            for(NumberWordCorrelation correlation : correlations){
                if(i % correlation.getNumber() == 0)
                    s = s.concat(correlation.getWord());

            }

        return s;
    }

    public static void main(String[] args) {

        FizzBuzzRizzJazz obj = new FizzBuzzRizzJazz();
        for(int i=1;i<=100;i++)
            if(printWord(obj.correlations, i) == "")
                System.out.println(i);
        else
                System.out.println(printWord(obj.correlations, i));
    }

}

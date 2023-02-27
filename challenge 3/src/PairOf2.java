import java.lang.reflect.Array;
import java.util.Arrays;

public class PairOf2 {


    public static void main(String[] args) {
        Integer[] numbers = {3, 2, -3, -2, 3, 0};
        Integer[] verificationArray = new Integer[6];
        int nrOfPairs = 0;
        Arrays.fill(verificationArray, 0);

        for(int i = 0; i < Array.getLength(numbers) - 1; i++)
            for(int j=i+1; j <Array.getLength(numbers); j++){
                if((numbers[i] + numbers[j] == 0) && verificationArray[i] == 0 && verificationArray[j] == 0){
                    nrOfPairs++;
                    verificationArray[i] = 1;
                    verificationArray[j] = 1;
            }
            }
        System.out.println(nrOfPairs);
    }



}

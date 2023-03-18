import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) throws FileNotFoundException{
        String secretMessage;
        String[] words = new String[0];
        int wordCount = 0;
        Scanner s = new Scanner(new BufferedReader(new FileReader("src\\input.txt")));
        try{
            s.useLocale(Locale.US);
            while (s.hasNext()){
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = s.next();
            }
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            if(s != null)
                s.close();
        }

        System.out.println(getSecretMessage(words));

    }

    private static String getSecretMessage(String[] words){
        String secretMessage = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            char[] letters = word.toCharArray();
                for(char letter : letters)
                    if(Character.isUpperCase(letter)){
                        if(letter == 'X'){
                            secretMessage += ' ';
                        }else{
                            secretMessage += letter;
                        }
                    }
        }

        return secretMessage;
    }
}

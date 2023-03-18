import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Phonebook {

    private static int MAX_NUMBER = 10_000;

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(searchPhoneNumberByName("Shannelle" , readPhoneBook("src\\input.txt")));
        System.out.println(searchPhoneNumberByName("Abdul", readPhoneBook("src\\input.txt")));

    }

    private static String searchPhoneNumberByName(String name, String[] wordsInPhone){

        for(int i = 0; i < MAX_NUMBER; i++){
            try {
                if (wordsInPhone[i].equals(name))
                    return wordsInPhone[i + 1];
            }
            catch (Exception e){
                System.out.println("fuck off");
            }
        }

        return "The number was not found";
    }

    public static String[] readPhoneBook(String filename) throws FileNotFoundException {
        String[] words = new String[MAX_NUMBER];
        Scanner s = null;
        int wordCount = 0;
        try{
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while(s.hasNext() && wordCount < MAX_NUMBER){
                words[wordCount++] = s.next();
                //System.out.println(wordCount + " " + words[wordCount - 1]);
            }
        }
        catch (Exception e){
            System.out.println("File didnt open");
        }
        finally {
            if(s != null)s.close();
        }

        return words;
    }
}

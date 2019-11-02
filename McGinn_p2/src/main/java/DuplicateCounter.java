import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCounter {
 {
     public static int wordCounter;

    public void count(String dataFile) {

        try {
            HashMap<String, Integer> dataFile = new HashMap<String, Integer>();
             (FileReader words = new FileReader(dataFile))

            wordCounter = 0;
           Scanner scnr = new Scanner(dataFile);

            while (scnr.hasNext()) {
                words.add(scnr.next());
                wordCounter++;
            }

            scnr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void write(String outputFile) {
     try {
         FileWriter output = new FileWriter(String outputFile);
         output.write(wordCounter);

     } catch (IOException ex) {
         ex.printStackTrace();
     }
 }
    }
}

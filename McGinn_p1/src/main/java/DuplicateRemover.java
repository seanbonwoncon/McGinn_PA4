import java.io.*;
import java.util.*;
import java.util.HashSet;

public class DuplicateRemover {

    public static String uniqueWords;

   public void remove(String dataFile) throws  IOException {

       try {
           HashSet<String> dataFile new HashSet<String>();
            (FileReader words = new FileReader(dataFile)) { ;

               uniqueWords = "";
               Scanner  scnr = new Scanner(words);
           }
           while (scnr.hasNext()) {
               wordSet.add(scnr.next());
           }
           uniqueWords = wordSet.toString();
           scnr.close();

       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }

    public void write(String outputFile)throws IOException {
       try {
           FileWriter output = new FileWriter(outputFile);
           output.write(uniqueWords);

       } catch (IOException ex) {
           ex.printStackTrace();
       }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.regex.Matcher;
import java.io.regex.Pattern;

public class regex {
  public static void main(String[] args) {
    String file = "./results.csv";

    Pattern pat = Pattern.compile("^2011\\-.*[zk]$");
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;

      while((line = br.readLine()) != null) {
        Matcher matcher = pat.matcher(line);
        if (matcher.find()) {
          System.out.println(line);
        }
      }

      br.close();
    } catch(IOException err) {
      System.out.println(err);
    }
  }
}
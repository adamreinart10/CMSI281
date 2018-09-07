package copiersupport;
import java.io.FileReader;
import java.nio.file.*;
import java.io.IOException;

public class SourceFile {
// need string variable that can hold and everything you read
private static final int END_OF_FILE  = -1;
public String files;

   public SourceFile(String inputfile){
      files = inputfile;
      }

      public String getString(String inputfile) throws IOException{
        String filedat = null;
        filedat = new String(Files.readAllBytes(Paths.get(files)));
        return filedat;
      }
   }

package copiersupport;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.IOException;
public class TargetFile {

    public static String buff;
    public static String file;

    public TargetFile(String inputfile, String readto){
      file = inputfile;
      buff = readto;
    }
    public static void fileCreator() throws IOException {
        String newfile = file + ".copy";
        try
        (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newfile), "utf-8")))
            {
              writer.write(buff);
              writer.close();
            }
      }

}

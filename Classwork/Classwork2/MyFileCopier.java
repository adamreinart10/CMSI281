import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import copiersupport.*;

public class MyFileCopier {
public static final int END_OF_FILE  = -1;
  public MyFileCopier() {
  }

  public static void main(String args[]) throws IOException {
    System.out.println("Please enter file name ");
    Scanner myInput = new Scanner(System.in);
    String inputfile = myInput.nextLine();
    System.out.println("File is: " + inputfile);
    SourceFile sf = new SourceFile(inputfile);
    String readto = sf.getString(inputfile);
    System.out.println("Contents of file is: " + readto);
    TargetFile target = new TargetFile(inputfile,readto);
    target.fileCreator();

      }

}

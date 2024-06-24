import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fDataIOStreams 
{
   public static void main(String[] args) throws IOException 
   {
      FileOutputStream fos1 = new FileOutputStream("fNew.txt");
      DataOutputStream dos = new DataOutputStream(fos1);
      dos.writeUTF("Welcome to Java");
      dos.close();
      fos1.close();

      FileInputStream fis = new FileInputStream ("fNew.txt");
      DataInputStream din = new DataInputStream (fis) ;
      String s=din. readUTF() ;
      System. out.println (s);
      din.close();
      fis.close();
   }
}

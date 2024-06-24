/*
Byte Array Streams : Used read and write same data to multiple files!
*/
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eByteArrayOutputStream 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fos1 = new FileOutputStream("eNew1.txt");
        FileOutputStream fos2 = new FileOutputStream("eNew2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(98);
        bout.writeTo(fos1);//takes input of ASCII value and stores
        bout.writeTo(fos2);//takes input of ASCII value and stores
        bout.close();
    }
}

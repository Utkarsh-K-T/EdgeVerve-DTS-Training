/*
Stream: 
- logical connection between the Java application and the file/ keyboard/ console.
- abstraction that allows processing sequences of elements in a functional style. 
  Streams can represent data from collections, arrays, I/O channels, or any other source of data. 
  The operations on streams are divided into intermediate and terminal operations, and streams can be either sequential or parallel.
- 
*/
//fileoutputstream -> create new file

import java.io.FileOutputStream;
import java.io.IOException;

public class aStreamsInJava
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fos = new FileOutputStream("aNew.txt");//creating an object by passing a constructor which creates the file in the same parent directory!
        fos.write(80);
        fos.close();

    }
}
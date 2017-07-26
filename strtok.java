import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class strtok {

public static void main(String [] args) {
	
	
	String content = null;

	try {
		content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dylan\\Desktop\\Eclipse Files and Programs\\sampleproject\\src\\setup.txt")));
		/**************************************** change the above directory path as necessary ***********************************/
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	String delims = "===";
    StringTokenizer Tokr = new StringTokenizer(content, delims);
    int n=0;

    while (Tokr.hasMoreElements())
         System.out.println("" + ++n +": "+Tokr.nextElement());
	
}
}
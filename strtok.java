import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class strtok {

public static void main(String [] args) {
	
	
	String content = null;

	try {
		//This turns the setup.txt file into a string.
		content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dylan\\Desktop\\Eclipse Files and Programs\\sampleproject\\src\\setup.txt")));
		/**************************************** change the above directory path as necessary ***********************************/
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	String delims = "==="; //This delimits "===" so it will not be recognized as a token despite being in the file.
    StringTokenizer Tokr = new StringTokenizer(content, delims);
    int n=0;

    //This iterates until the end of the string.
    while (Tokr.hasMoreElements())
         System.out.println(Tokr.nextElement());
	
}
}
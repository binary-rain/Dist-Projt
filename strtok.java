import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class strtok {

public static void main(String [] args) {

        /*String Demo = "This is a string that we want to tokenize";

        StringTokenizer Tokr = new StringTokenizer(Demo);
        int n=0;

        while (Tokr.hasMoreElements())
                System.out.println("" + ++n +": "+Tokr.nextElement());
        }*/
	
	String content;

	content = new String(Files.readAllBytes(Paths.get("sample.txt")));
}
}
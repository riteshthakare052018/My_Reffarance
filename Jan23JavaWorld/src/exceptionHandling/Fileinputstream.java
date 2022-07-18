package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinputstream {
	

	
	public static void main(String[] args)      {
		try {
			
		
		System.out.println("first line of script");
		
		FileInputStream hij = new FileInputStream ("fgfg");
		}
		catch(FileNotFoundException fnf) {
			
			System.out.println("FileNotFoundException ");
//			System.out.println(fnf.getMessage());
		}
		
		System.out.println("last line of script");
	}

}

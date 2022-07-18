package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	Properties prop ;
	FileInputStream file;
	
	public BaseClass () throws IOException {
		
	    prop = new Properties();
		String path = System.getProperty("user.dir")+"//Configure.properties";
		
		 file = new FileInputStream(path);
		 prop.load(file);
		
	}

}

package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertiesfile {
	public static Properties prop;
	
	public static Properties readfile()
	{
		
			try {
				String PropertyFileLocation = "src/config/login.properties";
				File file = new File(PropertyFileLocation);
				FileInputStream fis = new FileInputStream(file);
				Properties prop = new Properties();
				prop.load(fis);
				return prop;		
				
			} catch (Exception e) {
				
				e.printStackTrace();
				// TODO: handle exception
				return prop;
			}
		
		}
		
		
		
	

}

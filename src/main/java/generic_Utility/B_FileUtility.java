package generic_Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 /**
  * @PRASHANT
  */
public class B_FileUtility {
	
	/**
	 * This method fetches data from property file
	 * @return
	 * @throws IOException
	 */
	public String fetchDataFromPropertyFile(String key) throws IOException {
    FileInputStream fis = new FileInputStream("E:\\FrameWork October\\VTIGER!\\src\\test\\resources\\commonData.properties");
	Properties prop = new Properties();	
	prop.load(fis);
	return prop.getProperty(key);
	
	}

}

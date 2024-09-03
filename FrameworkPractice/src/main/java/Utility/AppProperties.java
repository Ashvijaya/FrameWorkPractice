package Utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
	
	public static String getProperty(String browserName, String fileName)
	{
		String property = null;

		if(!(fileName.isBlank() || browserName.isBlank())) {

			try {
				File file = new File(fileName);

				FileReader fileReader = new FileReader(file);

				Properties properties =  new Properties();

				properties.load(fileReader);

				property = properties.getProperty(browserName);
			}catch(IOException ex) {
				Logs.getLog().getLogger().error("{AppProperties} ERROR --> "+ex.getMessage());
			}
			if(property != null) {
				Logs.getLog().getLogger().info("{AppProperties} INFO --> success reading property : {"+browserName+" : "+property+"}");
			}else {
				Logs.getLog().getLogger().error("{AppProperties} ERROR --> failure reading property : {"+browserName+" : "+property+"}");
			}
		}else {
			Logs.getLog().getLogger().error("{AppProperties} ERROR --> either filePath and/or propertyName is blank/empty");
		}
		return property;
	}

}

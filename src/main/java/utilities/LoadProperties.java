package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	public static Properties config, orXpath;

	public static void ReadConfig() throws IOException {

		config = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\configtest\\config.properties");
		config.load(data);
	}

	public static void ReadXpath() throws Exception {

		orXpath = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\configtest\\orXpath.properties");
		orXpath.load(data);
	}

	public static void property() throws Exception {

		ReadConfig();
		ReadXpath();
	}

}

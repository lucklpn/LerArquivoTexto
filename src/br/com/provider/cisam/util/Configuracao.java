package br.com.provider.cisam.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracao {
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		props.load(file);
		return props;
	}
}

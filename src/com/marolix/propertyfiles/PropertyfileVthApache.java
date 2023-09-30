package com.marolix.propertyfiles;
import java.io.File;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertyfileVthApache 
{
	public static void readProperties() throws ConfigurationException{
		Configurations c= new Configurations();
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\firstjavaproject\\src\\extras\\app.properties");
		PropertiesConfiguration pc =c.properties(f);
		String s=(String) pc.getProperty("user_name");
		System.out.println(s);
		String s1=(String) pc.getProperty("db_url");
		System.out.println(s1);
	}
public static void main(String[] args) throws ConfigurationException {
	readProperties();
}
}

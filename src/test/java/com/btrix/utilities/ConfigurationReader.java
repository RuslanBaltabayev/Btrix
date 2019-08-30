package com.btrix.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties pro;

    static{

        String path = "configuration.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            pro=new Properties();
            pro.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return pro.getProperty(key);
    }
}

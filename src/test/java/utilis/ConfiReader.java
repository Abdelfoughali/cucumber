package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiReader {
    public static String readProperty(String key){
// File class assign given file to the java object
        File file= new File("configuration.properties");
        Properties properties= new Properties();
        // propreties ovject will red the properties file

        try {
            properties.load((new FileInputStream(file)));
            // load method will load every value from the value object to the properties object
        } catch (IOException e) {
            e.printStackTrace();
        }
        // more actions surround by try and catch
        return properties.getProperty(key);

        // i can read the value from the properties object using the key
    }

}


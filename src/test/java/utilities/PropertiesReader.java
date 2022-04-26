package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    /** Reader for '.properties' file
     ~Use method getProperty("keyWord")
     * */

    private Properties properties = new Properties();

    public PropertiesReader(String filePath){
        try {
            FileInputStream file = new FileInputStream(filePath);

            properties.load(file);

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }


}

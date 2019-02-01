package org.show.granit.contractregister;

import org.show.granit.utils.LoginPage;

import java.io.*;
import java.util.Properties;

class ContractTestProperties {

    private final static Properties prop = new Properties();

    public static String getProperties(String key) {

        return prop.getProperty(key);
    }

    public static void readPropertiesFromFile() throws IOException {
        String PROP_FILE = "testdata.properties";
        try (InputStream inputStream = LoginPage.class.getClassLoader().getResourceAsStream(PROP_FILE)) {
            Reader reader = new InputStreamReader(inputStream, "UTF-8");
            try {
                prop.load(reader);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
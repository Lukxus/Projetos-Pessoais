package org.example.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE = "application.properties";

    public static String getXmlFilePath() {
        Properties properties = new Properties();
        try (InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (inputStream != null) {
                properties.load(inputStream);
                //System.out.println(properties.getProperty("xml.file.path"));
                return properties.getProperty("xml.file.path");
            } else {
                throw new RuntimeException("Arquivo de configuração '" + CONFIG_FILE + "' não encontrado no classpath.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo de configuração '" + CONFIG_FILE + "'.", e);
        }
    }
}

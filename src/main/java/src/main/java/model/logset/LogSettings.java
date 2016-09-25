/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.model.logset;

/**
 * LogSettings
 * settings of the direction of the log properties file
 * @author Zakhar
 */
public class LogSettings {
    public static final String LOG_PROPERTIES_FILE = "src\\main\\resources\\log\\log4j.properties";
    
    /**
     * returns the direction of the log properties file
     * @return (String)
     */
    public static String getLogPropertiesFile() {
        return LOG_PROPERTIES_FILE;
    }
}

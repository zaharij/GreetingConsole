/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.model.logset;

import org.apache.log4j.Logger;
/**
 * Logging
 * abstract class, contains static method, which implements logging
 * @author Zakhar
 */
public abstract class Logging {
    
    /**
     * implements logging (writes info to library.log file)
     * @param logger
     * @param loggerInfo message to write
     */
    public static void loggin(Logger logger, String loggerInfo){
        ConfigLog configLog = new ConfigLog(LogSettings.LOG_PROPERTIES_FILE);
        configLog.init();
        logger.info(loggerInfo);
    }
}

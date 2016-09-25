/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.model;

import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import static src.main.java.model.constants.Constants.*;

/**
 * GreetingModel
 * implements the business logic,
 * creates the greeting message
 * @author Zakhar
 */
public class GreetingModel {

    /**
     * returns the greeting message (String) according to current time
     * given time can be configured in "Constants.java" file
     * @return greeting message (String)
     */
    public String getGreetingMessage(Locale locale, LocalTime currentTime){
        if (currentTime.equals(START_MORNING_TIME) || (currentTime.isAfter(START_MORNING_TIME)
                && currentTime.isBefore(START_DAY_TIME))){
            return getResourceBundle(locale, MORNING_GREETING_BUNDLE);
        } else if (currentTime.equals(START_DAY_TIME) || (currentTime.isAfter(START_DAY_TIME)
                && currentTime.isBefore(START_EVENING_TIME))){
            return getResourceBundle(locale, DAY_GREETING_BUNDLE);
        } else if (currentTime.equals(START_EVENING_TIME) || (currentTime.isAfter(START_EVENING_TIME)
                && currentTime.isBefore(START_NIGHT_TIME))){
            return getResourceBundle(locale, EVENING_GREETING_BUNDLE);
        } else {
            return getResourceBundle(locale, NIGHT_GREETING_BUNDLE);
        }
    }
    
    /**
     * returns object of current time 
     * @return (LocalTime)
     */
    public LocalTime getCurrentTime(){
        LocalTime currentTime = LocalTime.now();
        return currentTime;
    }

    /**
     * returns localized message using method's parameters
     * @param locale given locale
     * @param localeKey key of the message
     * @return message (String)
     */
    public String getResourceBundle(Locale locale, String localeKey){
        return ResourceBundle.getBundle(BUNDLE_DIR, locale).getString(localeKey);
    }
}

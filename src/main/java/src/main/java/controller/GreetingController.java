/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.controller;

import java.util.Locale;
import org.apache.log4j.Logger;
import src.main.java.model.GreetingModel;
import src.main.java.model.logset.Logging;
import src.main.java.view.GreetingView;
import static src.main.java.model.constants.Constants.*;

/**
 * GreetingController
 * an intermediary between the user and the business logic
 * @author Zakhar
 */
public class GreetingController {
    private GreetingView greetingView = new GreetingView();
    private GreetingModel greetingModel = new GreetingModel();
    private static Logger logger = org.apache.log4j.Logger.getLogger(GreetingModel.class);

    /**
     * startGreeting()
     * gets the message from the method (getGreetingMessage()), which is implements business logic
     * , than outputs it, using printMessage(String), and writes message to log file
     */
    public void startGreeting(){
        greetingView.printMessage(greetingModel.getGreetingMessage(getSystemLocale()
                , greetingModel.getCurrentTime()));
        Logging.loggin(logger, LOG_MESSAGE_PROCESS_SUCC);
    }
    
    /**
     * returns user's locale
     * RU - if the user's locale is equals RU
     * , in other case returns the default locale (US)
     * @return (Locale)
     */
    private Locale getSystemLocale(){
        if (!Locale.getDefault().equals(LOCALE_RU)){
            return LOCALE_DEFAULT;
        } else {
            return LOCALE_RU;
        }
    }
}

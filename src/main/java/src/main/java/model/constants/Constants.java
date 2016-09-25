/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.model.constants;

import java.time.LocalTime;
import java.util.Locale;

/**
 * Constants
 * constants, used in business logic, such as given time
 * , the directory of property file and locale keys etc..
 * @author Zakhar
 */
public class Constants {
    public static final String BUNDLE_DIR = "bundles/bundle";

    public final static LocalTime START_MORNING_TIME = LocalTime.parse("06:00");
    public final static LocalTime START_DAY_TIME = LocalTime.parse("09:00");
    public final static LocalTime START_EVENING_TIME = LocalTime.parse("19:00");
    public final static LocalTime START_NIGHT_TIME = LocalTime.parse("23:00");

    public final static String MORNING_GREETING_BUNDLE = "key.message.morning_greeting";
    public final static String DAY_GREETING_BUNDLE = "key.message.day_greeting";
    public final static String EVENING_GREETING_BUNDLE = "key.message.evening_greeting";
    public final static String NIGHT_GREETING_BUNDLE = "key.message.night_greeting";
    
    public final static String LOG_MESSAGE_PROCESS_SUCC = "BUILD SUCCESS!";
    
    public final static Locale LOCALE_DEFAULT = new Locale("en", "US");
    public final static Locale LOCALE_RU = new Locale("ru", "RU");
}

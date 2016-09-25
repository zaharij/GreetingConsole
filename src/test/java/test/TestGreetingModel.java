/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalTime;
import java.util.Locale;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.java.model.GreetingModel;
import static src.main.java.model.constants.Constants.*;

/**
 * TestGreetingModel
 * testing class of GreetingModel object
 * @author Zakhar
 */
public class TestGreetingModel {
    private static final Locale LOCALE = new Locale("en", "US");
    private static final String FAILURE_MESSAGE_MIN_VALUE = "some problems with min value..";
    private static final String FAILURE_MESSAGE_MAX_VALUE = "some problems with max value..";
    private static GreetingModel greetingModel;
    private String testingMessageMinTime;
    private String testingMessageMaxTime;
    
    /**
     * initializes test's messages with min and max values
     * @param locale (Locale)
     * @param givenTimeMin the beginning of the testing time
     * @param givanTimeMax the ending of the testing time
     */
    public void initTestingMessages(Locale locale, LocalTime givenTimeMin, LocalTime givanTimeMax){
        testingMessageMinTime = greetingModel.getGreetingMessage(locale ,givenTimeMin);
        testingMessageMaxTime = greetingModel.getGreetingMessage(locale ,givanTimeMax);
    }
    
    /**
     * initializes tested object (GreetingModel)
     */
    @BeforeClass
    public static void runTestInitBeforeClass(){
        greetingModel = new GreetingModel();
    }
    
    /**
     * sets null to the "greetingModel" value
     */
    @AfterClass
    public static void runTestInitAfterClass(){
        greetingModel = null;
    }
    
    /**
     * tests the morning greeting message
     * , using limit values (the beginning of the morning and the ending of the morning)
     */
    @Test
    public void testGetGreetingMessageMorning(){
        initTestingMessages(LOCALE, START_MORNING_TIME, START_DAY_TIME);
        Assert.assertEquals(FAILURE_MESSAGE_MIN_VALUE, testingMessageMinTime
                , greetingModel.getResourceBundle(LOCALE, MORNING_GREETING_BUNDLE));
        Assert.assertNotEquals(FAILURE_MESSAGE_MAX_VALUE, testingMessageMaxTime
                , greetingModel.getResourceBundle(LOCALE, MORNING_GREETING_BUNDLE));
    }
    
    /**
     * tests the day greeting message
     * , using limit values (the beginning of the day and the ending of the day)
     */
    @Test
    public void testGetGreetingMessageDay(){
        initTestingMessages(LOCALE, START_DAY_TIME, START_EVENING_TIME);
        Assert.assertEquals(FAILURE_MESSAGE_MIN_VALUE, testingMessageMinTime
                , greetingModel.getResourceBundle(LOCALE, DAY_GREETING_BUNDLE));
        Assert.assertNotEquals(FAILURE_MESSAGE_MAX_VALUE, testingMessageMaxTime
                , greetingModel.getResourceBundle(LOCALE, DAY_GREETING_BUNDLE));
    }
    
    /**
     * tests the evening greeting message
     * , using limit values (the beginning of the evening and the ending of the evening)
     */
    @Test
    public void testGetGreetingMessageEvening(){
        initTestingMessages(LOCALE ,START_EVENING_TIME, START_NIGHT_TIME);
        Assert.assertEquals(FAILURE_MESSAGE_MIN_VALUE, testingMessageMinTime
                , greetingModel.getResourceBundle(LOCALE, EVENING_GREETING_BUNDLE));
        Assert.assertNotEquals(FAILURE_MESSAGE_MAX_VALUE, testingMessageMaxTime
                , greetingModel.getResourceBundle(LOCALE, EVENING_GREETING_BUNDLE));
    }
    
    /**
     * tests the night greeting message
     * , using limit values (the beginning of the night and the ending of the night)
     */
    @Test
    public void testGetGreetingMessageNight(){
        initTestingMessages(LOCALE ,START_NIGHT_TIME, START_MORNING_TIME);
        Assert.assertEquals(FAILURE_MESSAGE_MIN_VALUE, testingMessageMinTime
                , greetingModel.getResourceBundle(LOCALE, NIGHT_GREETING_BUNDLE));
        Assert.assertNotEquals(FAILURE_MESSAGE_MAX_VALUE, testingMessageMaxTime
                , greetingModel.getResourceBundle(LOCALE, NIGHT_GREETING_BUNDLE));
    }
}

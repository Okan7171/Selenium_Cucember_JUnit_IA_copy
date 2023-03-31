package com.krafttech.steps_defs;

import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().setPosition(new Point(-1000, 0));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
       Driver.closeDriver();
    }

    @Before("@kraft")
    public void setUp1(){
        System.out.println("Before kraft");
    }
    @After("@kraft")
    public void tearDown1(){
        System.out.println("After kraft");
    }
}

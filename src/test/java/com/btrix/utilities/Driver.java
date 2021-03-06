package com.btrix.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

   private static WebDriver driver;

   public synchronized static WebDriver getDriver(String browser){

       if(driver==null){

           browser=browser==null?ConfigurationReader.getProperty("browser"):browser;

           switch (browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "chromeHeadless":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               case "firefoxHeadless":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                   break;
               case "ie":
                   if(System.getProperty("user.dir").toLowerCase().contains("mac"))
                       throw new WebDriverException("You have MacOS,choose different browser!");
                   WebDriverManager.iedriver().setup();
                   driver=new InternetExplorerDriver();
                   break;
               case "edge":
                   if(System.getProperty("user.dir").toLowerCase().contains("mac"))
                       throw new WebDriverException("You have MacOS,choose different browser!");
                   WebDriverManager.edgedriver().setup();
                   driver=new EdgeDriver();
                   break;
               case "safari":
                   if(System.getProperty("user.dir").toLowerCase().contains("windows"))
                       throw new WebDriverException("You have Windows,choose different browser!");
                   WebDriverManager.getInstance(SafariDriver.class).setup();
                   driver=new SafariDriver();
                   break;
               default:
                   throw new WebDriverException("Wrong browser name!!!");
           }
       }

       return driver;
   }

   public static WebDriver getDriver(){
       return getDriver(null);
   }

    public static void close(){
       if(driver != null){
           driver.quit();
           driver=null;
       }
    }
}

package com.btrix.step_definitions;

import com.btrix.utilities.BrowserUtility;
import com.btrix.utilities.Pages;
import cucumber.api.java.en.Given;

public class LoginStepDefinition {

    Pages pages = new Pages();
    String username;
    String password;

    @Given("user logs in  as a {string}")
    public void user_logs_in_as_a(String string) {
      if(string.equalsIgnoreCase("helpdesk")){
          username= "helpdeskusername";
          password="helpdeskpassword";
      }else if(string.equalsIgnoreCase("Marketing")){
          username= "marketingusername";
          password="marketingpassword";
      }else if(string.equalsIgnoreCase("hr")){
          username= "hrusername";
          password="hrpassword";
      }
        pages.loginPage().login(username,password);

    }
    @Given("user logs in  with a {string} and {string}")
    public void user_logs_in_with_a_and(String username, String password) {
        pages.loginPage().login(username,password);
        BrowserUtility.waitPlease(5);
    }


}

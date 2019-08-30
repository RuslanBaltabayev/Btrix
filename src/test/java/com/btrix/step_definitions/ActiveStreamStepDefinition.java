package com.btrix.step_definitions;

import com.btrix.utilities.BrowserUtility;
import com.btrix.utilities.Driver;
import com.btrix.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ActiveStreamStepDefinition {

    Pages pages = new Pages();

    @Then("user goes to My Task and click plus icon")
    public void user_goes_to_My_Task_and_click_plus_icon() {
    pages.activeStreamPages().plusicon.click();
        BrowserUtility.waitPlease(1);
    Driver.getDriver().switchTo().frame(pages.activeStreamPages().newTaskframe);
        BrowserUtility.waitPlease(1);
    Assert.assertEquals("New task",pages.activeStreamPages().taskName.getText());

    }

    @Then("user uploads a document to a {string}")
    public void user_uploads_a_document_to_a_new_task(String string) {
        pages.activeStreamPages().taskTitle.sendKeys(string);
        BrowserUtility.waitPlease(1);
        Driver.getDriver().switchTo().frame(pages.activeStreamPages().frame);
        pages.activeStreamPages().text.sendKeys(string);
        BrowserUtility.waitPlease(1);
        Driver.getDriver().switchTo().parentFrame();
        pages.activeStreamPages().uploadbtn.click();
        BrowserUtility.waitPlease(5);
    String path = "/Users/ruslanbaltabayev/Desktop/Merzet Notes.docx";
        pages.activeStreamPages().uploadFile.sendKeys(path);
        BrowserUtility.waitPlease(5);
    }

    @Then("user sets up a deadline due {string}th of any month for a {string} task")
    public void user_sets_up_a_deadline_due_th_of_any_month_for_a_task(String day, String taskTitle) {
       BrowserUtility.scrollToElement(pages.activeStreamPages().dateLocator);
       pages.activeStreamPages().dateLocator.click();
        BrowserUtility.waitPlease(1);
        String str = "//*[contains(@class,'bx-calendar-cell') and contains(text(),'"+day+"')]";
        WebElement dueDay= Driver.getDriver().findElement(By.xpath(str));
        dueDay.sendKeys(str+ Keys.ENTER);
        BrowserUtility.waitPlease(1);
        BrowserUtility.doubleClick(pages.activeStreamPages().clickDate);
        pages.activeStreamPages().selectBtn.click();
        BrowserUtility.waitPlease(1);
        pages.activeStreamPages().addTaskbtn.click();
        BrowserUtility.waitPlease(1);
        Assert.assertEquals(taskTitle,pages.activeStreamPages().taskName.getText());
    }



}

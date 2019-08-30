package com.btrix.pages.ActiveStream;

import com.btrix.utilities.BasePage;
import com.btrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPages extends BasePage {

    public ActiveStreamPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Task']")
    public WebElement taskLocator;
    @FindBy(className = "plus-icon")
    public WebElement plusicon;
    @FindBy(id="bx-b-uploadfile-task-form-bitrix_tasks_task_default_1")
    public WebElement uploadbtn;
    @FindBy(id = "pagetitle")
    public WebElement taskName;
    @FindBy(className = "side-panel-iframe")
    public WebElement newTaskframe;
    @FindBy(xpath="//*[@name='bxu_files[]']")
    public WebElement uploadFile;
    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskTitle;
    @FindBy(className = "bx-editor-iframe")
    public WebElement frame;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement text;
    @FindBy(xpath = "//*[@title='Click to insert file']")
    public WebElement verifyUploadedDoc;
    @FindBy(xpath = "//*[@class='task-options-destination-wrap date']")
    public WebElement dateLocator;
    @FindBy(className = "bx-calendar-right-arrow")
    public WebElement clickDate;
    @FindBy(xpath = "//*[contains(@class,'bx-calendar-cell') and contains(text(),'25')]")
    public WebElement dueDay;
    @FindBy(xpath = "//*[@class='bx-calendar-button-text' and text()='Select']")
    public WebElement selectBtn;
    @FindBy(xpath = "//button[contains(text(),'Add task')][1]")
    public WebElement addTaskbtn;


}

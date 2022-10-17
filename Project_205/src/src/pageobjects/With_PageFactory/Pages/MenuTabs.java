package pageobjects.With_PageFactory.Pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class MenuTabs
{


@FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']")
public WebElement  loginUsernameAdminPa;

@FindBy(xpath = "//span[contains(.,'Admin')]")
public WebElement  admin;

@FindBy(xpath = "(//span[contains(.,'PIM')])[1]")
public WebElement  pIM;

@FindBy(xpath = "//span[contains(.,'Leave')]")
public WebElement  leave;

@FindBy(xpath = "//span[contains(.,'Time')]")
public WebElement  time;

@FindBy(xpath = "//span[contains(.,'Recruitment')]")
public WebElement  recruitment;

@FindBy(xpath = "//span[contains(.,'My Info')]")
public WebElement  myInfo;

@FindBy(xpath = "//span[contains(.,'Performance')]")
public WebElement  performance;

@FindBy(xpath = "//span[contains(.,'Dashboard')]")
public WebElement  dashboard;

@FindBy(xpath = "//span[contains(.,'Directory')]")
public WebElement  directory;

@FindBy(xpath = "//span[contains(.,'Maintenance')]")
public WebElement  maintenance;

@FindBy(xpath = "//span[contains(.,'Buzz')]")
public WebElement  buzz;



}
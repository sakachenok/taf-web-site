package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RwByPage {
    private String linkPersonalAccountLocator = "/html/body/div[1]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    private String textAuthorizationLoginFormLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String buttonSubmitLoginFormLocator = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[3]/input";
    private String errorMessageEmailLoginFormLocator = "//*[@id=\"login-error\"]";
    private String errorMessagePasswordLoginFormLocator = "//*[@id=\"password-error\"]";
    private String inputEmailLoginFormLocator = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[1]/label/div[2]/input";
    private String inputPasswordLoginFormLocator = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String errorMessageWrongCredentialsLocator = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    private WebDriver driver;
    public RwByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkPersonalAccount(){
        WebElement linkPersonalAccount = driver.findElement(By.xpath(linkPersonalAccountLocator));
        linkPersonalAccount.click();
    }

    public String getTextAuthorizationLoginForm(){
        WebElement textAuthorizationLoginForm = driver.findElement(By.xpath(textAuthorizationLoginFormLocator));
        return textAuthorizationLoginForm.getText();
    }

    public void clickButtonSubmitLoginForm(){
        WebElement buttonSubmitLoginForm = driver.findElement(By.xpath(buttonSubmitLoginFormLocator));
        buttonSubmitLoginForm.click();
    }

    public String getTextErrorMessageEmailLoginForm(){
        WebElement errorMessageEmailLoginForm = driver.findElement(By.xpath(errorMessageEmailLoginFormLocator));
        return errorMessageEmailLoginForm.getText();
    }

    public String getTextErrorMessagePasswordLoginForm(){
        WebElement errorMessagePasswordLoginForm = driver.findElement(By.xpath(errorMessagePasswordLoginFormLocator));
        return errorMessagePasswordLoginForm.getText();
    }

    public void sendKeysInputEmailLoginForm(String newEmail){
        WebElement inputEmailLoginForm = driver.findElement(By.xpath(inputEmailLoginFormLocator));
        inputEmailLoginForm.sendKeys(newEmail);
    }
    public void sendKeysInputPasswordLoginForm(String newPassword){
        WebElement inputPasswordLoginForm = driver.findElement(By.xpath(inputPasswordLoginFormLocator));
        inputPasswordLoginForm.sendKeys(newPassword);
    }

    public String getTextErrorMessageWrongCredentials(){
        WebElement errorMessageWrongCredentials = driver.findElement(By.xpath(errorMessageWrongCredentialsLocator));
        return errorMessageWrongCredentials.getText();
    }

}

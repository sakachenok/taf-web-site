package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void clickLinkPersonalAccount() {
        driver.findElement(By.xpath(linkPersonalAccountLocator)).click();
    }

    public String getTextAuthorizationLoginForm() {
        return driver.findElement(By.xpath(textAuthorizationLoginFormLocator)).getText();
    }

    public void clickButtonSubmitLoginForm() {
        driver.findElement(By.xpath(buttonSubmitLoginFormLocator)).click();
    }

    public String getTextErrorMessageEmailLoginForm() {
        return driver.findElement(By.xpath(errorMessageEmailLoginFormLocator)).getText();
    }

    public String getTextErrorMessagePasswordLoginForm() {
        return driver.findElement(By.xpath(errorMessagePasswordLoginFormLocator)).getText();
    }

    public void sendKeysInputEmailLoginForm(String newEmail) {
        driver.findElement(By.xpath(inputEmailLoginFormLocator)).sendKeys(newEmail);
    }

    public void sendKeysInputPasswordLoginForm(String newPassword) {
        driver.findElement(By.xpath(inputPasswordLoginFormLocator)).sendKeys(newPassword);
    }

    public String getTextErrorMessageWrongCredentials() {
        return driver.findElement(By.xpath(errorMessageWrongCredentialsLocator)).getText();
    }
}

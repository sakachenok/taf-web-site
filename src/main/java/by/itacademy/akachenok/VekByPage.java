package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VekByPage {
    private String buttonAccountLocator = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button";
    private String buttonLoginLocator = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    private String inputEmailLocator = "//*[@id=\"login-email\"]";
    private String inputPasswordLocator = "//*[@id=\"login-password\"]";
    private String buttonLoginSubmitLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    private String errorMessageEmailLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    private String errorMessageEmptyPasswordLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    private String buttonAcceptCookieLocator = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]";
    private WebDriver driver;

    public VekByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAccount() {
        driver.findElement(By.xpath(buttonAccountLocator)).click();
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(buttonLoginLocator)).click();
    }

    public void sendKeysInputEmail(String newEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(newEmail);
    }

    public void sendKeysInputPassword(String newPassword) {
        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(newPassword);
    }

    public void clickButtonLoginSubmit() {
        driver.findElement(By.xpath(buttonLoginSubmitLocator)).click();
    }

    public String getTextErrorMessageEmail() {
        return driver.findElement(By.xpath(errorMessageEmailLocator)).getText();
    }

    public String getTextErrorMessageEmptyPassword() {
        return driver.findElement(By.xpath(errorMessageEmptyPasswordLocator)).getText();
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(buttonAcceptCookieLocator)).click();
    }
}

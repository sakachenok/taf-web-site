package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebSite21VekByPage {
    public String buttonAccountLocator = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button";
    public String buttonLoginLocator = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    public String inputEmailLocator = "//*[@id=\"login-email\"]";
    public String inputPasswordLocator = "//*[@id=\"login-password\"]";
    public String buttonLoginSubmitLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    public String errorMessageEmailLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    public String errorMessageEmptyPasswordLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    public String buttonAcceptCookieLocator = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]";
    public WebDriver driver;

    public WebSite21VekByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAccount() {
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();
    }

    public void clickButtonLogin() {
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();
    }

    public void sendKeysInputEmail(String NewEmail) {
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailLocator));
        inputEmail.sendKeys(NewEmail);
    }

    public void sendKeysInputPassword(String NewPassword) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys(NewPassword);
    }

    public void clickButtonLoginSubmit() {
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();
    }

    public String getTextErrorMessageEmail() {
        WebElement errorMessageEmptyEmail = driver.findElement(By.xpath(errorMessageEmailLocator));
        return errorMessageEmptyEmail.getText();
    }

    public String getTextErrorMessageEmptyPassword() {
        WebElement errorMessageEmptyPassword = driver.findElement(By.xpath(errorMessageEmptyPasswordLocator));
        return errorMessageEmptyPassword.getText();
    }

    public void clickButtonAcceptCookie() {
        WebElement buttonAcceptCookie = driver.findElement(By.xpath(buttonAcceptCookieLocator));
        buttonAcceptCookie.click();
     }
}

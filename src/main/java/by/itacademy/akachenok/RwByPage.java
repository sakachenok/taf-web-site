package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RwByPage {
    private String linkPersonalAccountLocator = "//span[text()='Личный кабинет']";
    private String textAuthorizationLoginFormLocator = "//div[text()='Авторизация']";
    private String buttonSubmitLoginFormLocator = "//input[@type='submit' and @value='Войти']";
    private String errorMessageEmailLoginFormLocator = "//label[@id='login-error']";
    private String errorMessagePasswordLoginFormLocator = "//label[@id='password-error']";
    private String inputEmailLoginFormLocator = "//input[@name='login']";
    private String inputPasswordLoginFormLocator = "//input[@name='password']";
    private String errorMessageWrongCredentialsLocator = "//div[text()='Пользователь не найден']";
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

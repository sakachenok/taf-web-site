package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VekByPage {
    private String buttonAccountLocator = "//span[@class='userToolsText']";
    private String buttonLoginLocator = "//button[@data-testid='loginButton']";
    private String inputEmailLocator = "//input[@label='Электронная почта']";
    private String inputPasswordLocator = "//input[@label='Пароль']";
    private String buttonLoginSubmitLocator = "//button[@data-testid='loginSubmit']";
    private String errorMessageEmailLocator = "//span[@class='ErrorMessage-module__message']";
    private String errorMessageEmptyPasswordLocator = "//span[text()='Пароль не указан']";
    private String buttonAcceptCookieLocator = "//button[@class='Button-module__button Button-module__blue-primary']";
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

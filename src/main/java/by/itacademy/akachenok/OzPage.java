package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    private String linkEnterLocator = "//span[text()='Войти']";
    private String linkEmailLoginFormLocator = "//a[@id='loginFormLoginEmailLink']";
    private String inputEmailLocator = "//input[@type='email']";
    private String inputPasswordLocator = "//input[@type='password']";
    private String buttonEnterLocator = "//button[@type='submit']";
    private String errorMessageEmailDoesNotExistLocator = "//div[@class='i-popover__line' and text()='Адрес электронной почты не зарегистрирован. ']";
    private String textEnterLoginFormLocator = "//p[@id='loginPopupIntro']";
    private WebDriver driver;

    public OzPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkEnter() {
        driver.findElement(By.xpath(linkEnterLocator)).click();
    }

    public void clickLinkEmailLoginForm() {
        driver.findElement(By.xpath(linkEmailLoginFormLocator)).click();
    }

    public void sendKeysInputEmail(String newEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(newEmail);
    }

    public void sendKeysInputPassword(String newPassword) {
        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(newPassword);
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnterLocator)).click();
    }

    public String getTextErrorMessageEmailDoesNotExist() {
        return driver.findElement(By.xpath(errorMessageEmailDoesNotExistLocator)).getText();
    }

    public String getTextEnterLoginForm() {
        return driver.findElement(By.xpath(textEnterLoginFormLocator)).getText();
    }

}

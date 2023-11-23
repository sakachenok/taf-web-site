package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    private String linkEnterLocator = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
    private String linkEmailLoginFormLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    private String inputEmailLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    private String inputPasswordLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    private String buttonEnterLocator = "//*[@id=\"loginForm\"]/button";
    private String errorMessageEmailDoesNotExistLocator = "//*[@id=\"test\"]/div/div";
    private String textEnterLoginFormLocator = "//*[@id=\"loginPopupIntro\"]";
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

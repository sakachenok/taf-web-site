package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OzPage {
    private String linkEnterLocator = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
    private String linkEmailLoginFormLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    private String inputEmailLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    private String inputPasswordLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    private String buttonEnterLocator = "//*[@id=\"loginForm\"]/button";
    private String errorMessageEmailDoesNotExistLocator = "//*[@id=\"test\"]/div/div";
    private String textEnterLoginFormLocator = "//*[@id=\"loginPopupIntro\"]";
    WebDriver driver;
    public OzPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinkEnter(){
        WebElement linkEnter = driver.findElement(By.xpath(linkEnterLocator));
        linkEnter.click();
    }

    public void clickLinkEmailLoginForm(){
        WebElement linkEmailLoginForm = driver.findElement(By.xpath(linkEmailLoginFormLocator));
        linkEmailLoginForm.click();
    }

    public void sendKeysInputEmail(String newEmail){
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailLocator));
        inputEmail.sendKeys(newEmail);
    }

    public void sendKeysInputPassword(String newPassword){
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys(newPassword);
    }

    public void clickButtonEnter(){
        WebElement buttonEnter = driver.findElement(By.xpath(buttonEnterLocator));
        buttonEnter.click();
    }

    public String getTextErrorMessageEmailDoesNotExist (){
        WebElement errorMessageEmailDoesNotExist = driver.findElement(By.xpath(errorMessageEmailDoesNotExistLocator));
        return errorMessageEmailDoesNotExist.getText();
    }

    public String getTextEnterLoginForm() {
        WebElement textEnterLoginForm = driver.findElement(By.xpath(textEnterLoginFormLocator));
        return textEnterLoginForm.getText();
    }
}

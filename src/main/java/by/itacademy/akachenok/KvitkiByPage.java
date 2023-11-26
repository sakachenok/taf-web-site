package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiByPage {
    private String buttonAcceptCookieLocator = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String linkEnterLocator = "//svg-icon [@name='user-account-link']";
    private String textEnterLoginFormLocator = "//span [@class = 'mdc-tab__text-label' and text()='Вход']";
    private String inputEmailLocator = "//input[@type='email']";
    private String inputPasswordLocator = "//input[@type='password']";
    private String buttonEnterLoginFormLocator = "//button[text()='Войти ']";
    private String errorMessageEmailLocator = "//app-collapsible [text()='Пожалуйста, заполните поле (Эл. почта)']";
    private String errorMessageEmailWrongFormatLocator = "//app-collapsible [text()='Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com']";
    private String errorMessagePasswordLocator = "//app-collapsible [text()='Пожалуйста, заполните поле (Пароль)']";
    private String textEmailSuggestionLocator = "//app-collapsible [text()=' Возможно вы имели в виду  ']";
    private String textWrongCredentialsLocator = "//div[text()='Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.']";
    private String buttonCloseCircusBannerLocator = "//div [@class='popupbanner_close']";
    private WebDriver driver;

    public KvitkiByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(buttonAcceptCookieLocator)).click();
    }

    public void clickButtonCloseCircusBanner() {
        driver.findElement(By.xpath(buttonCloseCircusBannerLocator)).click();
    }

    public void clickLinkEnter() {
        driver.findElement(By.xpath(linkEnterLocator)).click();
    }

    public String getTextEnterLoginForm() {
        return driver.findElement(By.xpath(textEnterLoginFormLocator)).getText();
    }

    public void clickInputEmail() {
        driver.findElement(By.xpath(inputEmailLocator)).click();
    }

    public void sendKeysInputEmail(String newEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(newEmail);
    }

    public void clickInputPassword() {
        driver.findElement(By.xpath(inputPasswordLocator)).click();
    }

    public void sendKeysInputPassword(String NewPassword) {
        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(NewPassword);
    }

    public String getTextErrorMessageEmail() {
        return driver.findElement(By.xpath(errorMessageEmailLocator)).getText();
    }

    public String getTextErrorMessageEmailWrongFormat() {
        return driver.findElement(By.xpath(errorMessageEmailWrongFormatLocator)).getText();
    }

    public String getTextErrorMessagePassword() {
        return driver.findElement(By.xpath(errorMessagePasswordLocator)).getText();
    }

    public String getTextEmailSuggestion() {
        return driver.findElement(By.xpath(textEmailSuggestionLocator)).getText();
    }

    public String getTextWrongCredentials() {
        return driver.findElement(By.xpath(textWrongCredentialsLocator)).getText();
    }

    public void clickButtonEnterLoginForm() {
        driver.findElement(By.xpath(buttonEnterLoginFormLocator)).click();
    }

}

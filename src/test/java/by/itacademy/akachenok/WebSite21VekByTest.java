package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite21VekByTest {

    @Test
    public void test21VekByLoginFormEmptyValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");

        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage();

        WebElement buttonAcceptCookie = driver.findElement(By.xpath(webSite21VekByPage.buttonAcceptCookieLocator));
        buttonAcceptCookie.click();

        WebElement buttonAccount = driver.findElement(By.xpath(webSite21VekByPage.buttonAccountLocator));
        buttonAccount.click();

        WebElement buttonLogin = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginLocator));
        buttonLogin.click();
        Thread.sleep(2000);

        WebElement buttonLoginSubmit = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        WebElement errorMessageEmptyEmail = driver.findElement(By.xpath(webSite21VekByPage.errorMessageEmailLocator));
        Assertions.assertEquals("Электронная почта не указана", errorMessageEmptyEmail.getText());

        WebElement errorMessageEmptyPassword = driver.findElement(By.xpath(webSite21VekByPage.errorMessageEmptyPasswordLocator));
        Assertions.assertEquals("Пароль не указан", errorMessageEmptyPassword.getText());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test21VekByLoginFormOneEmptyValue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");

        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage();

        WebElement buttonAcceptCookie = driver.findElement(By.xpath(webSite21VekByPage.buttonAcceptCookieLocator));
        buttonAcceptCookie.click();

        WebElement buttonAccount = driver.findElement(By.xpath(webSite21VekByPage.buttonAccountLocator));
        buttonAccount.click();

        WebElement buttonLogin = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginLocator));
        buttonLogin.click();
        Thread.sleep(2000);

        WebElement inputEmail = driver.findElement(By.xpath(webSite21VekByPage.inputEmailLocator));
        inputEmail.sendKeys("test@test.com");

        WebElement buttonLoginSubmit = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        WebElement errorMessageEmptyPassword = driver.findElement(By.xpath(webSite21VekByPage.errorMessageEmptyPasswordLocator));
        Assertions.assertEquals("Пароль не указан", errorMessageEmptyPassword.getText());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test21VekByLoginFormWithValidValuesAccountDoesNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");

        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage();

        WebElement buttonAcceptCookie = driver.findElement(By.xpath(webSite21VekByPage.buttonAcceptCookieLocator));
        buttonAcceptCookie.click();

        WebElement buttonAccount = driver.findElement(By.xpath(webSite21VekByPage.buttonAccountLocator));
        buttonAccount.click();

        WebElement buttonLogin = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginLocator));
        buttonLogin.click();
        Thread.sleep(2000);

        WebElement inputEmail = driver.findElement(By.xpath(webSite21VekByPage.inputEmailLocator));
        inputEmail.sendKeys("test@t.com");

        WebElement inputPassword = driver.findElement(By.xpath(webSite21VekByPage.inputPasswordLocator));
        inputPassword.sendKeys("123456");

        WebElement buttonLoginSubmit = driver.findElement(By.xpath(webSite21VekByPage.buttonLoginSubmitLocator));
        buttonLoginSubmit.click();
        Thread.sleep(2000);

        WebElement errorMessageAccountDoesNotExist = driver.findElement(By.xpath(webSite21VekByPage.errorMessageEmailLocator));
        Assertions.assertEquals("Нет такого аккаунта. \n" + "Зарегистрироваться?", errorMessageAccountDoesNotExist.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}

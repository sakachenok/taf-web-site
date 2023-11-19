package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite21VekByTest {

    @Test
    public void test21VekByLoginFormEmptyValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage(driver);
        webSite21VekByPage.clickButtonAcceptCookie();
        webSite21VekByPage.clickButtonAccount();
        webSite21VekByPage.clickButtonLogin();
        Thread.sleep(2000);
        webSite21VekByPage.clickButtonLoginSubmit();
        Assertions.assertEquals("Электронная почта не указана", webSite21VekByPage.getTextErrorMessageEmail());
        Assertions.assertEquals("Пароль не указан", webSite21VekByPage.getTextErrorMessageEmptyPassword());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test21VekByLoginFormOneEmptyValue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage(driver);
        webSite21VekByPage.clickButtonAcceptCookie();
        webSite21VekByPage.clickButtonAccount();
        webSite21VekByPage.clickButtonLogin();
        Thread.sleep(2000);
        webSite21VekByPage.sendKeysInputEmail("test@test.com");
        webSite21VekByPage.clickButtonLoginSubmit();
        Assertions.assertEquals("Пароль не указан", webSite21VekByPage.getTextErrorMessageEmptyPassword());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test21VekByLoginFormWithValidValuesAccountDoesNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        WebSite21VekByPage webSite21VekByPage = new WebSite21VekByPage(driver);
        webSite21VekByPage.clickButtonAcceptCookie();
        webSite21VekByPage.clickButtonAccount();
        webSite21VekByPage.clickButtonLogin();
        Thread.sleep(2000);
        webSite21VekByPage.sendKeysInputEmail("test@t.com");
        webSite21VekByPage.sendKeysInputPassword("123456");
        webSite21VekByPage.clickButtonLoginSubmit();
        Thread.sleep(2000);
        webSite21VekByPage.getTextErrorMessageEmail();
        Assertions.assertEquals("Нет такого аккаунта. \n" + "Зарегистрироваться?", webSite21VekByPage.getTextErrorMessageEmail());
        Thread.sleep(2000);
        driver.quit();
    }
}

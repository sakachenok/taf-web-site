package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RwByTest {

    @Test
    public void testAuthorizationFormExists() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
        Assertions.assertEquals("Авторизация", rwByPage.getTextAuthorizationLoginForm());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testAuthorizationFormEmptyValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessageEmailLoginForm());
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessagePasswordLoginForm());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testAuthorizationFormEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
        rwByPage.sendKeysInputEmailLoginForm("sveta@test.com");
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле",rwByPage.getTextErrorMessagePasswordLoginForm());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testAuthorizationFormValidValuesUserDoesNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
        rwByPage.sendKeysInputEmailLoginForm("sveta@test.com");
        rwByPage.sendKeysInputPasswordLoginForm("Test123");
        rwByPage.clickButtonSubmitLoginForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Пользователь не найден", rwByPage.getTextErrorMessageWrongCredentials());
        Thread.sleep(1000);
        driver.quit();
    }
}

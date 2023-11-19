package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzTest {

    @Test
    public void testLoginFormValidValuesUserDoesNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");

        OzPage ozpage = new OzPage(driver);
        ozpage.clickLinkEnter();
        ozpage.clickLinkEmailLoginForm();
        ozpage.sendKeysInputEmail("sveta@test.com");
        ozpage.sendKeysInputPassword("123456");
        ozpage.clickButtonEnter();
        Thread.sleep(2000);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", ozpage.getTextErrorMessageEmailDoesNotExist());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testLoginFormTextEnterExists() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage ozpage = new OzPage(driver);
        ozpage.clickLinkEnter();
        Assertions.assertEquals("Вход", ozpage.getTextEnterLoginForm());
        Thread.sleep(2000);
        driver.quit();
    }
}

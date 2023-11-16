package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzTest {

    @Test
    public void testLoginFormValidValuesUserDoesNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");

        OzPage ozpage = new OzPage();

        WebElement linkEnter = driver.findElement(By.xpath(ozpage.linkEnterLocator));
        linkEnter.click();

        WebElement linkEmailLoginForm = driver.findElement(By.xpath(ozpage.linkEmailLoginFormLocator));
        linkEmailLoginForm.click();

        WebElement inputEmail = driver.findElement(By.xpath(ozpage.inputEmailLocator));
        inputEmail.sendKeys("sveta@test.com");

        WebElement inputPassword = driver.findElement(By.xpath(ozpage.inputPasswordLocator));
        inputPassword.sendKeys("12346");

        WebElement buttonEnter = driver.findElement(By.xpath(ozpage.buttonEnterLocator));
        buttonEnter.click();
        Thread.sleep(2000);

        WebElement errorMessageEmailDoesNotExist = driver.findElement(By.xpath(ozpage.errorMessageEmailDoesNotExistLocator));
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", errorMessageEmailDoesNotExist.getText());

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testLoginFormTextEnterExists() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");

        OzPage ozPage = new OzPage();

        WebElement linkEnter = driver.findElement(By.xpath(ozPage.linkEnterLocator));
        linkEnter.click();

        WebElement textEnterLoginForm = driver.findElement(By.xpath(ozPage.textEnterLoginFormLocator));
        Assertions.assertEquals("Вход", textEnterLoginForm.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}

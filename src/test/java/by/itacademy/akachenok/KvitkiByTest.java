package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiByTest {

   @Test
    public void testTextEnterLoginFormExists() throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.kvitki.by/");
       KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
       kvitkiByPage.clickButtonAcceptCookie();
       kvitkiByPage.clickLinkEnter();
       Assertions.assertEquals("Вход", kvitkiByPage.getTextEnterLoginForm());
       Thread.sleep(1000);
       driver.quit();
   }

   @Test
    public void testEmptyEmailLoginForm() throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.kvitki.by/");
       KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
       kvitkiByPage.clickButtonAcceptCookie();
       kvitkiByPage.clickLinkEnter();
       Thread.sleep(2000);
       kvitkiByPage.clickInputEmail();
       kvitkiByPage.clickInputPassword();
       Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiByPage.getTextErrorMessageEmail());
       Thread.sleep(1000);
       driver.quit();
   }

   @Test
   public void testEmptyPasswordLoginForm() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.kvitki.by/");
      KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
      kvitkiByPage.clickButtonAcceptCookie();
      kvitkiByPage.clickLinkEnter();
      Thread.sleep(2000);
      kvitkiByPage.clickInputPassword();
      kvitkiByPage.clickInputEmail();
      Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiByPage.getTextErrorMessagePassword());
      Thread.sleep(1000);
      driver.quit();
   }

   @Test
   public void testWrongEmailFormatLoginForm() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.kvitki.by/");
      KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
      kvitkiByPage.clickButtonAcceptCookie();
      kvitkiByPage.clickLinkEnter();
      Thread.sleep(2000);
      kvitkiByPage.sendKeysInputEmail("test");
      kvitkiByPage.clickInputPassword();
      Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiByPage.getTextErrorMessageEmailWrongFormat());
      Thread.sleep(1000);
      driver.quit();
   }

   @Test
   public void testEmailSuggestionLoginForm() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.kvitki.by/");
      KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
      kvitkiByPage.clickButtonAcceptCookie();
      kvitkiByPage.clickLinkEnter();
      Thread.sleep(2000);
      kvitkiByPage.sendKeysInputEmail("sveta@test.com");
      Thread.sleep(2000);
      Assertions.assertEquals("Возможно вы имели в виду sveta@hey.com ?", kvitkiByPage.getTextEmailSuggestion());
      Thread.sleep(1000);
      driver.quit();
   }

   @Test
   public void testValidValuesWrongCredentialsLoginForm() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.kvitki.by/");
      KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
      kvitkiByPage.clickButtonAcceptCookie();
      kvitkiByPage.clickLinkEnter();
      Thread.sleep(2000);
      kvitkiByPage.sendKeysInputEmail("svetatest@gmail.com");
      kvitkiByPage.sendKeysInputPassword("Test123");
      kvitkiByPage.clickButtonEnterLoginForm();
      Thread.sleep(2000);
      Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiByPage.getTextWrongCredentials());
      Thread.sleep(1000);
      driver.quit();
   }
}
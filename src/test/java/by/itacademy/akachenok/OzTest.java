package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OzTest extends BaseTest {

    @BeforeEach
    public void start(){
        driver.get("https://oz.by/");
        OzPage ozpage = new OzPage(driver);
        ozpage.clickLinkEnter();
    }

    @Test
    public void testLoginFormValidValuesUserDoesNotExist() throws InterruptedException {
        OzPage ozpage = new OzPage(driver);
        ozpage.clickLinkEmailLoginForm();
        ozpage.sendKeysInputEmail("sveta@test.com");
        ozpage.sendKeysInputPassword("123456");
        ozpage.clickButtonEnter();
        Thread.sleep(2000);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", ozpage.getTextErrorMessageEmailDoesNotExist());
    }

    @Test
    public void testLoginFormTextEnterExists() throws InterruptedException {
        OzPage ozpage = new OzPage(driver);
        Assertions.assertEquals("Вход", ozpage.getTextEnterLoginForm());
        Thread.sleep(2000);
        driver.quit();
    }

}

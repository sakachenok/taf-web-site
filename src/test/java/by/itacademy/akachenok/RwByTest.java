package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RwByTest extends BaseTest{

    @BeforeEach
    public void start() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
    }

    @Test
    public void testAuthorizationFormExists() {
        RwByPage rwByPage = new RwByPage(driver);
        Assertions.assertEquals("Авторизация", rwByPage.getTextAuthorizationLoginForm());
        }

    @Test
    public void testAuthorizationFormEmptyValues() {
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessageEmailLoginForm());
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessagePasswordLoginForm());
    }

    @Test
    public void testAuthorizationFormEmptyPassword()  {
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.sendKeysInputEmailLoginForm("sveta@test.com");
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле",rwByPage.getTextErrorMessagePasswordLoginForm());
    }

    @Test
    public void testAuthorizationFormValidValuesUserDoesNotExist() throws InterruptedException {
        RwByPage rwByPage = new RwByPage(driver);
        rwByPage.sendKeysInputEmailLoginForm("sveta@test.com");
        rwByPage.sendKeysInputPasswordLoginForm("Test123");
        rwByPage.clickButtonSubmitLoginForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Пользователь не найден", rwByPage.getTextErrorMessageWrongCredentials());
    }

}

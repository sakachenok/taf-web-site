package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VekByTest extends BaseTest {

    @BeforeEach
    public void start() throws InterruptedException {
        driver.get("https://www.21vek.by/");
        VekByPage webSite21VekByPage = new VekByPage(driver);
        webSite21VekByPage.clickButtonAcceptCookie();
        webSite21VekByPage.clickButtonAccount();
        webSite21VekByPage.clickButtonLogin();
        Thread.sleep(2000);
    }

    @Test
    public void test21VekByLoginFormEmptyValues() {
        VekByPage webSite21VekByPage = new VekByPage(driver);
        webSite21VekByPage.clickButtonLoginSubmit();
        Assertions.assertEquals("Электронная почта не указана", webSite21VekByPage.getTextErrorMessageEmail());
        Assertions.assertEquals("Пароль не указан", webSite21VekByPage.getTextErrorMessageEmptyPassword());
    }

    @Test
    public void test21VekByLoginFormOneEmptyValue() {
        VekByPage webSite21VekByPage = new VekByPage(driver);
        webSite21VekByPage.sendKeysInputEmail("test@test.com");
        webSite21VekByPage.clickButtonLoginSubmit();
        Assertions.assertEquals("Пароль не указан", webSite21VekByPage.getTextErrorMessageEmptyPassword());
    }

    @Test
    public void test21VekByLoginFormWithValidValuesAccountDoesNotExist() throws InterruptedException {
        VekByPage webSite21VekByPage = new VekByPage(driver);
        webSite21VekByPage.sendKeysInputEmail("test@t.com");
        webSite21VekByPage.sendKeysInputPassword("123456");
        webSite21VekByPage.clickButtonLoginSubmit();
        Thread.sleep(2000);
        webSite21VekByPage.getTextErrorMessageEmail();
        Assertions.assertEquals("Нет такого аккаунта. \n" + "Зарегистрироваться?", webSite21VekByPage.getTextErrorMessageEmail());
    }

}

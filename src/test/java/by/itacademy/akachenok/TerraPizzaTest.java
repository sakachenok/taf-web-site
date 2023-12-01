package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerraPizzaTest extends BaseTest {

    @BeforeEach
    public void start() {
        driver.get("https://terrapizza.by/");
    }

    @Test
    public void testOrderMargaritaAndAmericanoInCart() throws InterruptedException {
        TerraPizzaPage terraPizzaPage = new TerraPizzaPage(driver);
        terraPizzaPage.clickLinkMenu();
        terraPizzaPage.clickCloseCookiesButton();
        terraPizzaPage.clickLinkPizza();
        terraPizzaPage.clickButtonOrderMargarita();
        terraPizzaPage.clickLinkMenu();
        terraPizzaPage.clickLinkBar();
        terraPizzaPage.clickButtonOrderAmericano();
        terraPizzaPage.clickLinkBasket();
        Thread.sleep(2000);
        Assertions.assertEquals("Пицца Маргарита на тонком 32 см", terraPizzaPage.getTextMargaritaBasket());
        Assertions.assertEquals("Американо", terraPizzaPage.getTextAmericanoBasket());
    }

}

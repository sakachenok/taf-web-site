package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTempoTest extends BaseTest {

    @BeforeEach
    public void start() {
        driver.get("https://www.pizzatempo.by/");
    }

    @Test
    public void testOrderMargaritaInCart() throws InterruptedException {
        PizzaTempoPage pizzaTempoPage = new PizzaTempoPage(driver);
        pizzaTempoPage.clickLinkPizza();
        pizzaTempoPage.clickButtonOrderMargaritaMainPage();
        Thread.sleep(2000);
        pizzaTempoPage.clickButtonOrderMargaritaPopUp();
        Thread.sleep(2000);
        pizzaTempoPage.clickLinkCartMainPage();
        Assertions.assertEquals("Пицца \"Маргарита\" (21см)", pizzaTempoPage.getTextPizzaMargaritaCart());
    }

}

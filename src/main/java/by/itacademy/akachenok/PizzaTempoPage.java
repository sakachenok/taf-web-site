package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaTempoPage {
    private String linkPizza = "//img[@alt='Пицца']";
    private String buttonOrderMargaritaMainPage = "//*[@id='1']/div/div[2]/div[3]/div[3]/button/span/span";
    private String buttonOrderMargaritaPopUp = "//button[text()='Заказ']";
    private String linkCartMainPage = "//a[@href='https://www.pizzatempo.by/menu/order/']";
    private String textPizzaMargaritaCart = "//*[@id='basket_expand']/table/tbody/tr[1]/td[2]/div[1]";
    private WebDriver driver;

    public PizzaTempoPage(WebDriver driver) {
        this.driver = driver;
    }

public void clickLinkPizza() {
        driver.findElement(By.xpath(linkPizza)).click();
}

public void clickButtonOrderMargaritaMainPage() {
        driver.findElement(By.xpath(buttonOrderMargaritaMainPage)).click();
}

public void clickButtonOrderMargaritaPopUp() {
        driver.findElement(By.xpath(buttonOrderMargaritaPopUp)).click();
}

public void  clickLinkCartMainPage() {
        driver.findElement(By.xpath(linkCartMainPage)).click();
}

public String getTextPizzaMargaritaCart() {
    return driver.findElement(By.xpath(textPizzaMargaritaCart)).getText();
}

}

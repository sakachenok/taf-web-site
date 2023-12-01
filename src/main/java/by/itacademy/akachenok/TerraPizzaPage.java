package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaPage {
    private String linkMenu = "//a[text()='Меню']";
    private String closeCookiesButton = "/html/body/div[6]/div/button";
    private String linkPizza = "//a[@class='menu-cats-list-item__info' and @href='/catalog/picca']";
    private String buttonOrderMargarita = "//button[@data-id='364']";
    private String linkBar = "//a[@class='menu-cats-list-item__info' and @href='/catalog/bar']";
    private String buttonOrderAmericano = "//button[@data-id='496']";
    private String linkBasket = "//div[@class='basket__top-text']";
    private String textMargaritaBasket = "//*[@id='basket-el-0']/div[2]/div[1]/div[1]";
    private String textAmericanoBasket = "//*[@id='basket-el-1']/div[2]/div[1]/div[1]";
    private WebDriver driver;

    public TerraPizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkMenu() {
        driver.findElement(By.xpath(linkMenu)).click();
    }

    public void clickCloseCookiesButton() {
        driver.findElement(By.xpath(closeCookiesButton)).click();
    }

    public void clickLinkPizza() {
        driver.findElement(By.xpath(linkPizza)).click();
    }

    public void clickButtonOrderMargarita() {
        driver.findElement(By.xpath(buttonOrderMargarita)).click();
    }

    public void clickLinkBar() {
        driver.findElement(By.xpath(linkBar)).click();
    }

    public void clickButtonOrderAmericano() {
        driver.findElement(By.xpath(buttonOrderAmericano)).click();
    }

    public void clickLinkBasket() {
        driver.findElement(By.xpath(linkBasket)).click();
    }

    public String getTextMargaritaBasket() {
        return driver.findElement(By.xpath(textMargaritaBasket)).getText();
    }

    public String getTextAmericanoBasket() {
        return driver.findElement(By.xpath(textAmericanoBasket)).getText();
    }

}

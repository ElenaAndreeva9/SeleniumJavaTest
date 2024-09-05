package com.example.autotestselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 /*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */

/**
 * Класс представляет собой автотест функциональности веб-страницы.
 * Осуществляет поиск продукта, добавление его в корзину,
 * переход в корзину и оформления заказа.
 *
 * @author Andreeva Elena
 * @version 1.0.0
 */
public class TestOrder {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, выполняет поиск продукта, добавляет его в корзину,
     * открывает корзину и переходит к оформлению заказа.
     *
     * @param args an array of Strings containing command-line arguments
     * @throws InterruptedException if any thread has interrupted the current thread
     */
    public static void main(String[] args) throws InterruptedException {

        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver();// Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        driver.manage().window().maximize();// Максимизируем окно браузера
        driver.get("https://www.profkom64.ru/");// Открываем главную страницу сайта
//
//        // 1. Находим поле для поиска и вводим запрос "Герметик"
        WebElement searchInputField = driver.findElement(By.xpath("/html/body/header/div[6]/div/div[3]/form/input[1]"));
        searchInputField.sendKeys("герметик");
        searchInputField.submit();
//
//        // 2. Находим кнопку "В корзине" и кликаем на нее
       WebElement buyButton = driver.findElement(By.xpath("//*[@id=\"right_col\"]/div/div[2]/div[1]/div[2]/form/div[2]/div/input"));
        buyButton.click();

//        // 3. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(300);
//
//        // 4. Находим кнопку "Перейти в корзину" и кликаем на нее
       WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"mainSiteHeader\"]/div[5]/div/div[8]/a"));
        goToCartButton.click();
//
//        // 5. Находим кнопку "Оформить заказ" и кликаем на нее
       WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[2]/a/span"));
        checkoutButton.click();
    }
}

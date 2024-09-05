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
 * Кликает по вкладкам и ссылкам в разделах "О компании", «Услуги», "Покупателю"
 *
 * @author Andreeva Elena
 * @version 1.0.0
 */

public class TestTabsLinks {
    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт и
     * выполняет последовательный клик по различным вкладкам.
     *
     * @param args an array of Strings containing command-line arguments
     */

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();          // Создаем новый экземпляр WebDriver для Chrome

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        // Устанавливаем путь к драйверу Chrome
        driver.manage().window().maximize();           // Максимизируем окно браузера
        driver.get("https://www.profkom64.ru/");       // Открываем главную страницу сайта

        // 1. Находим вкладку "О компании" и кликаем на нее
        WebElement companyTab = driver.findElement(By.xpath("/html/body/header/div[1]/div/nav/ul/li[1]/a"));
        companyTab.click();

        // 2. Находим вкладку «Услуги» и кликаем на нее
        WebElement servisesTab = driver.findElement(By.xpath("/html/body/header/div[1]/div/nav/ul/li[3]/a"));
        servisesTab.click();

        // 3. Находим вкладку «Распил листовых материалов» и кликаем на нее
        WebElement sawingTab
               = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[3]/div[2]/a"));
        sawingTab.click();

        // 4. Находим вкладку «Услуги» и кликаем на нее
        WebElement servisesTab2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/aside/div/div/a"));
        servisesTab2.click();

        // 5. Находим вкладку «Дизайн интерьера» и кликаем на нее
        WebElement designTab
                = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[7]/div[2]/a"));
        designTab.click();

        // 6. Находим вкладку «Услуги» и кликаем на нее
        WebElement servisesTab3 = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/aside/div/div/a"));
        servisesTab3.click();

        // 7. Находим вкладку «Доставка» и кликаем на нее
        WebElement deliveryTab
                = driver.findElement(By.xpath("/html/body/div/header/div[1]/div/nav/ul/li[5]/a"));
        deliveryTab.click();

    }
}

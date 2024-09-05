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
 * Осуществляет переход по различным вкладкам.
 *
 * @author Andreeva Elena
 * @version 1.0.0
 */

public class TestFunctionality
{

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер и кликает по различным вкладкам.
     *
     * @param args an array of Strings containing command-line arguments
     */


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();      // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
                                                   // Устанавливаем путь к драйверу Chrome
        driver.manage().window().maximize();       // Максимизируем окно браузера
        driver.get("https://www.profkom64.ru/");   // Открываем главную страницу сайта


        // 1. Клик на вкладку "Каталог стройматериалов"
        WebElement catalogTab= driver.findElement(By.xpath("/html/body/header/div[6]/div/div[2]/a"));
        catalogTab.click();

        // 2. Клик на подкаталог "Утеплители"
       WebElement insulationCategory= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[5]/div/a"));
        insulationCategory.click();

        // 3. Клик по первой вкладки "Утеплитель напыляемый Технониколь MASTER (940гр)"

       WebElement insulationTap= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/a"));
        insulationTap.click();

        // 4. Клик по вкладке "Описание"
        WebElement descriptionTab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/li[2]"));
       descriptionTab.click();

        // 5. Находим вкладку "Отзывы" и кликаем на нее
        WebElement reviewsTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/li[3]"));
        reviewsTab.click();

        // 6. Находим вкладку "Доставка" и кликаем на нее
       WebElement deliveryTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/li[6]"));
        deliveryTab.click();

        // 7. Находим вкладку "Другие товары" и кликаем на нее
       WebElement otherProductsTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/li[4]"));
       otherProductsTab.click();
    }
}


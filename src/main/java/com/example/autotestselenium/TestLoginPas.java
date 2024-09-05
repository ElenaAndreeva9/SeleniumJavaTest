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
 * Осуществляет добавление товаров в «Избранные товары».
 *
 * @author Andreeva Elena
 * @version 1.0.0
 */

public class TestLoginPas {
    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт и
     * выполняет вход в личный кабинет.
     *
     * @param args an array of Strings containing command-line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();        // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-server\\chromedriver.exe");
        // Устанавливаем путь к драйверу Chrome
        driver.manage().window().maximize();          // Максимизируем окно браузера
        driver.get("https://www.profkom64.ru/");      // Открываем главную страницу сайта

        // 1. Находим вкладку "Вход" и кликаем на неё
        WebElement entranceTab = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[4]/div[3]/a[1]"));
        entranceTab.click();
        // 2. Находим вкладку "по Еmail" и кликаем на неё
        WebElement emailTab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]"));
        emailTab.click();

        // 3. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(300);
//

        // 4. Находим поле для ввода E-mail  и вводим "elenaolen92@mail.ru"
        WebElement loginTab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[3]/form/table/tbody/tr[1]/td/input"));
        loginTab.sendKeys("elenaolen92@mail.ru");

//
        //5.Находим поле для ввода Пароль  и вводим "Tais30Sim12"
        WebElement passwordTab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[3]/form/table/tbody/tr[2]/td/input"));
        passwordTab.sendKeys("Tais30Sim12");
        passwordTab.submit();
    }
}
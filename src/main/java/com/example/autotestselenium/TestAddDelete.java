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
 * Осуществляет добавление товаров в корзину.
 *
 * @author Andreeva Elena
 * @version 1.0.0
 */

public class TestAddDelete
{
    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт и
     * выполняет вход в личный кабинет, выбирает товары и добавляет их в "Избранное".
     *
     * @param args an array of Strings containing command-line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();        // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver","C:\\selenium-server\\chromedriver.exe");
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


        // 4. Находим поле для ввода E-mail  и вводим "elenaolen92@mail.ru"
        WebElement loginTab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[3]/form/table/tbody/tr[1]/td/input"));
        loginTab.sendKeys("elenaolen92@mail.ru");


        //5.Находим поле для ввода Пароль  и вводим "Tais30Sim12"
        WebElement passwordTab = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[3]/form/table/tbody/tr[2]/td/input"));
        passwordTab.sendKeys("Tais30Sim12");
        passwordTab.submit();

        // 6. Находим вкладку "Каталог материалов" и кликаем на нее
        WebElement catalogOfMaterialsTab= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/a"));
        catalogOfMaterialsTab.click();

        // 7. Находим вкладку «Блоки, кирпичи, ПГП» и кликаем на нее
        WebElement blocksBricksTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[12]/div/a"));
        blocksBricksTab.click();

        // 8. Находим вкладку «Кирпич керамический М150 ГОСТ 530-2012 (Красный Яр)» и кликаем на нее
        WebElement brickTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/a"));
        brickTab.click();



        // 9. Находим кнопку "В корзину" и кликаем на нее
        WebElement basketTab= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div[4]/div[2]/div[2]/form/div[3]/div/input"));
        basketTab.click();

        // 10. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(600);

        // 11. Находим кнопку "Корзина заказов" и кликаем на нее
        WebElement cartOfOrders= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[8]/a"));
        cartOfOrders.click();



    }
}


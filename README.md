
# Программы Selenium для автоматизированного тестирования


![c5df5769f404ddd95baaaa756e696dec (1)](https://github.com/user-attachments/assets/dacb3b84-9e05-48c4-bfe6-f176d798d5a3)



**Selenium**  это бесплатная среда и набор программ с открытым исходным кодом,которые применяют для тестирования веб-приложений ,
в различных браузерах и на разных платформах. Для создания тестовых сценариев Selenium мы можем использовать разные языки программирования,
такие как Java,C#, Python, Ruby , PHP и т.д.

**Основными компонентами(инструментами) проекта являются:**

- <a href="https://www.selenium.dev/documentation/ide/">Selenium IDE</a> -
  Интегрированная среда разработки для создания скриптов тестирования визуальным способом
  без необходимости программирования.

- <a href="https://www.selenium.dev/documentation/webdriver/">Selenium WebDriver</a> -
  Позволяет управлять браузером и выполнить различные действия на веб-страницах, такие как: Ввод текста,
  нажатие кнопок, переход по ссылкам и многое
  другое.

- <a href="https://www.selenium.dev/documentation/grid/">Selenium Grid</a> -
  Инструмент для распределенного тестирования, который позволяет запускать тесты параллельно на нескольких машинах и
  браузерах.

  ** Установка  Selenium **
Для установки и настройки Selenium WebDriver на локальной машине понадобятся:
1. Java(JDK);
2. Selenium server;
3. ChromeDriver (для тестирования в Google Chrome).

# Установка Java (Java Development Kit) <img src="https://icon-icons.com/icons2/2108/PNG/512/java_icon_130901.png" width="20">

`JDK` — это полнофункциональный комплект разработки программного обеспечения для `Java`, включающая `JRE`(Java Runtime Environment 
это набор инструментов для запуска программы,то есть  для работы и исполнения кода. JRE — составная часть JDK и входит в пакет по умолчанию), 
компиляторы и инструменты(такие как `JavaDoc` и `Java Debugger`), существующая для создания и «сборки» программы,то есть перевод ее в исполняемые коды.
Для простого запуска `Java` программу в  браузере или компьютере, то будет достаточно установленного `JRE`. 
Для программирования на Java понадобится пакет

 1. Загрузить `Java Platform JDK` из официального сайта
```
http://www.oracle.com/technetwork/java/javase/downloads/index.html
```
2. Установить `java` с настройками по умолчанию
3. Установить переменную `“Java home”`

3.1. Если машина `Windows` нажать `Win+R` и набрать `sysdm.cpl` перейти во вкладку дополнительно/переменные среды.
Создать переменную: `JAVA_HOME`.
Значение переменной: `<путь куда установлена java>` например 
```
(C:\Program Files\Java\jdk1.8.0_65).
```

3.2. Также нужно добавить значение: `<путь куда установлена java>\bin.` в переменную `PATH` : Нажать `Edit` и добавить: 
```
C:\Program Files\Java\jdk1.8.0_65\bin.
```

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/2988d7c2-a673-4b5f-8165-b4d01acb659c)


После установки переменной следует перезапустить `cmd` консоль. Проверка `java` в `cmd: java –version`.
Если  версию `java` в консоли, значит `java` установлена успешно

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/c57cfaab-4c44-4dd9-8b34-5e2ada4717bf)



# Установка среды IntelliJ IDEA <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" width="20">



**IntelliJ IDEA** - это интегрированная среда разработки (IDE) для различных языков программирования, разработанная
компанией JetBrains. IntelliJ IDEA предоставляет разработчикам мощные инструменты для создания программного обеспечения,
улучшения производительности и удобства в процессе разработки.

1. Перейти на [официальный сайт IntelliJ IDEA](https://www.jetbrains.com/idea/download/) и загрузить установщик IDE
   для
   Windows.

2. Запустить скачанный установочный файл.

3. Следовать инструкциям мастера установки, выбрав необходимые параметры (путь установки, язык интерфейса и прочее).

4. После завершения установки запустить IntelliJ IDEA, ввести или активировать лицензионный ключ (если у вас есть),
   создать или импортировать проект и начать работу.


# Установка драйвера для браузера: Windows
 Пример установки драйвера для браузера 
`Chrome`. Для установки открыть сайт
```
https://sites.google.com/a/chromium.org/chromedriver/ downloads
```
и скачать ту версию `ChromeDriver`, которая соответствует версии  браузера  

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/eda64bb4-60f8-4712-9a65-cb85f6de666d)

Чтобы узнать версию браузера нужно открыть новое окно 
в `Chrome`, в поисковой строке набрать: 
```
chrome://version/
```
и нажать `Enter`. В верхней строчке будет информация про версию браузера 

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/54ef8ec0-9e33-4c8f-a3d5-46c33b1a489d)

Разархивировать скачанный файл. Создать на диске 
`C:` папку `webdrivers` и положить разархивированный ранее файл `chromedriver.exe` в папку `C:\webdrivers`.
Добавить в системную переменную `PATH` папку 
```
C:\webdrivers
```
![image](https://github.com/albnsp/selenium-java-test/assets/144931244/8a79ce44-08d0-462c-8e8e-fe6c1eb73a25)


# Автономный сервер Selenium
Запуск сервера осуществляется одним из выбранных в командной строке дважды(вызов `is` осуществляется путем ввода команды в поиске):w`indows` `command line` `cmd`
```
cd ..
```

`Selenium Grid`  <img src="https://air.imag.fr/images/7/73/Selenium_Grid_Logo.png" width="20"> — это инструмент, который запускает 
тесты на нескольких физических или виртуальных машинах, чтобы скрипты могли выполняться параллельно. Selenium Grid — это кластер, состоящий из 
нескольких Selenium-серверов. Он предназначен для организации распределённой сети, позволяющей параллельно запускать несколько браузеров на большом количестве машин. 
`Selenium Grid` имеет топологию «звезда», то есть в его 
составе имеется выделенный сервер, который носит название «хаб» или «концентратор», а остальные сервера 
называются «ноды» или «узлы».

■ `Hub` — это сервер, который выступает в качестве центральной точки, где будут запускаться тесты. Selenium Grid имеет только один концентратор и запускается на одной
машине один раз.

■ `Node` — это Selenium экземпляры, которые прикреплены к концентратору, и которые выполняют тесты. 
В сетке может быть один или несколько узлов, которые могут быть любой ОС и могут содержать любой 
из поддерживаемых браузеров.

Сначала нужно запустить центральный сервер `(hub)`. Это делается с помощью следующей команды: 
```
java -jar selenium-server-standalone.jar -role hub
```
Перед запуском необходимо убедится в том,что находитесь в директории с файлом 
`sselenium-server-standalone.jar.`

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/9539ea82-883e-41e5-af99-2fce44c9e7a3)

`Selenium Server` поддерживает одновременно два набора команд - для новой версии `(WebDriver)` и для старой версии `(Selenium RC)`.
Для запуска теста на удаленной машине нужно запустить на ней сервер, который будет принимать по сети команды, запускать браузер и выполнять их. Предполагается, что 
Java на машине уже установлена. Запуск сервера выполняется следующей командой, набранной в командной строке (вызов командной строки windows ocyществляется набором команды 
в поиске): 
```
Java — jar selenium-server-standalone-****.jar
```
 где * — версия сервера.

![image](https://github.com/albnsp/selenium-java-test/assets/144931244/2a6c3f80-b4b5-46f1-b8cf-7db54a8d22fe)

В консоли  должна появится информация об 
успешном старте hub-a. 
```11:54:52.596 INFO - Nodes should register to
http://192.168.99.1:4444/grid/register/
11:54:52.596 INFO - Selenium Grid hub is up and running
```

Первая строчка означает, что теперь  можно регистрировать узлы по адресу, где запущен `hub`. Вторая 
строчка означает, что `hub` успешно запущен.
После запуска команды можно перейти на панель администрирования хаба по адресу: 

```
http://localhost:4444/grid/
```

## Простой тест

Чтобы убедиться в успешном подключении,нужно создать простой тест с использованием Selenium и Java в IntelliJ IDEA, выполнить следующие шаги: 

1. Внутри  проекта IntelliJ IDEA создать новый Java-класс для  теста.

2. Импортировать необходимые классы Selenium в начале  класса:

        java
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

3. В методе `main` класса задать путь к `ChromeDriver` и создать новый экземпляр `WebDriver`:

        java
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();

4. Указать ссылку на веб-сайт, используя объект driver:

        java
        driver.get("https://www.example.com");

5. Выполнить действия на веб-странице с помощью команд Selenium, таких как поиск элементов, нажатие кнопок или ввод
   текста.

6. Закрыть окно браузера по окончании  теста:

         java 
         driver.quit();





 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;
import pages.SendPage;

public class PageNavigationTest extends TestBase{


    @Test  //метод, помеченный данной аннотацией JUnit, является тестом

    public void FromMainToSendAndBack () throws InterruptedException {

 /*       MainPage mainPage = new MainPage(applicationManager.driver);
        SendPage sendPage = new SendPage(applicationManager.driver);
        mainPage.clickSend();

        //Assertions.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Передача показаний"); //Assertions.assertEquals(X, Y), X - факт, Y - ожидаемый результат

        Assertions.assertEquals(sendPage.getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        sendPage.clickBackButton(); //нажатие на кнопку Назад
        Assertions.assertEquals(mainPage.getHeaderText(), "Neo ЖКХ");

        // driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click(); //нажатие на кнопку Назад
        //      Assertions.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*/
        applicationManager.getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getSendPage().getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


    @Test

    public void FromMainToHistoryAndBack () throws InterruptedException {
/*
        MainPage mainPage = new MainPage(applicationManager.driver);

        mainPage.clickHistory();

        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "История показаний");

        applicationManager.driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();

        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*/
        applicationManager.getMainPage().clickHistory();
        Assertions.assertEquals(applicationManager.getSendPage().getHeaderText(), "История показаний");
        Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


    @Test

    public void FromMainToPriceAndBack () throws InterruptedException {
/*
        MainPage mainPage = new MainPage(applicationManager.driver);
        mainPage.clickPrice();
        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Справочник стоимости услуг");
        applicationManager.driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();
        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*/
        applicationManager.getMainPage().clickPrice();
        Assertions.assertEquals(applicationManager.getSendPage().getHeaderText(), "Справочник стоимости услуг");
        Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


}

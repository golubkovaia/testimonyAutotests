package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.SendPage;

public class ApplicationManager{
    public MainPage mainPage;
    public SendPage sendPage;
        public void init() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\igolubkova\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver();

            driver.get("http://127.0.0.1:5500/index.html");
            mainPage = new MainPage(driver);
            sendPage = new SendPage(driver);
            Thread.sleep(1000);
        }

    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }

    public void close() {
            driver.quit();
        }

        protected WebDriver driver;
}

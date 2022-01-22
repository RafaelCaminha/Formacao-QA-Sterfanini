package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



public class Utils {

    public static WebDriver driver;

    public static void acessarSistema(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
    }


    public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
}

package TakimCalismaMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C00_RelativeLocator {



    //3 ) Relative locator’larin dogru calistigini test edin


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");


        //2 ) Berlin’i  3 farkli relative locator ile locate edin

        WebElement boston=driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement bayArea=driver.findElement(By.id("pid8_thumb"));

        WebElement berlin= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));











    }








}

package TakimCalismaMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Project {










//9. Sayfayi kapatin

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. "https://www.saucedemo.com" Adresine gidin

        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna "standard_user" yazdirin

        WebElement userNameElement= driver.findElement(By.id("user-name"));
        userNameElement.sendKeys("standard_user");

        //3. Password kutusuna "secret_sauce" yazdirin

        WebElement passwordBox= driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys("secret_sauce");

        //4. Login tusuna basin

          driver.findElement(By.id("login-button")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

        WebElement ersteWaren=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String ersteWarenName=ersteWaren.getText();
        ersteWaren.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //7. Alisveris sepetine tiklayin

        driver.findElement(By.className("shopping_cart_link")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

        WebElement actualWaren=driver.findElement(By.linkText("Sauce Labs Backpack"));
        String actualWaren1=actualWaren.getText();

        if (actualWaren1.equals(ersteWarenName)){
            System.out.println("Erste Waren in Korb PASS");
        }else {
            System.out.println("Erste Waren TEST FAILED");
        }
        driver.close();

    }





}

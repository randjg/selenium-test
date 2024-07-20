import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {

    @BeforeAll
    static void setup() {

        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void helloJayjay(){
        //initialize
//        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = WebDriverManager.chromedriver().create();


        //navigate to url

        driver.get("https://jayjay.co/");

        //get element attributes
        String text = driver.findElement(By.className("first-course")).getText();

        //assertion
        assertEquals("Gebrakan Kursus Online yang Siap Meroketkan Kariermu", text);
    }
}

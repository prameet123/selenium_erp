import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class date_check {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.id("datepicker")).click();

        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for(WebElement ele:allDates)
        {

            String date=ele.getText();

            if(date.equalsIgnoreCase("28"))
            {
                ele.click();
                break;
            }

        }


    }
}

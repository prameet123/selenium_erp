import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.Console;
import java.util.List;

public class hello {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver-v0.21.0-win64\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://103.43.40.23:8888/");

        //** login
        WebElement element = driver.findElement(By.xpath("//input[@name='txtUser']"));
        WebElement element1 = driver.findElement(By.xpath("//input[@name='txtPass']"));
        element.sendKeys("admin");
        element1.sendKeys("SELF");
        WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        button.click();



        WebElement l=driver.findElement(By.id("log"));
        String s= l.getText();
        int  log=Integer.parseInt(s);

        WebElement t=driver.findElement(By.id("A1"));
        String ts= t.getText();
        int  ts_int=Integer.parseInt(ts);

        WebElement a=driver.findElement(By.id("A2"));
        String al= a.getText();
        int al_int=Integer.parseInt(al);

        WebElement c=driver.findElement(By.id("A3"));
        String cl= c.getText();
        int cl_int=Integer.parseInt(cl);

        int total=log+ts_int+cl_int+al_int;
        System.out.println("total call logged:"+total);

        driver.findElement(By.id("lnkDefault")).click();


        driver.findElement(By.linkText("Reports")).click();
        driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_2_HyperLink1_1")).click();
        driver.findElement(By.id("ContentPlaceHolder1_txtFrom")).click();


        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));


        for(WebElement ele:allDates)
        {

            String date=ele.getText();
/*
            if (date.equals("October 2018"))
            {
                ele.click();
            }
             if (date.equals("Sep"))
             {
                 ele.click();
             }*/

            if(date.equalsIgnoreCase("28"))
            {
                ele.click();
                break;
            }

        }


    }

}

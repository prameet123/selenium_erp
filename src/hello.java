import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.Console;
import java.util.List;
//** To check total call log in admin
public class hello {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");

        login_page login_page=new login_page();
        login_page.admin();


        WebElement l=login_page.driver.findElement(By.id("log"));
        String s= l.getText();
        int  log=Integer.parseInt(s);

        WebElement t=login_page.driver.findElement(By.id("A1"));
        String ts= t.getText();
        int  ts_int=Integer.parseInt(ts);

        WebElement a=login_page.driver.findElement(By.id("A2"));
        String al= a.getText();
        int al_int=Integer.parseInt(al);

        WebElement c=login_page.driver.findElement(By.id("A3"));
        String cl= c.getText();
        int cl_int=Integer.parseInt(cl);

        int total=log+ts_int+cl_int+al_int;
        System.out.println("total call logged:"+total);

        login_page.driver.findElement(By.id("lnkDefault")).click();


        login_page.driver.findElement(By.linkText("Reports")).click();
        login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_2_HyperLink1_1")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtFrom")).click();
        List<WebElement> allDates=login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));



        for(WebElement ele:allDates)
        {

            String date=ele.getText();
          /*  System.out.println(date);

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

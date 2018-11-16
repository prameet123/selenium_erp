import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class my_test_code {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.techSuppor();


          login_page.driver.findElement(By.cssSelector("div.col-sm-3 > div.complain-title > span")).click();

        //login_page.driver.findElement(By.cssSelector("a.collapsed > div.row > div.col-sm-3 > div.complain-title > span")).click();// 1
       // login_page.driver.findElement(By.cssSelector(".card:nth-child(3) > #headingOne")).click();//3
      //  login_page.driver.findElement(By.cssSelector(".card:nth-child(3) > #headingOne .col-sm-3 span")).click();// line3
//** date picking
       /*login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPurchase")).click();
       login_page.driver.findElement(By.cssSelector("th.datepicker-switch")).click(); // for year selecting
       login_page.driver.findElement(By.xpath("//div[2]/table/thead/tr/th[2]")).click();// click on year
       login_page.driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/span[9]")).click(); // select year(2017)
       login_page.driver.findElement(By.cssSelector(".month:nth-child(10)")).click(); // select month(oct)
       login_page.driver.findElement(By.xpath("//tr[2]/td[5]")).click(); // select date(5)*/


/*
faq
        login_page.driver.findElement(By.xpath("//form[@id='form1']/div[3]/main/div/div/div[5]/div/h6/label")).click();

        Thread.sleep(1000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_txtQuestion")).sendKeys("charging");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_btnSearch")).click();
        Thread.sleep(1000);

        WebElement customer_locality = login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_ddlQuestion"));
        Select dropdown_customer_locality = new Select(customer_locality);
        dropdown_customer_locality.selectByValue("2");
        Thread.sleep(1000);
        login_page.driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_ccfaq_RadioButtonListSingleStage1']/tbody/tr/td/label")).click();
*/


       /* login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPreferDate")).click();

        List<WebElement> allDates3 = login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int day = calendar.get(Calendar.DATE);
        String days =Integer.toString(day);

        for (WebElement ele : allDates3) {

            String date = ele.getText();
            if (date.equalsIgnoreCase(days)) {
                ele.click();
                break;
            }

        }*/

    }
}

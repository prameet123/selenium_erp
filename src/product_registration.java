import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class product_registration {


    public static void main(String[] args) throws InterruptedException {
       // for(int i=0;i<10;i++) {

             data d=new data();
             String  sr=d.getSaltString();
             complaints_booking booking = new complaints_booking();
            System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
            login_page login_page = new login_page();

            login_page.admin();
            login_page.driver.findElement(By.id("lnkDefault")).click();

            login_page.driver.findElement(By.linkText("Transactions")).click();
            login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_1_HyperLink1_5")).click();
            Thread.sleep(2000);
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_name")).sendKeys("shiv kumar");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_email")).sendKeys("shiv@yahoo.com");
            WebElement counrty = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_Country"));
            Select dropdown_counrty = new Select(counrty);
            dropdown_counrty.selectByVisibleText("India");

            WebElement state = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_State"));
            Select dropdown_state = new Select(state);
            dropdown_state.selectByVisibleText("UTTRAKHAND");
            Thread.sleep(2000);


            WebElement city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCity"));
            Select dropdown_city = new Select(city);
            dropdown_city.selectByVisibleText("Rudrapur");

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_pincode")).sendKeys("263153");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_contactno")).sendKeys("9536890798");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtInvoiceNo")).sendKeys("045612789");


            WebElement capacity = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_Product"));
            Select dropdown_capacity = new Select(capacity);
            dropdown_capacity.selectByVisibleText("UPS");

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_srNo")).sendKeys(sr);
            Thread.sleep(5000);
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtDealerName")).sendKeys("pradeep");
            WebElement dealer_state = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlDealerState"));
            Select dropdown_dealer_state = new Select(dealer_state);
            dropdown_dealer_state.selectByVisibleText("UTTRAKHAND");
            Thread.sleep(2000);
            WebElement dealer_city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddldealerCity"));
            Select dropdown_dealer_city = new Select(dealer_city);
            dropdown_dealer_city.selectByValue("1009");

       /* login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_DOP")).click();
        List<WebElement> allDates2 = login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));


        for (WebElement ele : allDates2) {

            String date = ele.getText();


            if (date.equalsIgnoreCase("1")) {
                ele.click();
                break;
            }

        }*/
           login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_DOP")).click();
            login_page.driver.findElement(By.cssSelector("th.datepicker-switch")).click(); // for year selecting
            login_page.driver.findElement(By.xpath("//div[2]/table/thead/tr/th[2]")).click();// click on year
            login_page.driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/span[9]")).click(); // select year(2017)
            login_page.driver.findElement(By.cssSelector(".month:nth-child(10)")).click(); // select month(oct)
            login_page.driver.findElement(By.xpath("//tr[2]/td[5]")).click(); // select date(5)*/
            login_page.driver.findElement(By.id("ContentPlaceHolder1_TxtEffectiveDate")).sendKeys("");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtDealerContactNo")).sendKeys("263153");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPinCode")).sendKeys("263153");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_msg")).sendKeys("condition ok");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_fuinvoice")).sendKeys("C:\\Users\\The One\\Downloads\\ST6625199.pdf");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_fileUploadWarranty")).sendKeys("C:\\Users\\The One\\Downloads\\ST6625199.pdf");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_btn_save")).click();
           /* String toast = login_page.driver.findElement(By.className("toast-message")).getText();
            System.out.println(toast);*/
            login_page.driver.close();

          //  booking.complaints(sr);
        }


    //}
}

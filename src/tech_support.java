import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class tech_support {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.techSuppor();
        // ** forward
        login_page.driver.findElement(By.cssSelector("div.col-sm-5 > div.complain-title > span")).click();
        login_page.driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_Rpt_CallResponse_rdbPhoneNumber_0']/tbody/tr/td/label")).click();
        Thread.sleep(1000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnCallCustomer_0")).click();
        login_page.driver.findElement(By.cssSelector("tr:nth-child(5) label")).click();
        WebElement time = login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_Faq2_0_ddlAnsweredStatus_0"));
        Select dropdown_time = new Select(time);
        dropdown_time.selectByValue("7");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
        //login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();

       /* login_page.driver.findElement(By.cssSelector("a.collapsed > div.row > div.col-sm-3 > div.complain-title > span")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();

        login_page.driver.findElement(By.cssSelector("a.collapsed > div.row > div.col-sm-3 > div.complain-title")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();*/


    }
}

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//** Engineer creation in control panel created by Prameet Mandal.

public class test {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page=new login_page();
       login_page.admin();

        login_page.driver.findElement(By.id("lnkDefault")).click();

        //** techsupport page and add instruction
//        driver.findElement(By.linkText("Transactions")).click();
//        driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_1_HyperLink1_2")).click();
//        driver.findElement(By.id("headingOne")).click();
//        Select select=new Select(driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ddlInstruction_0")));
//        select.selectByVisibleText("Please carry battery with you");
//        driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_BtnAdd_0")).click();
//        driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("ok");
//        driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();
//        Alert alert=driver.switchTo().alert();
//        System.out.print("alert:"+alert.getText()+"\n");
//        alert.accept();

        String title = login_page.driver.getTitle();
        System.out.print(title + "\n");
        login_page.driver.findElement(By.linkText("Control Panel")).click();

        // **product adding in control panel
       /* driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_3_HyperLink1_3")).click();
        driver.findElement(By.id("ContentPlaceHolder1_fu_excel")).sendKeys("C:\\Users\\pr\\Documents\\testing sheet.xlsx");
        driver.findElement(By.id("ContentPlaceHolder1_btn_view")).click();*/

        login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_3_HyperLink1_1")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_EnggName")).sendKeys("kishore kumar");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_engg_code")).sendKeys("kk01");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_phone")).sendKeys("8005446907");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_email")).sendKeys("kk1@mo.co");

        Thread.sleep(5000);

        WebElement mySelectElement = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_stateE"));
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByValue("20");

        Thread.sleep(5000);

        WebElement city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_city"));
        Select dropdown_city = new Select(city);
        dropdown_city.selectByVisibleText("Rudrapur");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_address")).sendKeys("Sanjay nagar");

        Thread.sleep(5000);

        WebElement role = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_engineerRole"));
        Select dropdown_role = new Select(role);
        dropdown_role.selectByValue("28");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_password")).sendKeys("123");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_btn_save")).click();
      Alert alert =login_page.driver.switchTo().alert();
      System.out.println(alert.getText());


    }

}

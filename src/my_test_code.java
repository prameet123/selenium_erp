import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class my_test_code {
    public static void main(String[] args) throws InterruptedException {
        data d = new data();
        String sr = d.getSaltString();
        boolean s=false;
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.admin();
        login_page.driver.findElement(By.id("lnkDefault")).click();
        login_page.driver.findElement(By.linkText("Sales & Target")).click();
        Thread.sleep(1000);
        login_page.driver.findElement(By.xpath("//div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        login_page.driver.findElement(By.id("NavNavigation_rptrModule_rptrMenu_3_rptrSubMenu_0_hprSubMenu_0")).click();
        Thread.sleep(2000);
        login_page.driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnNew']")).click();
        Thread.sleep(1000);
        login_page.driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlTargetonbasis']")).click();
        login_page.driver.findElement(By.xpath("//option[contains(text(),'Product')]")).click();
        login_page.driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlTargetGetOn']")).click();
        login_page.driver.findElement(By.xpath("//option[contains(text(),'Amount')]")).click();
        login_page.driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlTargetApproach']")).click();
        login_page.driver.findElement(By.xpath("//option[contains(text(),'Top To Buttom')]")).click();
        login_page.driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtAmount']")).sendKeys("0.00");
        login_page.driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtAmount']")).clear();
        login_page.driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSubmit']")).click();
        String web= login_page.driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
        System.out.println(web);
        login_page.driver.close();





    }
}

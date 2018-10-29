import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class complaints_booking {

    static   product_registration product_registration=new product_registration();
    public  void complaints() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.customerExexcutive();
        login_page.driver.findElement(By.id("lnkDefault")).click();

        login_page.driver.findElement(By.linkText("Transactions")).click();


        login_page.driver.findElement(By.linkText("Transactions")).click();
        login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_0_HyperLink1_0")).click();


        WebElement text = login_page.driver.findElement(By.id("ContentPlaceHolder1_txtSerial"));
        text.sendKeys(product_registration.sr_number);
        text.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement product_type  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlProduct"));
        Select dropdown_type = new Select(product_type);
        dropdown_type.selectByVisibleText("UPS");

        Thread.sleep(2000);

        login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlmodel_Input")).sendKeys("SINE 1450VA  LCD SOLAR EAPRO (AL DSP HYBRID) (FHUPS0092X0)");

        WebElement product_make  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlMakeOfPanel"));
        Select dropdown_make = new Select(product_make);
        dropdown_make.selectByVisibleText("EAPRO");

        WebElement product_capacity1  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCapacityOfPanel"));
        Select dropdown_capacity1 = new Select(product_capacity1);
        dropdown_capacity1.selectByVisibleText("100 Watt");

        WebElement product_panel  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlNoOfPanel"));
        Select dropdown_panel = new Select(product_panel);
        dropdown_panel.selectByVisibleText("1");

        WebElement battery_panel  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlMakeOfBattery"));
        Select dropdown_battery_panel = new Select(battery_panel);
        dropdown_battery_panel.selectByVisibleText("Luminous");

        WebElement battery_num  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlNoOfBatteries"));
        Select dropdown_battery_num = new Select(battery_num);
        dropdown_battery_num.selectByVisibleText("1");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtComplaint")).sendKeys("ups dead");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPreferDate")).click();
        List<WebElement> allDates3 = login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));


        for (WebElement ele : allDates3) {

            String date = ele.getText();


            if (date.equalsIgnoreCase("29")) {
                ele.click();
                break;
            }

        }

        Thread.sleep(2000);
        WebElement product_time  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlPrefTime"));
        Select dropdown_time = new Select(product_time);
        dropdown_time.selectByVisibleText("10:00-12:00");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrName")).sendKeys("Shubham");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrMobNo")).sendKeys("8005444231");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrAddress")).sendKeys("civil line, main market");
        Thread.sleep(3000);
        WebElement product_state2  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlStateDealer"));
        Select dropdown_state2 = new Select(product_state2);
        dropdown_state2.selectByVisibleText("UTTRAKHAND");

        Thread.sleep(2500);

        WebElement product_city1  = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCityDealer"));
        Select dropdown_city1 = new Select(product_city1);
        dropdown_city1.selectByVisibleText("Rudrapur");
        Thread.sleep(2000);

        WebElement product_locality = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddllocalityDealer"));
        Select dropdown_locality = new Select(product_locality);
        dropdown_locality.selectByVisibleText("sanjay nagar khera");
        Thread.sleep(2000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtAddr1")).sendKeys("kicha");

        WebElement customer_city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCity"));
        Select dropdown_customer_city = new Select(customer_city);
        dropdown_customer_city.selectByVisibleText("Rudrapur");
        Thread.sleep(2000);
        WebElement customer_locality = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlLocality"));
        Select dropdown_customer_locality = new Select(customer_locality);
        dropdown_customer_locality.selectByVisibleText("sanjay nagar khera");

        Thread.sleep(2000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtLandMark")).sendKeys("sai mandir");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txtRemarks")).sendKeys("urgent");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
        String toast =login_page.driver.findElement(By.className("toast-message")).getText();
        System.out.println(toast);
        login_page.driver.close();
    }




    }


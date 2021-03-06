import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class complaints_booking {

    public static void main(String[] args) throws InterruptedException {
        tech_support tech_support = new tech_support();
        name name=new name();
        for (int i = 0; i <= 10; i++) {
            data d = new data();
            String sr = d.getSaltString();

            System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
            login_page login_page = new login_page();
            login_page.customerExexcutive();
            login_page.driver.findElement(By.id("btnNewComplaint")).click();

       /* login_page.driver.findElement(By.linkText("Transactions")).click();
        login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_0_HyperLink1_0")).click();
*/

            WebElement text = login_page.driver.findElement(By.id("ContentPlaceHolder1_txtSerial"));
            text.sendKeys(sr);
            text.sendKeys(Keys.ENTER);

            Thread.sleep(2000);

            try {

                WebElement product_type = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlProduct"));
                Select dropdown_type = new Select(product_type);
                dropdown_type.selectByValue("108003004");
            } catch (Exception e) {
                System.out.println("error:" + e);

            }

            Thread.sleep(2000);

            try {
                login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlmodel_Input")).sendKeys("02K5-036V-SMART IND UPS (FHUPS0026X3 )");
            } catch (Exception e) {
                System.out.println("error2:" + e);
            }
          try {
              login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPurchase")).click();
              login_page.driver.findElement(By.cssSelector("th.datepicker-switch")).click(); // for year selecting
              login_page.driver.findElement(By.xpath("//div[2]/table/thead/tr/th[2]")).click();// click on year
              login_page.driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/span[9]")).click(); // select year(2017)
              login_page.driver.findElement(By.cssSelector(".month:nth-child(10)")).click(); // select month(oct)
              login_page.driver.findElement(By.xpath("//tr[2]/td[5]")).click(); // select date(5)*/
          }
          catch (Exception e){
              System.out.println(e);
          }
            WebElement product_make = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlMakeOfPanel"));
            Select dropdown_make = new Select(product_make);
            dropdown_make.selectByVisibleText("EAPRO");

            WebElement product_capacity1 = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCapacityOfPanel"));
            Select dropdown_capacity1 = new Select(product_capacity1);
            dropdown_capacity1.selectByVisibleText("100 Watt");

            WebElement product_panel = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlNoOfPanel"));
            Select dropdown_panel = new Select(product_panel);
            dropdown_panel.selectByVisibleText("1");

            WebElement battery_panel = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlMakeOfBattery"));
            Select dropdown_battery_panel = new Select(battery_panel);
            dropdown_battery_panel.selectByVisibleText("Luminous");

            WebElement battery_num = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlNoOfBatteries"));
            Select dropdown_battery_num = new Select(battery_num);
            dropdown_battery_num.selectByVisibleText("1");

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtComplaint")).sendKeys("ups dead");

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPreferDate")).click();
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            int day = calendar.get(Calendar.DATE);
             day++;
            String days = Integer.toString(day);
            System.out.println(day);

            List<WebElement> allDates3 = login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));
            for (WebElement ele : allDates3) {

                String date = ele.getText();
                if (date.equalsIgnoreCase(days)) {
                    ele.click();
                    break;
                }

            }

            Thread.sleep(2000);
            WebElement product_time = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlPrefTime"));
            Select dropdown_time = new Select(product_time);
            dropdown_time.selectByVisibleText("12:00-14:00");
            WebElement priority = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlPriority"));
            Select dropdown_priority = new Select(priority);
            dropdown_priority.selectByValue("L");


            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrName")).sendKeys("Jagdish");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrMobNo")).sendKeys("9919371858");

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtdlrAddress")).sendKeys("civil line, main market");
            Thread.sleep(3000);
            WebElement product_state2 = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlStateDealer"));
            Select dropdown_state2 = new Select(product_state2);
            dropdown_state2.selectByVisibleText("ARUNACHAL PRADESH");

            Thread.sleep(2500);

            WebElement product_city1 = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCityDealer"));
            Select dropdown_city1 = new Select(product_city1);
            dropdown_city1.selectByVisibleText("Bomdila");
            Thread.sleep(2000);

          /*  WebElement product_locality = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlLocality"));
            Select dropdown_locality = new Select(product_locality);
            dropdown_locality.selectByVisibleText("Bomdila");*/
            Thread.sleep(2000);

            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtfName")).sendKeys(name.randomIdentifier());
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtMobile")).sendKeys("8586076390");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtReportedTo")).sendKeys("8586076390");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtAddr1")).sendKeys("Bomdila");
            Thread.sleep(1000);
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtPincode")).sendKeys("263153");


            Thread.sleep(1000);

            WebElement customer_state = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlState"));
            Select dropdown_customer_state = new Select(customer_state);
            dropdown_customer_state.selectByValue("31");
            Thread.sleep(2000);


            Thread.sleep(2000);
            WebElement customer_city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlCity"));
            Select dropdown_customer_city = new Select(customer_city);
            dropdown_customer_city.selectByValue("708");
            Thread.sleep(2000);
            WebElement customer_locality = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddlLocality"));
            Select dropdown_customer_locality = new Select(customer_locality);
            dropdown_customer_locality.selectByValue("1502");

            Thread.sleep(2000);
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtLandMark")).sendKeys("sai mandir");
            login_page.driver.findElement(By.id("ContentPlaceHolder1_txtRemarks")).sendKeys("urgent");

            //** FAQ
      /* WebElement faq= login_page.driver.findElement(By.xpath("//form[@id='form1']/div[3]/main/div/div/div[5]/div/h6/label"));
       faq.click();

        Thread.sleep(1000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_txtQuestion")).sendKeys("led");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_btnSearch")).click();
        Thread.sleep(1000);

        WebElement faq_que = login_page.driver.findElement(By.id("ContentPlaceHolder1_ccfaq_ddlQuestion"));
        Select dropdown_faq_que = new Select(faq_que);
        dropdown_faq_que.selectByValue("2");
            Thread.sleep(1000);*/
            //** Close complaint
       /* WebElement trouble=login_page.driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_ccfaq_RadioButtonListSingleStage1']/tbody/tr/td/label"));
        trouble.click();
        Thread.sleep(1000);

        login_page.driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_UpdatePanel7']/span/label")).click();
*/

            //** for holding complaints
       /* WebElement webElement=login_page.driver.findElement(By.className("col-sm-3"));
        webElement.click();
        if (webElement.isSelected()){
            System.out.println("selected");
        }
        Thread.sleep(1000);
        WebElement hold = login_page.driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlHold"));
        Select dropdown_hold = new Select(hold);
        dropdown_hold.selectByVisibleText("Need a clarification");*/

            login_page.driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
            Thread.sleep(6000);

            String toast = login_page.driver.findElement(By.id("ContentPlaceHolder1_lblTicket")).getText();
            System.out.println(toast);
            //login_page.driver.findElement(By.id("ContentPlaceHolder1_LnkToCustomerSearch")).click();

            //tech_support.tech_f();


           login_page.driver.close();
        }





    }

}
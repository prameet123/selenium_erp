import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class product_registration {
    static String sr_number="swatianjali08";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.admin();
        login_page.driver.findElement(By.id("lnkDefault")).click();

        login_page.driver.findElement(By.linkText("Transactions")).click();
        login_page.driver.findElement(By.id("NavNavigation_dl_navigation_rpt_SubMenu_1_HyperLink1_5")).click();

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_name")).sendKeys("prameet");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_email")).sendKeys("prameet@yahoo.com");
        WebElement city = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_Country"));
        Select dropdown_city = new Select(city);
        dropdown_city.selectByVisibleText("India");

        WebElement state = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_State"));
        Select dropdown_state = new Select(state);
        dropdown_state.selectByVisibleText("UTTRAKHAND");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_dis")).sendKeys("Rudrapur");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_area")).sendKeys("sanajay nagar");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_pincode")).sendKeys("263153");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_contactno")).sendKeys("8979489949");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_company")).sendKeys("luminous");


        WebElement capacity = login_page.driver.findElement(By.id("ContentPlaceHolder1_ddl_capacity"));
        Select dropdown_capacity = new Select(capacity);
        dropdown_capacity.selectByVisibleText("UPS");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_srNo")).sendKeys(sr_number);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_dlrname")).sendKeys("pradeep");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_purchaseDist")).sendKeys("delhi");

        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_DOP")).click();
        List<WebElement> allDates2 = login_page.driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));


        for (WebElement ele : allDates2) {

            String date = ele.getText();


            if (date.equalsIgnoreCase("1")) {
                ele.click();
                break;
            }

        }
        login_page.driver.findElement(By.id("ContentPlaceHolder1_txt_msg")).sendKeys("condition ok");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_fuinvoice")).sendKeys("F:\\qwe.txt");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_btn_save")).click();
        String toast =login_page.driver.findElement(By.className("toast-message")).getText();
        System.out.println(toast);

    }
}

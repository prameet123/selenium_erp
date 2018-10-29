import org.openqa.selenium.By;

public class tech_support {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.techSuppor();
        login_page.driver.findElement(By.id("headingOne")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_hdncallsrno_1")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );



    }
}

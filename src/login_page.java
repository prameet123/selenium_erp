import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//** Login page

 class login_page {
     FirefoxDriver driver = new FirefoxDriver();

     public void customerExexcutive() {


         driver.get("http://103.43.40.23:2223/");

         //** login
         WebElement element = driver.findElement(By.xpath("//input[@name='txtUser']"));
         WebElement element1 = driver.findElement(By.xpath("//input[@name='txtPass']"));
         element.sendKeys("12244");
         element1.sendKeys("123");
         WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
         button.click();
     }

     public void techSuppor() {


         driver.get("http://103.43.40.23:2223/");

         //** login
         WebElement element = driver.findElement(By.xpath("//input[@name='txtUser']"));
         WebElement element1 = driver.findElement(By.xpath("//input[@name='txtPass']"));
         element.sendKeys("p01");
         element1.sendKeys("123");
         WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
         button.click();
     }

     public void admin() {


         driver.get("http://103.43.40.23:2223/");

         //** login
         WebElement element = driver.findElement(By.xpath("//input[@name='txtUser']"));
         WebElement element1 = driver.findElement(By.xpath("//input[@name='txtPass']"));
         element.sendKeys("admin");
         element1.sendKeys("SELF");
         WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
         button.click();
     }
 }

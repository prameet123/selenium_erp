import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class tech_support {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "F:\\software\\selenium\\geckodriver.exe");
        login_page login_page = new login_page();
        login_page.techSuppor();

        //**call status
        login_page.driver.findElement(By.id("lnkDefault")).click();
        login_page.driver.findElement(By.className("main_icon")).click();
        login_page.driver.findElement(By.linkText("Transaction")).click();
        login_page.driver.findElement(By.id("NavNavigation_rptrModule_rptrMenu_0_rptrSubMenu_0_hprSubMenu_0")).click();

        login_page.driver.findElement(By.cssSelector("div.col-sm-5 > div.complain-title > span")).click();
        login_page.driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_Rpt_CallResponse_rdbPhoneNumber_0']/tbody/tr/td/label")).click();
        Thread.sleep(1000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnCallCustomer_0")).click();
        Thread.sleep(1000);
        try {
            login_page.driver.findElement(By.cssSelector("tr:nth-child(5) label")).click();
        }
        catch (Exception e){
            System.out.println("failed due to no user");
        }
        Thread.sleep(1000);
        // ** update
        WebElement time = login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_Faq2_0_ddlAnsweredStatus_0"));
        Select dropdown_time = new Select(time);
        dropdown_time.selectByValue("7");
        Thread.sleep(1000);
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_Faq2_0_btnSaveFollowUp_0")).click();
        Thread.sleep(1000);
        //**FAQ
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ccfaq_0_txtQuestion_0")).sendKeys("ups");
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ccfaq_0_btnSearch_0")).click();
        Thread.sleep(1000);

        //QUESTION
        WebElement que = login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ccfaq_0_ddlQuestion_0"));
        Select dropdown_que = new Select(que);
        dropdown_que.selectByValue("1");
        Thread.sleep(1000);
        login_page.driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_Rpt_CallResponse_ccfaq_0_RadioButtonListSingleStage1_0']/tbody/tr/td/label")).click();
        //PROBLEM
        WebElement problem= login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ddlProblem_0"));
        Select dropdown_problem= new Select(problem);
        dropdown_problem.selectByValue("1");
        Thread.sleep(1000);
        //SUBPROBLEM
        WebElement sub_problem= login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ddlSubProblem_0"));
        Select dropdown_sub_problem= new Select(sub_problem);
        dropdown_sub_problem.selectByValue("2");
        Thread.sleep(1000);

        //ACTION
        WebElement action= login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ddlactiontaken_0"));
        Select dropdown_action= new Select(action);
        dropdown_action.selectByValue("18");
        Thread.sleep(1000);

        //INSTRUCTION
        WebElement instruction= login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_ddlInstruction_0"));
        Select dropdown_instruction= new Select(instruction);
        dropdown_instruction.selectByValue("1");
        Thread.sleep(1000);

       login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_BtnAdd_0")).click();
        Thread.sleep(1000);
       login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
       login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();
       //login_page.driver.close();

       /* login_page.driver.findElement(By.cssSelector("a.collapsed > div.row > div.col-sm-3 > div.complain-title > span")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();

        login_page.driver.findElement(By.cssSelector("a.collapsed > div.row > div.col-sm-3 > div.complain-title")).click();
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_txtRemarks_0")).sendKeys("this my remarks" );
        login_page.driver.findElement(By.id("ContentPlaceHolder1_Rpt_CallResponse_btnForword_0")).click();*/


    }
}

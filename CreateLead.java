package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    //WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"))
	    //Select dd=new Select(source);
	   // dd.selectByValue("LEAD_CONFERENCE");
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("bounteous");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pingmeatpriyankak@gmail.com");
	    WebElement stpr=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd=new Select(stpr);
	    dd.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println("Title:" + driver.getTitle());
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("bounteous1");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka1");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println("Title:" + driver.getTitle());
	    
	    
	    
	    
	    
	    

	}

}

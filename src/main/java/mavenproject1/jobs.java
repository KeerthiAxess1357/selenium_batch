package mavenproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jobs {
	// private static final String a = null;
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/innovix1/Documents/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.77:4202/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("9659716637");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("11022001");
		driver.findElement(By.xpath("//a[@class='btn rounded-pill pxp-modal-cta w-50 m-auto mt-3 a-enabled']")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//manage job
		driver.findElement(By.xpath("(//a[@class='nav-link text-primary'])[2]")).click();
		////job tittle
		driver.findElement(By.xpath("//a[@class='btn rounded-pill pxp-nav-btn']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='jobTitle']")).sendKeys("Developer");
		//vacancy
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("150");
          //job category
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-11']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search job category']")).sendKeys("Driver");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[4]")).click();
		//state
		driver.findElement(By.xpath("//span[text()='Select your State']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search state']")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		//district
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c85-14']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search district']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		//city
		driver.findElement(By.xpath("//span[text()='Select your City']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai North");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//gender
		driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]")).click();
		//job status
		driver.findElement(By.xpath("//select[@formcontrolname='jobStatusCd']")).click();
		//company about
		driver.findElement(By.xpath("//div[@class='NgxEditor']")).click();
		driver.findElement(By.xpath("//p[@class='NgxEditor__Placeholder']")).sendKeys("However, there are key components to make a convincing pitch with your brand story.");
		WebElement scroll =driver.findElement(By.xpath("(//label[@class='form-label'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		Thread.sleep(2000);
		
		//education
		driver.findElement(By.xpath("//span[text()='Select Education']")).click();
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Select Language']")).click();
        driver.findElement(By.xpath("//div[@class='mat-form-field-flex ng-tns-c85-21']")).click();
		//language
		driver.findElement(By.xpath("//span[text()='Select Language']")).click();
		driver.findElement(By.xpath("//span[text()=' English']")).click();
		
		//experience
		
		driver.findElement(By.xpath("//input[@placeholder='Min']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@placeholder='Max']")).sendKeys("3");
		
		
		//career level
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement dropdown_value=driver.findElement(By.xpath("//select[@formcontrolname='careerLevelSno']"));
	       Select select_val=new Select(dropdown_value);
	       Thread.sleep(1000);
	       select_val.selectByIndex(1);
	       Thread.sleep(1000);
	       //employment type
	       WebElement dro_value=driver.findElement(By.xpath("//select[@aria-invalid='false']"));
	       Select selt_val=new Select(dropdown_value);
	       Thread.sleep(1000);
	       select_val.selectByIndex(2);
	       Thread.sleep(1000);
	       //salary range
	       WebElement dr_value=driver.findElement(By.xpath("//select[@aria-invalid='false']"));
	       Select sel_val=new Select(dropdown_value);
	       Thread.sleep(1000);
	       select_val.selectByIndex(2);
           //
		
		//post job
		driver.findElement(By.xpath("//div[@class='mt-4 mt-lg-5 ng-star-inserted']")).click();       
	       
		// search company
		driver.findElement(By.xpath("//input[@placeholder='Search Job Category']")).click();
		  
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[7]")).click();
		driver.findElement(By.xpath("//i[@class='fa-solid fa-search fa-beat']")).click();
		driver.findElement(By.xpath("//a[@class='btn rounded pill pxp-section-cta mb-2 ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@class='mat-list-text']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
       Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='nav-item cursor ng-star-inserted'])[1]")).click();
		
		// search location
		driver.findElement(By.xpath("//input[@placeholder='Search Location']")).click();
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		driver.findElement(By.xpath("//i[@class='fa-solid fa-search fa-beat']")).click();
		WebElement view = driver.findElement(By.xpath(
				"(//a[@class='btn rounded pxp-section-cta mb-2 bg-light text-primary btn-outline-primary'])[2]"));
		view.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Apply Now']")).click();
		driver.findElement(By.xpath("//mat-pseudo-checkbox[@class='mat-pseudo-checkbox ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();

		//company search
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-link text-primary'])[3]")).click();
		driver.findElement(By.xpath("(//h3[@class='text-primary'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='btn rounded pill pxp-section-cta mb-2 ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn-close'])[6]")).click();
		//view open
		driver.findElement(By.xpath("//a[text()='View']")).click();
		driver.findElement(By.xpath("//button[text()='Apply Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn-close'])[6]")).click();

		// candidate add
		driver.findElement(By.xpath("(//a[text()='Candidates'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='btn rounded-pill pxp-section-cta ms-2'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='candidateName']")).sendKeys("keerthi");
		//last name
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("T");
		Thread.sleep(2000);
		//gender
		driver.findElement(By.xpath("(//span[@class='mat-radio-inner-circle'])[2]")).click();
		Thread.sleep(2000);
		//
		driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[4]")).click();
		//calender
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		driver.findElement(By.xpath("//button[@aria-live='polite']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[8]")).click();
		//job rule
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-10']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search job category']")).sendKeys("Cook");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		Thread.sleep(2000);
		//phone no
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("2454521245");
		//email
		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("keerthana@innovixtech.com");
		Thread.sleep(2000);
		//scrolls
		WebElement scroll1 =driver.findElement(By.xpath("(//label[@class='form-label'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",scroll1);
		Thread.sleep(2000);
		//State 
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-14']")).click();
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		Thread.sleep(2000);
		//district
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-16']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search district']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		//city
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-18']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai North");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@formcontrolname='about']")).sendKeys("gchjfvcadgjvfhadgfbjadsmbfhdasmbfhwabvhbvfhjdbfv");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='skillName']")).sendKeys("python");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//edit
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Candidates'])[1]")).click();
//		driver.findElement(By.xpath("(//mat-icon[text()='more_vert'])[1]")).click();
//		driver.findElement(By.xpath("//button[@title='Edit profile']")).click();
//		//name
//		driver.findElement(By.xpath("//input[@formcontrolname='candidateName']")).sendKeys("rose");
//		//last name
//		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("d");
//		Thread.sleep(2000);
//		//gender
//		driver.findElement(By.xpath("(//span[@class='mat-radio-inner-circle'])[2]")).click();
//		Thread.sleep(2000);
//		//
//		driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[4]")).click();
//		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
//		Thread.sleep(2000);
//		//calender
//		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[8]")).click();
//		//job rule
//		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-10']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search job category']")).sendKeys("Cook");
//		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
//		Thread.sleep(2000);
//		//phone no
//		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("2454521245");
//		//email
//		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).click();
//		Thread.sleep(2000);
//		//scrolls
//		WebElement scroll =driver.findElement(By.xpath("(//label[@class='form-label'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
//		Thread.sleep(2000);
//		//State 
//		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-14']")).click();
//		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
//		Thread.sleep(2000);
//		//district
//		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-16']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search district']")).sendKeys("Chennai");
//		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
//		//city
//		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c91-18']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai North");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
//		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//textarea[@formcontrolname='about']")).sendKeys("gchjfvcadgjvfhadgfbjadsmbfhdasmbfhwabvhbvfhjdbfv");
//		//Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='skillName']")).sendKeys("python");
//		Thread.sleep(2000);
//		WebElement scroll1 =driver.findElement(By.xpath("(//label[@class='form-label'])[4]"));
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll1);
//		//view
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Candidates'])[1]")).click();
//		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base'])[1]")).click();
//		driver.findElement(By.xpath("//button[@title='View profile']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@aria-label='Close'])[10]")).click();
//		//email
//		driver.findElement(By.xpath("(//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@title='Send message']")).click();
//////		
////		
//		//Application view
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Applications'])[1]")).click();
//		//view 
//		driver.findElement(By.xpath("(//button[@aria-haspopup='menu'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@data-bs-toggle='modal']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@aria-label='Close'])[9]")).click();
//		//email view 
//		driver.findElement(By.xpath("(//button[@aria-haspopup='menu'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@role='menuitem'])[2]")).click();
//
//		//subscribtion view
//		
//		driver.findElement(By.xpath("//a[text()='Subscription']")).click();
//		driver.findElement(By.xpath("//a[text()='Pay Now']")).click();
//		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")).click();
//		
//		
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		//driver.findElement(By.xpath("//input[@class='input-one-click-checkout phone-field-one-click-checkout main svelte-7ry4wr']")).sendKeys("6374624200");
//		
//		//input[@class='input-one-click-checkout phone-field-one-click-checkout main svelte-7ry4wr']
//		//Alert a =driver.switchTo().alert();
//		//a.accept();
//		driver.switchTo().frame(1);
//		WebElement alertbtn = driver.findElement(By.xpath("//button[@class='modal-close svelte-1yccqyb']"));
//		alertbtn.click();
////		Alert a =driver.switchTo().alert();
//		a.accept();
	    
		// notification search
//		driver.findElement(By.xpath("//li[@class='nav-item my_class1 ng-star-inserted']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' verification was successfully verified by myjob team.']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@class='nav-item my_class1 ng-star-inserted']")).click();
//		driver.findElement(By.xpath("(//div[@class='pxp-dashboard-notifications-item-message'])[3]")).click();
		// view profile
//		driver.findElement(By.xpath("//div[@class='dropbtn d-flex']")).click();
//		driver.findElement(By.xpath("//a[text()='View profile']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='dropbtn d-flex']")).click();
//		driver.findElement(By.xpath("(//a[text()='Change password'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@data-bs-dismiss='modal'])[5]")).click();


	}
}


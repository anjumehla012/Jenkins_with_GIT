package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	
public WebDriver driver;

@BeforeMethod
@Parameters("browsername")
public void open_browser(String browsername)
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();
	}
	else if (browsername.equalsIgnoreCase("edge"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new EdgeDriver();
	}
	
	else 
	{
		System.out.println(browsername +"Browser not Supported");
	}
	
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@AfterMethod
public void close_browser()
{
	if(driver!=null)
	{
		driver.quit();
	}
}
}

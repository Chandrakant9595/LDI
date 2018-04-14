package LifeStyleDesignInternational.LDI;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
	
	static Properties properties;
	public static WebDriver driver;
	
	/*public static void loadData() throws IOException{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"/target/TestData.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
	}
	
	public static String getObject(String Data) throws IOException{
		loadData();
		String data = properties.getProperty(Data);
		return data;
	}*/
  
	@BeforeClass
	public void testSetup(){
		
		// To run scripts on chrome browser
		System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	} 
} 

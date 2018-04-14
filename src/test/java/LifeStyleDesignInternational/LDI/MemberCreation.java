package LifeStyleDesignInternational.LDI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MemberCreation extends TestBase {
	
	public static String emidid;
	String mail;
	
  @Test
  public void scripts() throws IOException, InterruptedException, AWTException {
	  
	  login();
	  createMember();
	  assignL1();
	  runRotator();
	  logout();
  }
  
  public void login() throws IOException{

	  String url = "http://admin.lifestyledesigninternational.com";
	  driver.get(url);
	  
	  String uName = "sample";
	  driver.findElement(By.name("uname")).sendKeys(uName);
	  
	  String password= (".gg123x1");
	  driver.findElement(By.name("pass")).sendKeys(password);
	  
	  driver.findElement(By.xpath(".//*[@id='form_content']/table/tbody/tr/td/table/tbody/tr[3]/td/input")).submit();
  }
  
  public void createMember() throws InterruptedException, AWTException{
	  
	  //mouse over on member menu
	  WebElement button = driver.findElement(By.xpath("html/body/div[1]/font/font/table/tbody/tr/td[2]/ul/li[1]/a"));
  	  Actions actions = new Actions(driver);
  	  actions.moveToElement(button).perform(); 
  	  Thread.sleep(2000);
  	  
  	  //Click on add member link
  	  driver.findElement(By.linkText("Add Member")).click();
  	  
  	  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  //get current date time with Date()
	  Date date = new Date();
	  System.out.println(dateFormat.format(date));
	  String sdate = date.toString();
	  System.out.println("test "+sdate);
	   
	  String[] parts = sdate.split(" "); 
	  String part1 = parts[0]; 
	  String part2 = parts[1];
	  String part3 = parts[2];
	  String part4 = parts[3];
	  String part5 = parts[4];
	  String part6 = parts[5];
	   
	  System.out.println(part1);
	  System.out.println(part2);// month
	  System.out.println(part3); // date 
	  System.out.println(part4);
	  System.out.println(part5);
	  System.out.println(part6);//year
	   
	  String fdate = (part3+part2+part6);
	  System.out.println(fdate); // print current date
	   
	  String ctime = part4.toString();
	  System.out.println(ctime);
	   
	  String[] partstime = ctime.split(":");
	  String part7 = partstime[0]; 
	  String part8 = partstime[1];
	  String part9 = partstime[2];
	   
	  System.out.println(part7); // hr
	  System.out.println(part8); // min
	  System.out.println(part9); //sec
	   
	  String ftime = (part7+part8);
	  System.out.println(ftime);

	  String fdttime = (fdate+ftime);
	  System.out.println(fdttime);
	  
	  //first name
	  String fname ="Test"+ fdate;
	  driver.findElement(By.name("first_name")).sendKeys(fname);
	  
	  //last name
	  driver.findElement(By.name("last_name")).sendKeys("Member");
	  
	  //email
	  mail= fdttime + "@nadsofttest.com";
	  driver.findElement(By.name("email")).sendKeys(mail);
	  
	  //phone number
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[4]/td[2]/div/div/div")).click();
	  Thread.sleep(1000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_I);
	  robot.keyRelease(KeyEvent.VK_I);
	  robot.keyPress(KeyEvent.VK_N);
	  robot.keyRelease(KeyEvent.VK_N);
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.name("phone")).sendKeys("09595455315");
	  Thread.sleep(1000);
	  
	  WebElement buttonSubmit = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input"));
  	  Actions actionsSubmit = new Actions(driver);
  	  actionsSubmit.moveToElement(buttonSubmit).perform();
  	  Thread.sleep(3000);
	  //submit
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input")).click();
	  Thread.sleep(2000);
	  
	  String message = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/b/font")).getText();
	  if(message.equals("MISSING: The New Member's Phone number.")){
		  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input")).click();
		  Thread.sleep(2000);
	  }else{
		//see details
		  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/b/font/a")).click();
		  Thread.sleep(500);  
	  }
  }
  
  public void assignL1() throws InterruptedException, AWTException{
	  
	  //edit pencil
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/form/input[2]")).click();
	  Thread.sleep(500);
	  
	  //l1 drop down
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/form/select")).click();
	  Robot robot = new Robot();
	  Thread.sleep(300);
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  //update
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/form/button")).click();
  }
  
  public void runRotator() throws AWTException, InterruptedException{
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_T);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_T);
	  
	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  driver.get("https://da.lifestyledesigninternational.com/crons/zoho/create_member.php");
	  Thread.sleep(10000);
	  
	  driver.navigate().refresh();
	  Thread.sleep(10000);
	  
	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
	
  }
  
  public void logout() throws InterruptedException{
	  
	  driver.findElement(By.xpath("html/body/div[1]/div/div/a/font")).click();
	  Thread.sleep(3000);
  }
}

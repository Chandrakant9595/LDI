package LifeStyleDesignInternational.LDI;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StepUnlockProcess extends MemberCreation{
	
	public static JavascriptExecutor jse;
	
  @Test
  public void scripts() throws IOException, InterruptedException, AWTException {
	  
	  login();
	  searchMember();
	  step1to5();
	  addNote6b();
	  unlock6A6B();
	  addL2andStepUnlock16();
	  unlock7to16();
	  assignTrafficCoachAndUnlock16_4();
	  unlock16_2To16_4();
	  logout();
  }
  
  public void searchMember() throws InterruptedException{
	  
	WebElement button = driver.findElement(By.xpath("html/body/div[1]/font/font/table/tbody/tr/td[2]/ul/li[1]/a"));
  	Actions actions = new Actions(driver);           
  	actions.moveToElement(button).perform(); 
  	Thread.sleep(2000);
  	  
  	//Click on add member link
  	driver.findElement(By.linkText("Search")).click();
  	Thread.sleep(1000);
  	
  	//search button
  	driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table[1]/tbody/tr/td[12]/input")).click();
  	Thread.sleep(2000);
  	
  	//note
  	driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table/tbody/tr[1]/td[16]/a[1]")).click();
  	Thread.sleep(1000);
  	
  	//quick link login
  	WebElement link = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/div/a[2]/span"));
  	Actions drop = new Actions(driver);
  	drop.moveToElement(link).perform(); 
  	Thread.sleep(2000);
  	
  	driver.findElement(By.linkText("Login »")).click();
  }
  
  public void step1to5() throws InterruptedException{
	  
	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,1000)");  
	  Thread.sleep(2000);
	  //start training button
	  driver.findElement(By.xpath(".//*[@id='welcome-page']/div/div/div/div[2]/div[2]/a")).click();
	  Thread.sleep(2000);
	  
	  //continue button 
	  driver.findElement(By.xpath(".//*[@id='content']/div/div/div[2]/div/div[1]/div/a")).click();
	  Thread.sleep(5000);
	  
	  //step 1
	  String msg1 = driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/div[1]/div/h2")).getText();
	  String msg2 = "How One Simple Formula Literally BREEDS Multi-Millionaires";
	  Assert.assertEquals(msg1, msg2);
	  Thread.sleep(2000);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 1 ");
	  Thread.sleep(5000);
	  
	  //step 2 
	  String msg3 = driver.getCurrentUrl();
	  String msg4 = "https://my.lifestyledesigninternational.com/training.php?step=1.2";                  
	  Assert.assertEquals(msg3, msg4);
	  Thread.sleep(2000);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 2 ");
	  Thread.sleep(5000);
	  
	  //step 3
	  String msg5 = driver.getCurrentUrl();
	  String msg6 = "https://my.lifestyledesigninternational.com/training.php?step=1.3";
	  Assert.assertEquals(msg5, msg6);
	  Thread.sleep(2000);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 3 ");
	  Thread.sleep(5000);
	  
	  //step 4
	  String msg7 = driver.getCurrentUrl();
	  String msg8 = "https://my.lifestyledesigninternational.com/training.php?step=1.4";
	  Assert.assertEquals(msg7, msg8);
	  Thread.sleep(2000);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 4 ");
	  Thread.sleep(5000);
	  
	  //step 5 
	  WebElement my = driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/a"));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(my).perform(); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/div/a[1]")).click();
	  Thread.sleep(1000);
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,1500)");  
	  Thread.sleep(1000);
	  
	  //NDA
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/a")).click();
	  Thread.sleep(2000);
	  
	  //name
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]/section/div/form/div/p[2]/input[1]")).sendKeys("Testuser");
	  Thread.sleep(1000);
	  
	  //mailling address
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]/section/div/form/div/p[2]/input[2]")).sendKeys("TestAddress");
	  Thread.sleep(1000);
	 
	  //Second Party
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]/section/div/form/div/div[2]/div[2]/p[4]/input")).sendKeys("TestUser");
	  Thread.sleep(1000);
	  
	  //signature
	  String abc = "[{\"lx\":77,\"ly\":43,\"mx\":77,\"my\":42},{\"lx\":77,\"ly\":45,\"mx\":77,\"my\":43},{\"lx\":77,\"ly\":53,\"mx\":77,\"my\":45},{\"lx\":79,\"ly\":59,\"mx\":77,\"my\":53},{\"lx\":79,\"ly\":63,\"mx\":79,\"my\":59},{\"lx\":79,\"ly\":65,\"mx\":79,\"my\":63},{\"lx\":80,\"ly\":68,\"mx\":79,\"my\":65},{\"lx\":80,\"ly\":70,\"mx\":80,\"my\":68},{\"lx\":80,\"ly\":73,\"mx\":80,\"my\":70},{\"lx\":80,\"ly\":74,\"mx\":80,\"my\":73},{\"lx\":81,\"ly\":75,\"mx\":80,\"my\":74},{\"lx\":81,\"ly\":77,\"mx\":81,\"my\":75},{\"lx\":80,\"ly\":78,\"mx\":81,\"my\":77},{\"lx\":79,\"ly\":78,\"mx\":80,\"my\":78},{\"lx\":78,\"ly\":78,\"mx\":79,\"my\":78},{\"lx\":77,\"ly\":79,\"mx\":78,\"my\":78},{\"lx\":75,\"ly\":79,\"mx\":77,\"my\":79},{\"lx\":73,\"ly\":79,\"mx\":75,\"my\":79},{\"lx\":72,\"ly\":79,\"mx\":73,\"my\":79},{\"lx\":70,\"ly\":79,\"mx\":72,\"my\":79},{\"lx\":69,\"ly\":79,\"mx\":70,\"my\":79},{\"lx\":68,\"ly\":79,\"mx\":69,\"my\":79},{\"lx\":67,\"ly\":78,\"mx\":68,\"my\":79},{\"lx\":65,\"ly\":78,\"mx\":67,\"my\":78},{\"lx\":64,\"ly\":77,\"mx\":65,\"my\":78},{\"lx\":63,\"ly\":76,\"mx\":64,\"my\":77},{\"lx\":62,\"ly\":75,\"mx\":63,\"my\":76},{\"lx\":61,\"ly\":74,\"mx\":62,\"my\":75},{\"lx\":60,\"ly\":73,\"mx\":61,\"my\":74},{\"lx\":58,\"ly\":71,\"mx\":60,\"my\":73},{\"lx\":56,\"ly\":69,\"mx\":58,\"my\":71},{\"lx\":56,\"ly\":68,\"mx\":56,\"my\":69},{\"lx\":54,\"ly\":66,\"mx\":56,\"my\":68},{\"lx\":54,\"ly\":63,\"mx\":54,\"my\":66},{\"lx\":54,\"ly\":61,\"mx\":54,\"my\":63},{\"lx\":54,\"ly\":59,\"mx\":54,\"my\":61},{\"lx\":54,\"ly\":58,\"mx\":54,\"my\":59},{\"lx\":55,\"ly\":56,\"mx\":54,\"my\":58},{\"lx\":56,\"ly\":56,\"mx\":55,\"my\":56},{\"lx\":58,\"ly\":55,\"mx\":56,\"my\":56},{\"lx\":60,\"ly\":55,\"mx\":58,\"my\":55},{\"lx\":63,\"ly\":55,\"mx\":60,\"my\":55},{\"lx\":66,\"ly\":53,\"mx\":63,\"my\":55},{\"lx\":69,\"ly\":53,\"mx\":66,\"my\":53},{\"lx\":73,\"ly\":53,\"mx\":69,\"my\":53},{\"lx\":78,\"ly\":52,\"mx\":73,\"my\":53},{\"lx\":83,\"ly\":52,\"mx\":78,\"my\":52},{\"lx\":89,\"ly\":52,\"mx\":83,\"my\":52},{\"lx\":93,\"ly\":52,\"mx\":89,\"my\":52},{\"lx\":96,\"ly\":52,\"mx\":93,\"my\":52},{\"lx\":99,\"ly\":52,\"mx\":96,\"my\":52},{\"lx\":101,\"ly\":52,\"mx\":99,\"my\":52},{\"lx\":103,\"ly\":52,\"mx\":101,\"my\":52},{\"lx\":104,\"ly\":52,\"mx\":103,\"my\":52},{\"lx\":105,\"ly\":52,\"mx\":104,\"my\":52},{\"lx\":106,\"ly\":52,\"mx\":105,\"my\":52},{\"lx\":107,\"ly\":51,\"mx\":106,\"my\":52},{\"lx\":107,\"ly\":49,\"mx\":107,\"my\":51},{\"lx\":107,\"ly\":48,\"mx\":107,\"my\":49},{\"lx\":106,\"ly\":47,\"mx\":107,\"my\":48},{\"lx\":104,\"ly\":47,\"mx\":106,\"my\":47},{\"lx\":103,\"ly\":46,\"mx\":104,\"my\":47},{\"lx\":100,\"ly\":46,\"mx\":103,\"my\":46},{\"lx\":99,\"ly\":46,\"mx\":100,\"my\":46},{\"lx\":98,\"ly\":46,\"mx\":99,\"my\":46},{\"lx\":97,\"ly\":46,\"mx\":98,\"my\":46},{\"lx\":95,\"ly\":46,\"mx\":97,\"my\":46},{\"lx\":94,\"ly\":46,\"mx\":95,\"my\":46},{\"lx\":93,\"ly\":47,\"mx\":94,\"my\":46},{\"lx\":93,\"ly\":50,\"mx\":93,\"my\":47},{\"lx\":93,\"ly\":53,\"mx\":93,\"my\":50},{\"lx\":93,\"ly\":57,\"mx\":93,\"my\":53},{\"lx\":93,\"ly\":59,\"mx\":93,\"my\":57},{\"lx\":94,\"ly\":63,\"mx\":93,\"my\":59},{\"lx\":95,\"ly\":65,\"mx\":94,\"my\":63},{\"lx\":96,\"ly\":67,\"mx\":95,\"my\":65},{\"lx\":96,\"ly\":69,\"mx\":96,\"my\":67},{\"lx\":97,\"ly\":70,\"mx\":96,\"my\":69},{\"lx\":98,\"ly\":73,\"mx\":97,\"my\":70},{\"lx\":99,\"ly\":74,\"mx\":98,\"my\":73},{\"lx\":100,\"ly\":75,\"mx\":99,\"my\":74},{\"lx\":103,\"ly\":75,\"mx\":100,\"my\":75},{\"lx\":105,\"ly\":75,\"mx\":103,\"my\":75},{\"lx\":108,\"ly\":75,\"mx\":105,\"my\":75},{\"lx\":111,\"ly\":75,\"mx\":108,\"my\":75},{\"lx\":116,\"ly\":75,\"mx\":111,\"my\":75},{\"lx\":119,\"ly\":75,\"mx\":116,\"my\":75},{\"lx\":124,\"ly\":75,\"mx\":119,\"my\":75},{\"lx\":126,\"ly\":75,\"mx\":124,\"my\":75},{\"lx\":130,\"ly\":73,\"mx\":126,\"my\":75},{\"lx\":131,\"ly\":72,\"mx\":130,\"my\":73}]";
	  
	  jse.executeScript("document.getElementsByName('signatureOutput')[0].setAttribute('value', '"+abc+"');");
	  
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]/section/div/form/div/p[20]/button")).click(); 
	  Thread.sleep(3000);
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,-1500)");  
	  Thread.sleep(2000);
	  
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step 5");
	  Thread.sleep(5000);
	  
	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
  }
  
  public void addNote6b() throws InterruptedException{
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1500);
	  
	  //Next Step To Unlock
	  WebElement stepUnlock = driver.findElement(By.name("step_unlocked"));
	  Select dropStepUnlock = new Select(stepUnlock);
	  dropStepUnlock.selectByVisibleText("Step-6 (Part B) <-Checkpoint");
	  Thread.sleep(500);
	  
	  //L1 Coach Status:
	  WebElement l1Status = driver.findElement(By.name("progress_status_id"));
	  Select dropL1Status = new Select(l1Status);
	  dropL1Status.selectByVisibleText("Funding");
	  Thread.sleep(500);
	  
	  //Ap Status
	  WebElement apStatus = driver.findElement(By.name("progress_status_pa_id"));
	  Select dropAPStatus = new Select(apStatus);
	  dropAPStatus.selectByVisibleText("1st Attempt");
	  Thread.sleep(500);
	  
	  //Progress note
	  driver.findElement(By.name("note")).sendKeys("Unlock step 6 B");
	  
	  //hot level
	  WebElement hotLevel = driver.findElement(By.name("hot_level"));
	  Select dropHotLevel = new Select(hotLevel);
	  dropHotLevel.selectByVisibleText("Cold");
	  Thread.sleep(500);
	  
	  //save
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input")).click();
	  Thread.sleep(2000);
	  
	  //verify the note
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1000);
	  
	  String msg1 = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[5]/tbody/tr/td[6]")).getText();
	  String msg2 = "Unlock step 6 B";
	  Assert.assertEquals(msg1, msg2);
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, -600)");  
	  Thread.sleep(1000);
	  
	  //quick link login
	  WebElement link = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/div/a[2]/span"));
	  Actions drop = new Actions(driver);
	  drop.moveToElement(link).perform(); 
	  Thread.sleep(2000);
	  	
	  driver.findElement(By.linkText("Login »")).click();
  }
  
  public void unlock6A6B() throws InterruptedException{
	  
	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  //My training menu
	  WebElement my = driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/a"));
	  Actions actions = new Actions(driver);       
	  actions.moveToElement(my).perform(); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/div/a[1]")).click();
	  Thread.sleep(2000);          
	  
	  //Step 6 a
	  String msg1 = driver.getCurrentUrl();
	  String msg2 = "https://my.lifestyledesigninternational.com/training.php?step=1.6a";
	  Assert.assertEquals(msg1, msg2);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 6 A ");
	  Thread.sleep(5000);
	  
	  //Step 6 b
	  String msg3 = driver.getCurrentUrl();
	  String msg4 = "https://my.lifestyledesigninternational.com/training.php?step=1.6b";
	  Assert.assertEquals(msg3, msg4);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 6 B ");
	  Thread.sleep(5000);

	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
  }
  
  public void addL2andStepUnlock16() throws InterruptedException, AWTException{
	  
	  //assign L2 coach 
	  //edit pencil
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/form/input[2]")).click();
	  Thread.sleep(500);
	  
	  //l2 drop down
	  WebElement l2Value = driver.findElement(By.name("coach_id_scale"));
	  Select dropL2 = new Select(l2Value);
	  dropL2.selectByVisibleText("[L2] Tanya Watson (5461: Tanya)");
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/form/button")).click();
	  Thread.sleep(2000);
	  
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1500);
	  
	  //Next Step To Unlock
	  WebElement stepUnlock = driver.findElement(By.name("step_unlocked"));
	  Select dropStepUnlock = new Select(stepUnlock);
	  dropStepUnlock.selectByVisibleText("Step-16 (Session 1) <-Checkpoint");
	  Thread.sleep(500);
	  
	  //L1 Coach Status:
	  WebElement l1Status = driver.findElement(By.name("progress_status_id"));
	  Select dropL1Status = new Select(l1Status);       
	  dropL1Status.selectByVisibleText("No answer - LVM");
	  Thread.sleep(500);
	  
	  //Ap Status
	  WebElement apStatus = driver.findElement(By.name("progress_status_pa_id"));
	  Select dropAPStatus = new Select(apStatus);       
	  dropAPStatus.selectByVisibleText("2nd Attempt");
	  Thread.sleep(500);
	  
	  //Progress note
	  driver.findElement(By.name("note")).sendKeys("Unlock step 16");
	  
	  //hot level
	  WebElement hotLevel = driver.findElement(By.name("hot_level"));
	  Select dropHotLevel = new Select(hotLevel);
	  dropHotLevel.selectByVisibleText("Cold");
	  Thread.sleep(500);
	  
	  //save
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input")).click();
	  Thread.sleep(2000);
	  
	  //verify the note
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1000);
	  
	  String msg1 = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[5]/tbody/tr[1]/td[6]")).getText();
	  String msg2 = "Unlock step 16";
	  Assert.assertEquals(msg1, msg2);
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, -600)");  
	  Thread.sleep(1000);
	  
	  //quick link login
	  WebElement link = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/div/a[2]/span"));
	  Actions drop = new Actions(driver);
	  drop.moveToElement(link).perform(); 
	  Thread.sleep(2000);
	  	
	  driver.findElement(By.linkText("Login »")).click();
  }
  
  public void unlock7to16() throws InterruptedException{
	  
	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  //My training menu
	  WebElement my = driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/a"));
	  Actions actions = new Actions(driver);       
	  actions.moveToElement(my).perform(); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/div/a[1]")).click();
	  Thread.sleep(2000);          
	  
	  //Step 7
	  String msg1 = driver.getCurrentUrl();
	  String msg2 = "https://my.lifestyledesigninternational.com/training.php?step=1.7";
	  Assert.assertEquals(msg1, msg2);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 7");
	  Thread.sleep(5000);
	  
	  //Step 8
	  String msg3 = driver.getCurrentUrl();
	  String msg4 = "https://my.lifestyledesigninternational.com/training.php?step=1.8";
	  Assert.assertEquals(msg3, msg4);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 8");
	  Thread.sleep(5000);
	  
	  //Step 9
	  String msg5 = driver.getCurrentUrl();
	  String msg6 = "https://my.lifestyledesigninternational.com/training.php?step=1.9";
	  Assert.assertEquals(msg5, msg6);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 9");
	  Thread.sleep(5000);
	  
	  //Step 10
	  String msg7 = driver.getCurrentUrl();
	  String msg8 = "https://my.lifestyledesigninternational.com/training.php?step=1.10";
	  Assert.assertEquals(msg7, msg8);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 10");
	  Thread.sleep(5000);
	  
	  //Step 11
	  String msg9 = driver.getCurrentUrl();
	  String msg10 = "https://my.lifestyledesigninternational.com/training.php?step=1.11";
	  Assert.assertEquals(msg9, msg10);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 11");
	  Thread.sleep(5000);
	  
	  //Step 12
	  String msg11 = driver.getCurrentUrl();
	  String msg12 = "https://my.lifestyledesigninternational.com/training.php?step=1.12";
	  Assert.assertEquals(msg11, msg12);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 12");
	  Thread.sleep(5000);
	  
	  //Step 13
	  String msg13 = driver.getCurrentUrl();
	  String msg14 = "https://my.lifestyledesigninternational.com/training.php?step=1.13";
	  Assert.assertEquals(msg13, msg14);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 13");
	  Thread.sleep(5000);
	  
	  //Step 14
	  String msg15 = driver.getCurrentUrl();
	  String msg16 = "https://my.lifestyledesigninternational.com/training.php?step=1.14";
	  Assert.assertEquals(msg15, msg16);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 14");
	  Thread.sleep(5000);
	  
	  //Step 15
	  String msg17 = driver.getCurrentUrl();
	  String msg18 = "https://my.lifestyledesigninternational.com/training.php?step=1.15";
	  Assert.assertEquals(msg17, msg18);
	  jse.executeScript("document.getElementById('nextStep').click();");
	  System.out.println("Step - 15");
	  Thread.sleep(5000);
	  
	  //Step 16 s-1
	  //checkbox
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  Thread.sleep(5000);
	  
	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
  }
  
  public void assignTrafficCoachAndUnlock16_4() throws InterruptedException{
	  
	  //edit pencil of traffice coach
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/input[2]")).click();
	  Thread.sleep(500);
	  
	  //Traffic drop down
	  WebElement tcValue = driver.findElement(By.name("coach_id_traffic"));
	  Select dropTC = new Select(tcValue);
	  dropTC.selectByVisibleText("[T] Dan Martin (4864: DanMartin)");
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/button")).click();
	  Thread.sleep(2000);
	  
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1500);
	  
	  //Next Step To Unlock
	  WebElement stepUnlock = driver.findElement(By.name("step_unlocked"));
	  Select dropStepUnlock = new Select(stepUnlock);
	  dropStepUnlock.selectByVisibleText("Traffic Step-11");
	  Thread.sleep(500);
	  
	  //L1 Coach Status:
	  WebElement l1Status = driver.findElement(By.name("progress_status_id"));
	  Select dropL1Status = new Select(l1Status);       
	  dropL1Status.selectByVisibleText("No sale");
	  Thread.sleep(500);
	  
	  //Ap Status
	  WebElement apStatus = driver.findElement(By.name("progress_status_pa_id"));
	  Select dropAPStatus = new Select(apStatus);       
	  dropAPStatus.selectByVisibleText("3rd Attempt");
	  Thread.sleep(500);
	  
	  //Progress note
	  driver.findElement(By.name("note")).sendKeys("Unlock step Traffice steps");
	  
	  //hot level
	  WebElement hotLevel = driver.findElement(By.name("hot_level"));
	  Select dropHotLevel = new Select(hotLevel);
	  dropHotLevel.selectByVisibleText("Cold");
	  Thread.sleep(500);
	  
	  //save
	  driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/form/table/tbody/tr[6]/td[2]/input")).click();
	  Thread.sleep(2000);
	  
	  //verify the note
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, 600)");  
	  Thread.sleep(1000);
	  
	  String msg1 = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/table[5]/tbody/tr[1]/td[6]")).getText();
	  String msg2 = "Unlock step Traffice steps";
	  Assert.assertEquals(msg1, msg2);
	  
	  jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0, -600)");  
	  Thread.sleep(1000);
	  
	  //quick link login
	  WebElement link = driver.findElement(By.xpath("html/body/font/font/table/tbody/tr/td/div/a[2]/span"));
	  Actions drop = new Actions(driver);
	  drop.moveToElement(link).perform(); 
	  Thread.sleep(2000);
	  	
	  driver.findElement(By.linkText("Login »")).click();
  }
  
  public void unlock16_2To16_4() throws InterruptedException{
	  
	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  //My training menu
	  WebElement my = driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/a"));
	  Actions actions = new Actions(driver);       
	  actions.moveToElement(my).perform(); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/div/a[1]")).click();
	  Thread.sleep(2000);
	  
	  //Step 16 s-2
	  //checkbox
	  String msg1 = driver.getCurrentUrl();
	  String msg2 = "https://my.lifestyledesigninternational.com/training.php?step=1.16s2";
	  Assert.assertEquals(msg1, msg2);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(4000);          
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  Thread.sleep(5000);    
	  
	  //Step 16 s-3
	  //checkbox
	  String msg3 = driver.getCurrentUrl();
	  String msg4 = "https://my.lifestyledesigninternational.com/training.php?step=1.16s3";
	  Assert.assertEquals(msg3, msg4);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[2]/div/form/label/input[2]")).click();
	  Thread.sleep(4000);              
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[2]/div/form/div/button")).click();
	  Thread.sleep(5000);   
	  
	  //Step 16 s-4
	  //checkbox
	  String msg5 = driver.getCurrentUrl();
	  String msg6 = "https://my.lifestyledesigninternational.com/training.php?step=1.16s4";
	  Assert.assertEquals(msg5, msg6);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(4000);                   
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  Thread.sleep(5000); 
	  
	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
  }
}


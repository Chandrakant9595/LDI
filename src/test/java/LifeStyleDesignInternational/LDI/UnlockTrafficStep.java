package LifeStyleDesignInternational.LDI;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnlockTrafficStep extends StepUnlockProcess {
	
  @Test
  public void scripts() throws IOException, InterruptedException {
	  
	  login();
	  searchMember();
	  unlockTrafficSteps();
	  logout();
  }
  
  public void unlockTrafficSteps() throws InterruptedException{
	  

	  String winHandleBefore = driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  
	  WebElement button = driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/a"));
	  Actions actions = new Actions(driver);           
	  actions.moveToElement(button).perform(); 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/header/section/nav/div/div[2]/div/div[1]/div/a[2]")).click();
	  Thread.sleep(2000);
	  
	  //Intro step
	  String msg1 = driver.getCurrentUrl();
	  String msg2 = "https://my.lifestyledesigninternational.com/traffic.php?step=400";
	  Assert.assertEquals(msg1, msg2);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Introduction step");
	  Thread.sleep(5000);
	  
	  //Step 1
	  String msg3 = driver.getCurrentUrl();
	  String msg4 = "https://my.lifestyledesigninternational.com/traffic.php?step=401";
	  Assert.assertEquals(msg3, msg4);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 1");
	  Thread.sleep(5000);
	  
	  //Step 2
	  String msg5 = driver.getCurrentUrl();
	  String msg6 = "https://my.lifestyledesigninternational.com/traffic.php?step=402";
	  Assert.assertEquals(msg5, msg6);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 2");
	  Thread.sleep(5000);
	  
	  //Step 3
	  String msg7 = driver.getCurrentUrl();
	  String msg8 = "https://my.lifestyledesigninternational.com/traffic.php?step=403";
	  Assert.assertEquals(msg7, msg8);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);          
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 3");
	  Thread.sleep(5000);
	  
	  //Step 4
	  String msg9 = driver.getCurrentUrl();
	  String msg10 = "https://my.lifestyledesigninternational.com/traffic.php?step=404";
	  Assert.assertEquals(msg9, msg10);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 4");
	  Thread.sleep(5000);
	  
	  //Step 5
	  String msg11 = driver.getCurrentUrl();
	  String msg12 = "https://my.lifestyledesigninternational.com/traffic.php?step=405";
	  Assert.assertEquals(msg11, msg12);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 5");
	  Thread.sleep(5000);
	  
	  //Step 6
	  String msg13 = driver.getCurrentUrl();
	  String msg14 = "https://my.lifestyledesigninternational.com/traffic.php?step=406";
	  Assert.assertEquals(msg13, msg14);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 6");
	  Thread.sleep(5000);
	  
	  //Step 7
	  String msg15 = driver.getCurrentUrl();
	  String msg16 = "https://my.lifestyledesigninternational.com/traffic.php?step=407";
	  Assert.assertEquals(msg15, msg16);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 7");
	  Thread.sleep(5000);
	  
	  //Step 8
	  String msg17 = driver.getCurrentUrl();
	  String msg18 = "https://my.lifestyledesigninternational.com/traffic.php?step=408";
	  Assert.assertEquals(msg17, msg18);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 8");
	  Thread.sleep(5000);
	  
	  //Step 9
	  String msg19 = driver.getCurrentUrl();
	  String msg20 = "https://my.lifestyledesigninternational.com/traffic.php?step=409";
	  Assert.assertEquals(msg19, msg20);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 9");
	  Thread.sleep(5000);
	  
	  //Step 10
	  String msg21 = driver.getCurrentUrl();
	  String msg22 = "https://my.lifestyledesigninternational.com/traffic.php?step=410";
	  Assert.assertEquals(msg21, msg22);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 10");
	  Thread.sleep(5000);
	  
	  //Step 11
	  String msg23 = driver.getCurrentUrl();
	  String msg24 = "https://my.lifestyledesigninternational.com/traffic.php?step=411";
	  Assert.assertEquals(msg23, msg24);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/label/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/div[1]/div[2]/div[3]/div/form/div/button")).click();
	  System.out.println("Unlocked Traffice step 11");
	  Thread.sleep(5000);
	  
	  driver.close();
	  
	  driver.switchTo().window(winHandleBefore);
	  Thread.sleep(3000);
  }
}

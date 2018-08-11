package test;

import java.util.concurrent.TimeUnit;

import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Wait;

import net.sourceforge.htmlunit.corejs.javascript.ast.LetNode;

public class test3 {
	
	public static WebDriver driver=new FirefoxDriver();
	
	public boolean doesWebElementExist(WebDriver driver, By selector)
	{ 

	        try 
	        { 
	               driver.findElement(selector); 
	               return true; 
	        } 
	        catch (NoSuchElementException e) 
	        { 
	                return false; 
	        } 
	}
	
	public static boolean ElementExist (By Locator)
	{
		try {
			driver.findElement(Locator);
			return true;
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firebox.marionette", "D:\\maven_path\\myselenium\\geckodriver.exe");
		String url="http://125.210.121.137/media3_new3.jsp";
		driver.get(url);
		//implicitlyWait 相当于设置全局的等待，在定位元素时，对所有元素设置超时时间，超出了设置时间则抛出异常。默认为0即不等待。
		//没有设置implicitlyWait，则driver.findElement()只会找一遍指定元素，找不到就马上抛异常
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//scriptTimeout 设置异步脚本执行的超时时间，超出则抛异常。
		driver.manage().timeouts().setScriptTimeout(300, TimeUnit.SECONDS);
		//pageLoadTimeout 用来设置页面完全加载的超时时间，完全加载即页面全部渲染。超过这个时间则抛出异常。默认为-1，即永不超时。
		//这里是否包含异步脚本都执行完成呢，一般onload是指外部资源加载完，而异步脚本执行完跟这个应该不是一回事。
		driver.manage().timeouts().pageLoadTimeout(-1, TimeUnit.SECONDS);
		WebElement ele01=driver.findElement(By.linkText("天津巧虎"));
		ele01.click();
		System.out.println(driver.getCurrentUrl());
		
		int timeout=0;

		WebElement eledg=driver.findElement(By.id("nav4_1_txt"));

		Actions actions=new Actions(driver);
//		WebElement currentElement = driver.switchTo().activeElement();
		WebElement currentElement=driver.switchTo().activeElement();
		System.out.println(currentElement.getText()+currentElement.getTagName());
		
		
		

		driver.close();
		driver.quit();
		//
		
		
	}

}

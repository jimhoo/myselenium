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
		//implicitlyWait �൱������ȫ�ֵĵȴ����ڶ�λԪ��ʱ��������Ԫ�����ó�ʱʱ�䣬����������ʱ�����׳��쳣��Ĭ��Ϊ0�����ȴ���
		//û������implicitlyWait����driver.findElement()ֻ����һ��ָ��Ԫ�أ��Ҳ������������쳣
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//scriptTimeout �����첽�ű�ִ�еĳ�ʱʱ�䣬���������쳣��
		driver.manage().timeouts().setScriptTimeout(300, TimeUnit.SECONDS);
		//pageLoadTimeout ��������ҳ����ȫ���صĳ�ʱʱ�䣬��ȫ���ؼ�ҳ��ȫ����Ⱦ���������ʱ�����׳��쳣��Ĭ��Ϊ-1����������ʱ��
		//�����Ƿ�����첽�ű���ִ������أ�һ��onload��ָ�ⲿ��Դ�����꣬���첽�ű�ִ��������Ӧ�ò���һ���¡�
		driver.manage().timeouts().pageLoadTimeout(-1, TimeUnit.SECONDS);
		WebElement ele01=driver.findElement(By.linkText("����ɻ�"));
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

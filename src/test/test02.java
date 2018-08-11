package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.firebox.marionette", "D:\\maven_path\\myselenium\\geckodriver.exe");
		String url="http://www.baidu.com";
		driver.get(url);
//		driver.navigate().to(url);
		
		WebElement baidusearch =driver.findElement(By.name("wd"));
		WebElement searchbtn=driver.findElement(By.id("su"));
		//SendKeys()输入文本
		baidusearch.sendKeys("唐德影视");
		searchbtn.submit();
		Thread.sleep(6000);
		//键盘模拟输入
/*		Actions actions=new Actions(driver);
		actions.sendKeys(baidusearch, "天海防务");
//		actions.click(searchbtn);
		actions.build().perform();
		searchbtn.submit();*/
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie);
		
		Cookie cookie01=new Cookie("id", "zhanhao");
		Cookie cookie02=new Cookie("jj","zhongg");
		driver.manage().addCookie(cookie01);
		driver.manage().addCookie(cookie02);
		cookie=driver.manage().getCookies();
		System.out.println(cookie);
		for (Cookie ck : cookie) {
			if(ck.getName().equals("id") || ck.getName().equals("jj")) driver.manage().deleteCookie(ck);
		}
/*		driver.manage().deleteCookie(cookie01);
		driver.manage().deleteCookie(cookie02);*/
		cookie=driver.manage().getCookies();
		System.out.println(cookie);
		driver.close();
		driver.quit();
		//
		
		
	}

}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {
	public static WebDriver driver;
	public static void main(String args[]) {
		driver=new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(DesiredCapabilities.chrome());
		System.setProperty("webdriver.chrome.driver", "D:\\outbak\\Selenium for Java tools\\chromedriver_win32\\chromedriver.exe");
		String url="www.baidu.com";
		driver.get(url);
		
	}
}

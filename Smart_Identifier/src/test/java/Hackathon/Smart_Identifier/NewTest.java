package Hackathon.Smart_Identifier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest extends Junit_Listner{

	public static WebDriver driver;
	public static XmlReader xmlXpathBuilder;
	public static String strObjectFilePath = "";

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver();
//		
		
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		
		
		
		xmlXpathBuilder = new XmlReader("Object Repository\\Guru99_Bank_Home_Page");
		driver.get("https://demo.guru99.com/V4/");
		ReUsableActions.xorSetText("validateuserid();_10", "mngr237649");
		ReUsableActions.xorSetText("validatepassword();_validatepassword();", "dunEnar");
		ReUsableActions.xorClick("btnLogin_INPUT");
	}
}

/*


To run differenet test , you need to configure following things 
1. On Target Test class
	i. Make sure correct OR path given >> xmlXpathBuilder = new XmlReader("Object Repository\\OrangeHRM");
	ii. Make sure correct URL given >> driver.get("https://opensource-demo.orangehrmlive.com/");

2. ReUsableAction >>
	i. Make sure ReUsableActions class extends your Target Test class
*/

package Hackathon.Smart_Identifier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	public static WebDriver driver;
	public static XmlReader xpathBuilder;
	public static String strObjectFilePath = "";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

//		System.setProperty("webdriver.chrome.driver","C:\\Thalesh\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		xpathBuilder = new XmlReader();
		driver.get("https://demo.guru99.com/V4/");
		ReUsableActions.xorSetText("validateuserid();_10", "mngr237649");
		ReUsableActions.xorSetText("validatepassword();_validatepassword();", "dunEnar");
		ReUsableActions.xorClick("btnLogin_INPUT");
	}

}

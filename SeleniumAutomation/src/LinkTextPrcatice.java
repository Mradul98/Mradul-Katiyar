import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPrcatice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		//driver.wait();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("mradul@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("mradul123");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		String text = driver
				.findElement(By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
				.getText();
		System.out.println(text);
		//driver.close();
		

	}

}

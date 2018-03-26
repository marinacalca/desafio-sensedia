package selenium_teste;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class EncontraElementos {

private WebDriver driver;

	@Before
	public void setUp(){
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void encontrarElementos(){
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("marina.calca@gmail.com");

	}
	
	@Test
	public void atualizarPagina(){
		driver.navigate().refresh();
	}
	
	@Test
	public void fecharPagina(){
		driver.quit();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	

}

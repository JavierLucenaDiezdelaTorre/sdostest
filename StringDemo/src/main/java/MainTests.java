import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTests {
	
	FirefoxDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 50000);
//	WebElement elemento = new WebElement();
	private final String URL = "https://sdos.es/";

	
	 public void AbrirSdos () {

		 
		 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\geckodriver.exe");
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get(URL);
	 }

	 public void Secciones (String Seccion) {
		 try
	        {
	            Thread.sleep(5000);
	        }
	        catch (Exception e)
	        {
	            Thread.currentThread().interrupt();
	        }
		
		 driver.findElement(By.xpath(Seccion)).click();
			
	 }
	 public boolean Comprobar (String SeccionUrl)
	 {
		 boolean resultado;
		 	
	        if(driver.getCurrentUrl().equals(SeccionUrl))
	        {
	            resultado = true;
	        }
	        else
	        {
	        	resultado=false;
	        	System.out.println("Sección incorrecta:" + SeccionUrl);
	        }
	        return resultado;
	 }	
	 public void CerrarLogin(String SalirLogin)
	 {
		 driver.findElement(By.xpath(SalirLogin)).click();
	 }
	 public void CerrarNavegador(){
		 
		 driver.close();
	 }

}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Pagepgrm;

public class Testpgrm {
	WebDriver driver;
	  @BeforeTest
	  public void setup()
	  {
	    driver=new ChromeDriver();
	    driver.get("https://www.drsheths.com");
	  }
	  @Test
	  public void testing() throws InterruptedException 
	  {
	    Pagepgrm ob=new Pagepgrm(driver);
	    ob.click();
	    Thread.sleep(3000);
	    ob.setvalues("sarang410@gmail.com", "sarang123");
	    Thread.sleep(3000);
	    ob.click1();
	    Thread.sleep(4000);
	    ob.clinicc();
	    Thread.sleep(3000);
	    ob.search1("sunscreen");
	   Thread.sleep(3000);
	   ob.navigate();
	   Thread.sleep(4000);
	    ob.clinicc();
	    Thread.sleep(2000);
	    ob.scrolldown();
	    Thread.sleep(3000);
	    ob.cart1();
	    Thread.sleep(3000);
	    ob.login4();
	    Thread.sleep(3000);
	    ob.scrolldown2();
	    Thread.sleep(3000);
	    ob.homes();
	   Thread.sleep(3000);
	   ob.click3();
	   Thread.sleep(3000);
	   ob.home2();
	   Thread.sleep(3000);
	  ob.singup();
	  Thread.sleep(3000);
	   ob.log();
	  }
	  
}

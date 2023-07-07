package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pagepgrm {
	WebDriver driver;

	By drshethss=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By drshethemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By drshethpass=By.xpath("//*[@id=\"CustomerPassword\"]");
	By drshethsb= By.xpath("//*[@id=\"customer_login\"]/div[2]/div[2]/div/input");
	By clinic=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[2]/a");
	By amla=By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[2]/div[1]/a/h3");
	By cart=By.xpath("//*[@id=\"product-main-form\"]/div[3]/div[1]/div[2]/div[1]/div/div/button");
	By services=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[3]/a/span");
	By contact =By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[6]/a/span");
	By shop=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[1]/a/span[1]");
	By search=By.name("s");
	By home1=By.xpath("//img[@src='//www.drsheths.com/cdn/shop/files/6_140x.png?v=1622036451']");
	By drs1=By.xpath("//*[@id=\"collection-main\"]/div[1]/div/div[1]/div/div/div/select");
	By sign=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By logout=By.xpath("//*[@id=\"account\"]/div[4]/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/h5/span/a");
	//By clinic2=By.xpath("//*[@id=\\\"main-top-nav\\\"]/div/div/ul/li[2]/a");
	//By cent=By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[1]/div/div/div[2]/div[5]/div/form/button");
	//By search=By.xpath("");
	//By text1=By.xpath("//*[@id=\"all\"]/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/dl/div[1]/dt/span[1]");
	public Pagepgrm(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void click()
	{
	  driver.findElement(drshethss).click();
	}

	 
	public void setvalues(String email, String pass)
	{
	  driver.findElement(drshethemail).sendKeys(email);
	  
	  driver.findElement(drshethpass).sendKeys(pass);
	  
	}

	  
	public void click1()
	{
	  driver.findElement(drshethsb).click();
	  
	}
	public void clinicc()
	{
		driver.findElement(clinic).click();
	}
	public void search1(String s)
	{
		WebElement n=driver.findElement(search);
		n.sendKeys(s);
		
	}
	public void scrolldown()
	{
		//driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
		driver.findElement(amla).click();

	}
	public void cart1()
	{JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollTo(0,300)");
		
		driver.findElement(cart).click();
	}
	public void login4()
	{
		driver.navigate().back();
		
	}
	public void navigate()
	  {
		driver.navigate().to("https://www.drsheths.com/");
	  }
	public void scrolldown2()
	{
		JavascriptExecutor ja=(JavascriptExecutor) driver;
		ja.executeScript("window.scrollTo(0,600)");
		driver.findElement(services).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000)");
		driver.navigate().refresh();
		
		driver.findElement(contact).click();
		JavascriptExecutor jq=(JavascriptExecutor) driver;
		jq.executeScript("window.scrollTo(0,400)");
		driver.navigate().refresh();
	  }
	public void homes()
	{
		
		driver.findElement(shop).click();
		//JavascriptExecutor jt=(JavascriptExecutor) driver;
		//jt.executeScript("window.scrollTo(0,800)");
		//driver.findElement(cent).click();
	}
	public void click3()
	{
		driver.findElement(drs1).click();
		  WebElement op=driver.findElement(drs1);
		  Select s=new Select(op);
		  s.selectByIndex(4);
	}
	public void home2()
	{
		driver.findElement(home1).click();
	}
	public void singup()
	{
		driver.findElement(sign).click();
	//WebElement s=driver.findElement(By.xpath("text1"));
	//	String g=s.getText();
	//	System.out.println("text is:"+g);
	}
	public void log()
	{
	driver.findElement(logout).click();
	}
	
}
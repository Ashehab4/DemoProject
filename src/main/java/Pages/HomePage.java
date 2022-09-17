package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		WebDriver driver;
		
		
	public HomePage(WebDriver BaseDriver) {
		this.driver = BaseDriver;
		PageFactory.initElements(BaseDriver, this);
		// TODO Auto-generated constructor stub
	}

}

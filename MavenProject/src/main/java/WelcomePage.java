import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Base;
import Utilities.RegisterPage;

public class WelcomePage extends Base {
	
	
	//Page repo
	
	public static WebDriver driver;
	
	@FindBy(id="site-logo")
	private WebElement Logo;
	
	@FindBy(xpath = "//*[text()=\"My Account\"]")
	private WebElement MyAccountBtn;
	
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}

	//getter and setter for private DM

	public void setLogo(WebElement logo) {
		Logo = logo;
	}
	
	public WebElement getLogo() {
		return Logo;
	}

	public WebElement getMyAccountBtn() {
		return MyAccountBtn;
	}

	public void setMyAccountBtn(WebElement myAccountBtn) {
		MyAccountBtn = myAccountBtn;
	}
	
	//Welcome page Actions methods
	
	public boolean LogoValiation() {
		
		boolean isDisplayed = Logo.isDisplayed();
		return isDisplayed;
	}
	
	public RegisterPage MyAccountBtn() {
		MyAccountBtn.click();
		return new RegisterPage();	
	}
	
	
	
	
	
	
	

}

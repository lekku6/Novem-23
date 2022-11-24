package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Base;

public class LoginPoja extends Base {
	public LoginPoja() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	//FACEBOOK
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement btnLog;
	@FindBy(xpath="//a[text()='Certifications']")
			private WebElement cClick;
	public WebElement getsText() {
		return sText;
	}
	@FindBy(xpath="(//a[text()='Course Content'])[40]")
	private WebElement seleClick;
	@FindBy(xpath="//strong[text()='Selenium Training in Chennai']")
	private WebElement sText;

	public WebElement getSeleClick() {
		return seleClick;
	}

	public WebElement getcClick() {
		return cClick;
	}

	public WebElement getBtnLog() {
		return btnLog;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
	//DEMOQA
	@FindBy(id="first-name")
	private WebElement fName;

	public WebElement getfName() {
		return fName;
	}
	@FindBy(id="last-name")
	private WebElement lName;
	@FindBy(id="email")
	private WebElement gmail;
	@FindBy(id="mobile")
	private WebElement mNUm;
	@FindBy(id="country")
	private WebElement Country;
	
	

	public WebElement getlName() {
		return lName;
	}
	public WebElement getGmail() {
		return gmail;
	}
	public WebElement getmNUm() {
		return mNUm;
	}
	public WebElement getCountry() {
		return Country;
	}
	@FindBy(id="city")
	private WebElement cName;
	@FindBy(name="message")
	private WebElement mess;

	public WebElement getcName() {
		return cName;
	}
	public WebElement getMess() {
		return mess;
	}
	/////
//GREENS
   @FindBy(className="blue_text")
	private WebElement SFoot;

	public WebElement getgText() {
		return gText;
	}
	public WebElement getSFoot() {
		return SFoot;
	}
	@FindBy(className="blue_text")
	private WebElement gText;

//REdBus
	
	@FindBy(id="signin-block")
	private WebElement ftClick;
	public WebElement getFtClick() {
		return ftClick;
	}

	public WebElement getSecClick() {
		return secClick;
	}
	@FindBy(xpath="//li[text()='Sign In/Sign Up']")
	private WebElement secClick;
	
	
@FindBy(id="mobileNoInp")
private WebElement rNum;
@FindBy(xpath="//iframe[@Class='modalIframe']")
private WebElement iframe;
public WebElement getrNum() {
	return rNum;
}

public WebElement getIframe() {
	return iframe;
}

}

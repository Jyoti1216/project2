package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.InvokeBrowser;
import utilities.Locators;

public class CreateProject {

	public void login(String strUserName, String strPasword) {

		InvokeBrowser.driver.findElement(Locators.UserName).sendKeys(strUserName);
		InvokeBrowser.driver.findElement(Locators.Password).sendKeys(strPasword);
		InvokeBrowser.driver.findElement(Locators.login).click();
		InvokeBrowser.driver.switchTo().window(Registration_page.tabs.get(0));
	}

	public void Click(By locator) throws Throwable {

		InvokeBrowser.driver.findElement(locator).click();
		DemoWait();
	}

	public void Name(String name) {

		InvokeBrowser.driver.findElement(Locators.ProjectName).sendKeys(name);
		InvokeBrowser.driver.findElement(Locators.SubmitButton).click();
	}

	public void story(String story) {

		WebDriverWait wait = new WebDriverWait(InvokeBrowser.driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserStoryField));
		InvokeBrowser.driver.findElement(Locators.UserStoryField).sendKeys(story);
		InvokeBrowser.driver.findElement(Locators.UserStoryField).sendKeys(Keys.ENTER);
	}

	public void logout() {

		InvokeBrowser.driver.findElement(Locators.ProfileButton).click();
		InvokeBrowser.driver.findElement(Locators.LogoutButton).click();
		InvokeBrowser.driver.switchTo().window(Registration_page.tabs.get(0));
	}

	public String loginProfile(By locator) {

		return InvokeBrowser.driver.findElement(locator).getAttribute("alt");
	}

	public WebElement Element(By locator) {

		return InvokeBrowser.driver.findElement(locator);
	}
	
	public void Select(By locator, String name) {
		
		WebElement list = InvokeBrowser.driver.findElement(locator);
		Select select= new Select(list);
		select.selectByVisibleText(name);	
	}

	public void DemoWait() throws Throwable {

		Thread.sleep(3000);
	}
}

package demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_DocumentsPage extends Annotations {

	public CM_DocumentsPage() {
		PageFactory.initElements(driver, this);}

	@FindBy(how=How.XPATH, using="(//button[@class=' x-btn-text'] [text()='Advanced'])[2]") 
	WebElement eleclickAdvanced;

/*	@FindBy(how = How.XPATH, using="(//img[contains(@class,'x-form-trigger x-form-arrow-trigger')])[13]")
	WebElement eleclickField;*/
	
	@FindBy(how = How.XPATH, using="//input[@name='ext-comp-1894']/following-sibling::img[1]")
	private WebElement eleclickField;

	@FindBy(how = How.XPATH, using="//div[text()='  Title']")
	WebElement eleselectTitle;

	@FindBy(how = How.XPATH, using="(//img[contains(@class,'x-form-trigger x-form-arrow-trigger')])[14]")
	WebElement eleclickoperator;

	@FindBy(how = How.XPATH, using="//div[contains(text(),'Doesn't Contain Word')]")
	WebElement eleselectOperator;

	@FindBy(how = How.XPATH, using="//div[contains(@class,'x-form-field-wrap x-form-field-trigger-wrap')]/following-sibling::input[1]")
	WebElement eleenterTitle;

	@FindBy(how = How.XPATH, using="//button[text()='Search']")
	WebElement eleclickadvSearch;
	
	@FindBy(how = How.XPATH, using="//input[@class=\"x-form-text x-form-field x-form-focus\"]")
	WebElement eleentertext;
	
	@FindBy(how = How.XPATH, using="(//img[@class='x-form-trigger x-form-search-trigger-main'])[2]")
	WebElement eleclickSearch;

	
	public CM_DocumentsPage clickAdvanced() {
		click(eleclickAdvanced);
		return this;}

	public CM_DocumentsPage selectField() {
		click(eleclickField);
		click(eleselectTitle);
		return this;}

	public CM_DocumentsPage selectOperator() {
		click(eleselectOperator);
		click(eleselectOperator);
		return this;}

	public CM_DocumentsPage enterValue() {
		clearAndType(eleenterTitle, "Test");
		return this;}

	public CM_SearchresultsPage clickAdvSearch() {
		click(eleclickadvSearch);
		return new CM_SearchresultsPage();}

	public CM_DocumentsPage enternormalsearchValue() {
		clearAndType(eleentertext, "Test");
		return this;}

	public CM_SearchresultsPage clickSearch() {
		click(eleclickSearch);
		return new CM_SearchresultsPage();}

}







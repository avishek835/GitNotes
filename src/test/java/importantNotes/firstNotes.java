package importantNotes;

//import org.openqa.selenium.JavascriptExecutor;

/* WebDriver driver=new FirefoxDriver();
 * ‘WebDriver‘ is an interface and we are creating an object 
 * of type WebDriver instantiating an object of FirefoxDriver class.
 * */


/* FLUENT WAIT
 * Each FluentWait instance defines the maximum amount of time to wait for a condition, 
 * as well as the frequency with which to check the condition. 
 * 
 *  // Waiting 30 seconds for an element to be present on the page, checking
   // for its presence once every 5 seconds.
   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(30, SECONDS)
       .pollingEvery(5, SECONDS)
       .ignoring(NoSuchElementException.class);
 
 * */


/*text =driver.findElements(By.xpath(""));
 * JavascriptExecutor jse = (JavascriptExecutor)driver; //javascript executor is an interface
		jse.executeScript("scroll(0, 2100);");
		jse.executeScript("arguments[0].click();",text);
		
		*JavascriptExecutor jse=  (JavascriptExecutor)driver;
    	String txt=(String) jse.executeScript("return document.getElementsByName('username')[0].getAttribute('value');");
		*
		*/

/*Set <String> st= driver.getWindowHandles();//getWindowHandles handles the multiple windows, //return type string/window values
 * 												getWindowHandle handles the single window and return the current window page
		Iterator<String> it = st.iterator();//Iterators are used in Collection framework in Java to retrieve elements one by one. 
		String p =  it.next();
		driver.switchTo().window(p);
		//String child =it.next();*/

/* WebDriverWait wait = new WebDriverWait(driver, 70);
   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("......")));
*/

/*	findelement :- single web element
 *  findelements:- the list of all matching elements.
 *  List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
 */

/* for selecting drop down:- have to select the index
 * for selecting any button from no. of button having 
 * same name/ id :- have to select the position
 * The value in the dropdown can be selected using WebDriver’s Select class.

	Syntax:

	selectByValue:
	Select selectByValue = new Select(driver.findElement(By.id(“SelectID_One”)));
	selectByValue.selectByValue(“greenvalue”);

	selectByVisibleText:
	Select selectByVisibleText = new Select (driver.findElement(By.id(“SelectID_Two”)));
	selectByVisibleText.selectByVisibleText(“Lime”);

	selectByIndex:
	Select selectByIndex = new Select(driver.findElement(By.id(“SelectID_Three”)));
	selectByIndex.selectByIndex(2);

	To handle Browser based Alerts (Web based alert popups), we use Alert Interface. 
	The Alert Interface provides some methods to handle the popups.

	for handle web based alert:- driver.switchTo().alert();
	after that alert.accept(); / alert.dimiss();

Mouse hover
// Instantiating Action Interface. Note:- Actions is a class whereas Action is an Interface
Actions actions=new Actions(driver);
// howering on the dropdown
actions.moveToElement(driver.findElement(By.id("id of the dropdown"))).perform();
// Clicking on one of the items in the list options
WebElement subLinkOption=driver.findElement(By.id("id of the sub link"));
subLinkOption.click();

//To click on the element:
action.moveToElement(driver.findElement(By.xpath(""))).build().perform();
action.moveToElement(driver.findElement(By.xpath(""))).click().perform();
modular framework, data driven framework, hybrid framework,
Design Pattern:- Singleton Design Pattern, Page Object Model 

hashtable:- Can be shared-Synchronised.
 key value pair, no duplicate, update will store 101 a, 101 b....101 b will print and 101 a will gone
 Both the Hashmap and hashtable is implmenting Map interface
hashmap:-Cant be shared- not synchronised:- 102 a, 101 b...101 b will print first and so on. 
 HashMap allows one null key and multiple null values.
 public static Map synchronizedMap(Map m){}...to make it synchronised
 
 Array list:- Manipulation with ArrayList is slow because it internally uses an array.
  ArrayList is better for storing and accessing data.
  LinkedList:- Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list
  LinkedList is better for manipulating data.
  
  Set: No ordering/Indexing. No dulicate/redundant
 */

/*
 * Maven build life cycle
 * prepare->validate->compile->test->package->install->deploy
 * 
 * <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testNG1.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
 * */

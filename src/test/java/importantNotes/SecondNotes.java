

/* Use of OOPs in Framework
 * Abstraction:- In POM class we use locators but these locators is not shown in test file.
 * Interface:- WebDriver driver = new FirefoxDriver();  Webdriver is an Interface.
 * Inheritance:- we call methods from base class
 * Polymorphism:- using methods of base class/ or any other class ----overriding
 * 				  using same methods in test file with diff params in test file--overloading. implicit wait is an ex.
 * Encapsulation:- we use @findby in POM and initialize the data members in the constructor for its use in the methods.
 * 
 * 
 */ 
 /* We can’t create object of interfaces because of the reason that :

Interface is basically a complete abstract class. 
That means Interface only have deceleration of method not their implementation.
 So if we don’t have any implementation of a method then that means 
 if we create object of that interface and call that method it compile nothing as there is no code to compile.

To overcome this, firstly we have to create class that implements that interface
 means that class is implementing the methods of that interface.
  Now when you create object of this class 
  it gives u the permission to access all methods of interface with their implementation in the class.
 * Interface can't be instantiated means can't create any object.
 *  
 */

///*Partially matching xpath
// *  //*[contains{@name,'user'}]
// *Using text
// *  //*[text()='username']
// *  Moving to nth child element
// *  div[2] will find 2nd div elment
// *  div[position()=3] will find third div 
// *  //using child concept to go first element downward
// *  //div[@class='header_container']/child::nav
// *  //using parent concept moving upward. * is for all parent search
// *  //a[contains(text(),'Features')]/parent::*/following-sibling::li[1]/a 
	// moving backward
	// //a[contains(text(),'Features')]/parent::*/preceding-sibling::li[1]/a
// */

//to check xpath correct or incorrect in console
//$x("//td[@class='headertable' and @valign='bottom']/div/table/tbody/tr/td[4]/a")
  

 /*Using css selector by class 
 *	.tagname
 *Using css selector id
 *	#idvalue
 *any attribute '[attribute=value]'
 *[type=radio]
 *     
 * 
 * **/

//ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setExperimentalOption("useAutomationExtension", false);
//		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//		Webdriver=new ChromeDriver(chromeOptions);

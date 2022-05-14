 

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

/*Testng.xml
 * <suite name="CRMPROPRACTISE"  >
		<parameter name = "UserName" value="achakraborty83"/> 
		<parameter name = "password" value="Krishna@835@"/>
	<test name="Common1" >
	<groups>
	<run>
	<include name="smoke"/>
	</run>
	</groups
		<classes>
		<class name="com.CRMPROPRACTISE.TC.Login"/>
		<methods>
		exclude="method name"/>  / include="method name"/>
		</methods
		</class>
	</classes>
	</test>	
	
	@beforeclass, method and test scope to classonly
	@beforetest and beforesuite scope to .xml only
 * 
 * */

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
  
/*driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
 * 
 * 
 * */
 /*Using css selector by class 
 *	.tagname
 *Using css selector id
 *	#idvalue
 *any attribute '[attribute=value]'
 *[type=radio]
 *
 *input[class*='value'] /* is for using substring if class having multiple values
 *     
 * 
 * **/

//ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setExperimentalOption("useAutomationExtension", false);
//		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//		Webdriver=new ChromeDriver(chromeOptions);

/*
 * Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	        Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
 * */

/*
 * throw	throws
	Definition	Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.	
Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
 * */

/*
 * final	finally	finalize
1.	Definition	final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.	
finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.	
finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
 * */
/*
 * HashMap	Hashtable
1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.	Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2) HashMap allows one null key and multiple null values.	Hashtable doesn't allow any null key or value.
3) HashMap is a new class introduced in JDK 1.2.	Hashtable is a legacy class.
4) HashMap is fast.	Hashtable is slow.
5) We can make the HashMap as synchronized by calling this code
Map m = Collections.synchronizedMap(hashMap);	Hashtable is internally synchronized and can't be unsynchronized.
6) HashMap is traversed by Iterator.	Hashtable is traversed by Enumerator and Iterator.
7) Iterator in HashMap is fail-fast.	Enumerator in Hashtable is not fail-fast.
8) HashMap inherits AbstractMap class.	Hashtable inherits Dictionary class.
 * */

/*
 * HashMap	HashSet
Definition	Java HashMap is a hash table based implementation of Map interface.	HashSet is a Set. It creates a collection that uses a hash table for storage.
Implementation	HashMap implements Map, Cloneable, and Serializable interface es.	HashSet implements Set, Cloneable, Serializable, Iterable and Collection interfaces.
Stores	In HashMap we store a key-value pair. It maintains the mapping of key and value.	In HashSet, we store objects.
Duplicate values	It does not allow duplicate keys, but duplicate values are allowed.	It does not allow duplicate values.
Null values	It can contain a single null key and multiple null values.	It can contain a single null value.
Method of insertion	HashMap uses the put() method to add the elements in the HashMap.	HashSet uses the add() method to add elements in the HashSet.
 * */

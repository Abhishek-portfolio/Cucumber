
Cucumber Testing for Login Functionality
This project demonstrates the use of Cucumber for Behavior-Driven Development (BDD) testing of a login functionality. It utilizes Selenium WebDriver for browser automation and the Gherkin language for defining test scenarios in a simple, human-readable format.

Features
BDD Testing: The project uses Cucumber for writing and automating tests in plain language.
Login Functionality Test: The primary feature tested is the login functionality, ensuring that a user can successfully log into the website and be redirected to the home page.

Scenario
gherkin
Copy code
Feature: Check Login Functional

Scenario: Login Test Case
  Given Navigate to Website
  When Entering Username and Password
  And clicks on login button
  Then user is navigated to home page
  
Prerequisites
Java (JDK 8 or later)
Maven (or Gradle for dependency management)
Cucumber and Selenium dependencies
ChromeDriver (for Chrome browser automation)

Depndencies
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>YOUR_CUCUMBER_VERSION</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-selenium</artifactId>
    <version>YOUR_CUCUMBER_VERSION</version>
</dependency>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>YOUR_SELENIUM_VERSION</version>
</dependency>

Test Flow
*) Navigate to Website: The test starts by navigating to the login page of the website.
*)Enter Credentials: The username and password fields are populated with predefined test credentials.
*)Click Login: The login button is clicked to attempt authentication.
*)Verify Redirect: Finally, the test checks if the user is successfully redirected to the home page based on the URL.

Results
After the test runs, the result will be printed to the console:

Login Successfully: If the URL matches the expected home page URL.
Login Unsuccessfully: If the login fails or the URL does not match.

# Taskworld- QA Assignment

# Pre-requisite
    - Eclipse IDE
    - Maven
    -TestNG
    - JDK

# Installation
    -Take the clone or download project Taskworld in .zip file
    -Import the project into your Eclipse IDE.
    -Import the project into your Eclipse IDE.
  

# How to install TestNG in Eclipse
    - Open Eclipse and goto Help-> Install New Software -> Click on Add.
    - Add name as TestNG and location as http://beust.com/eclipse
    - Select TestNG checkbox and install it and restart Eclipse IDE.
  
  # Update Maven dependencies
    - Right click on pom.xml -> Maven -> Update Project
  
# How to Run on Mac- Chrome
   - Open Driver_Setup.java file and make sure Chrome driver looks similar to below
   
    - System.setProperty("webdriver.chrome.driver", Constants.driverPath+ "chromedriver");

# How to Run on Windows- Chrome
   -Open Driver_Setup.java file and make sure Chrome driver looks similar to below
    
    - System.setProperty("webdriver.chrome.driver", Constants.driverPath+ "chromedriver.exe");

# How to execute Taskworld automation suite
    - Right click on testng.xml file and run as TestNG Suite

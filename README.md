project name: XYZ_Banking_Projects
Package name banking_projects
JAVA CLASSES:
1.	 DriverClass
This class is declared in the main Source java Folder. It contains the location of WebDriver
2.	LoginClass
This class is in Source Test java Folder. It has below functions:
•	ManagerLogin()
•	CustomerLogin()
Execution Steps:
-Set all methods in the class as true.
-Run from the class name Login and all the functions in the class will be executed concurrently following the priorities set.
Sample Test Report: 
Total Tests run 2: Passed 2, Failed 0, Skipped 0. Below is the Test Result screenshot
  
3.	CustomerOnboarding
This class is in Source Test java Folder. It has below functions both positive and negative scenarios:
•	ManagerLogin()
•	AddCustomerPositiveTest()
•	addcustomernegative()
•	OpenAccountPositiveTest()
•	OpenAccountNegativeTest()
Execution Steps:
-Set ManagerLogin() function in Login class as true, the rest of the methods should remain false
-Run from the class name CustomerOnboarding extends Login and all the functions in the class will be executed concurrently following the priorities set.
Sample Test Report: 
Total Tests run 5: Passed 5, Failed 0, Skipped 0. Below is the Test Result screenshot
 

4.	Transactions
This class is in Source Test java Folder. It has below functions both positive and negative scenarios:
•	CustomerLogin()
•	DepositsPositiveTests()
•	DepositsNegativeTests()
•	VerifyTransactions()
Execution Steps:
-Set CustomerLogin() function in Login class as true, the rest of the methods should remain false
-Run from the class name Transactions extends Login and all the functions in the class will be executed concurrently following the priorities set.

Sample Test Report: 
Total Tests run 4: Passed 4, Failed 0, Skipped 0. Below is the Test Result screenshot
 
5.	DeleteCustomer
This class is in Source Test java Folder. It has below function:
•	ManagerLogin()
•	DeleteCustomer()
Execution Steps:
-Set ManagerLogin() function in Login class as true, the rest of the methods should remain false
-Run from the class name DeleteCustomer extends Login.
Sample Test Report: 
Total Tests run 2: Passed 2, Failed 0, Skipped 0. Below is the Test Result screenshot
 
6.	Logout
This class is in Source Test java Folder. It has below function:
•	CustomerLogin()
•	Logout()
Execution Steps:
-Set customerLogin() function in Login class as true, the rest of the methods should remain false
-Run from the class name Logout extends Login.
Sample Test Report: 
Total Tests run 2: Passed 2, Failed 0, Skipped 0. Below is the Test Result screenshot.
 

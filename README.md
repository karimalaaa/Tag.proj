Test Cases
Test Case 1: loginWithValidEmailButNotRegistered
This test verifies that a user cannot log in with a valid but unregistered email.

Steps:
Open the login page.
Enter a valid email that is not registered.
Enter any password.
Click on the login button.
Assertions:

// Assertion of screenshot tagdod1
   //page.checkthatyoyarenewtoamazon();
   //page.proceedtocreateanaccount();

// Assertion of screenshot tagdod2
    page.createaccount().isDisplayed();
    page.checkcreateaccountattributes();
I left the assertions for tagddo2 as it displayed last time i excuted this testcase

Test Case 2: userCannotSeeOrdersAndAddressesButCanSeeHisLists
This test verifies that a user cannot see orders and addresses but can see his lists.

Assertions:
Verify that the orders and addresses sections are not visible (assertion of screenshot tagdod5).

// Assertion of screenshot tagdod5
   attr.checkemailforsign();

// Assertion of screenshot tagdod4
  attr.Signinorcreateaccount().isDisplayed();
  attr.checkloginemail();

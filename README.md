### First Part is Test plan for Mobile Application (Yalla Kora)

* Check Test plan [HERE](https://github.com/Mostafaelbehairy95/Mostafa-Elbehairy/blob/master/Test%20Plan%20for%20Yalla%20Kora%20Mobile%20Application.md)

#

### Second Part is Bug Report for some issue in Mobile Application (Yalla Kora)

* Check Bug Report [HERE](https://github.com/Mostafaelbehairy95/Mostafa-Elbehairy/blob/master/BugReport%20for%20Yalla%20Kora%20Mobile%20Application.md)
#

### Third Part is Automation testing using Selenium, Java, and Testng FrameWorkd for Registration + Login Facebook
1. You can download Project from [HERE](https://github.com/Mostafaelbehairy95/Mostafa-Elbehairy/tree/master/Facebook_automation)
2. there are few setups before run this program 
    
    2.1 Download JAVA JDK and JRE

    2.2 Download Eclipse for JAVA Developers

    2.3 install TestNG 

        1. open https://github.com/cbeust/testng-eclipse/
        2. copy repo of latest Release -> https://testng.org/testng-eclipse-update-site
        3. open eclipse 
        4. select help -> Install new Software
        5. click on add
        6. Write Name: TestNG and location: URL in step 2.3.2
        7. It will give you a review of Items to be installed. Click on Next.
        8. If you encounter a Security warning, just click "Install Anyway".
        9. Wait for the installation to finish

    2.4 Import Project inside eclipse

    2.5 add dependencies inside pom.xml

        1. selenium-java dependency
        2. testng dependency
        3. poi-ooxml dependency for Reading from excel

    2.6 Last step you can run program by opening testng.xml then click on Run


3. The short explanation for this soulation

    3.1. there are two package for Login and Registration

        Login package has many class for different TCs below
        1. Login_validEmail_validPass
        2. Login_validEmail_validPass
        3. Login_validEmail_validPass
        4. Login_validEmail_validPass
        5. Login_validEmail_validPass
        6. Login_validEmail_validPass
        7. Login_validEmail_validPass

        Registration package has many class for different TCs below
        1. Registration_MakeSureFirstName_Mandatory
        2. Registration_MakeSureSurName_Mandatory
        3. Registration_ValidEmailSyntax
        4. Registration_EnsureComfirmEmailMatchEmail
        5. Registration_UserAgeMoreThanOneYear
    3.2. How data driven work in this code?

    * the function of dataProvider take name of method as parameter and get record for excel sheet that matchs with methmod name.

    3.3. When you run testng.xml file that will happen

        3.3.1. before excute test method the configuration of webdriver will be initialized and opened the chrome browser
        3.3.2 before run test method the data driven excute first and get record that match test methond name
#

### 4th Part is API Automation testing using Rest Assured, Java, and Testng FrameWorkd for Best Buy
<br/>

1. You can download Project from [HERE](https://github.com/Mostafaelbehairy95/Mostafa-Elbehairy/tree/master/TestAPI)

2. Test cases Proposed For Automation

    2.1. Validate_vaild_reponse_code_For_specifcProducts

    2.2. Validate_invaild_reponse_code_For_specifcProducts

    2.3. Validate_vaild_reponse_data_For_specifcProducts
    
    2.4. Validate_invaild_reponse_data_For_specifcProducts
    
    2.5. search_About_existing_Product_byName
    
    2.6. search_About_Not_existing_Product_byName
    
    2.7. search_About_Not_existing_Product_byName
    
    2.8. search_About_existing_Product_Validate_Data_byName

    2.9. search_About_Notexisting_Product_Validate_Data_byName

    2.10. Response_code_search_using_Limits

    2.11. CheckValidation_search_using_larg_Limits

    2.12. Response_code_search_using_Limits_invalidinput

3. A short explanation of the provided solution

    3.1. each API i check on 4 thing
    
    * Status Code if valid data
    * status code if invalid data
    * Compare data with API data in case Status code 200
    * Compare data with API data in case Status code 404








import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.premium.enigmacamp.com/')

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/button_Register'))

WebUI.setText(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/input_Full name_fullname'), 
    'userdummy')

WebUI.setText(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/input_Email_username'), 'dummy@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/input_Phone Number_phone'), 
    '898765432123')

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/div_Date of Birth'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/input_Create Password_password'), 
    'eZ1pu1r5NghMU/9UxIg8oQ==')

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/i_Create Password_bi bi-eye'))

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/div_Create Password_ec-input-group-rounded _24d06d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/input_Confirmation Password_confirmPassword'), 
    'eZ1pu1r5NghMU/9UxIg8oQ==')

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/button_Confirmation Password_btn-ghost'))

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/i_Confirmation Password_bi bi-eye-slash'))

WebUI.click(findTestObject('Object Repository/Register Confirm Password/Page_Premium Class/button_Confirmation Password_btn-ghost'))

WebUI.closeBrowser()


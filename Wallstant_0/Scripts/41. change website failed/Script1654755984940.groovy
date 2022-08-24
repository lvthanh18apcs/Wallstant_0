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

WebUI.navigateToUrl('http://localhost/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_username'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Welcome  Wallstant/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Edit profile'))

WebUI.setText(findTestObject('Object Repository/Page_Account settings  Wallstant/input_at_edit_website'), 'website.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account settings  Wallstant/input_at_EditProfile_current_pass'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/input_at_EditProfile_save_changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Account settings  Wallstant/p_Current password is incorrect'), 
    'Current password is incorrect')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/a_Home'))

WebUI.closeBrowser()


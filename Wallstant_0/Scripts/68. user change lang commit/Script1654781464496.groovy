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

WebUI.setText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Welcome  Wallstant/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Edit profile'))

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/p_Language'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Account settings  Wallstant/select_English'), 'العربية', 
    true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account settings  Wallstant/input_Logout_lang_current_pass'), 
    'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/input_Logout_lang_save_changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Account settings  Wallstant/p_changes saved seccessfully'), 
    'changes saved seccessfully')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_'))

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/p_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Account settings  Wallstant/select_English'), 'English', 
    true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account settings  Wallstant/input__lang_current_pass'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/input_Logout_lang_save_changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Account settings  Wallstant/p__1'), 'تم حفظ التغييرات بنجاح')

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/span__fa fa-home'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.closeBrowser()


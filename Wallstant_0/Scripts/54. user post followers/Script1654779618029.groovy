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

WebUI.sendKeys(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_user1_post_textbox'), 'User post followers')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Home  Wallstant/select_Public            Followers         _08a2bc'), 
    'Followers', true)

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/input_Title_post_now'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_User post followers'), 'User post followers')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Delete post'))

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_admin1_post_textbox'), 'This post has a title')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/button_Title'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/input_100_w_title'), 'This is the title')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/input_Title_post_now'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_admin 1'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/span_Cancel_fa fa-heart-o'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/span_Cancel_fa fa-heart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_This is the title'), 'This is the title')

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_This post has a title'), 'This post has a title')

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/a_Delete post'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/button_Load more'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_No more stories'), 'No more stories')

WebUI.closeBrowser()


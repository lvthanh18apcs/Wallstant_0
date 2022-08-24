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

WebUI.click(findTestObject('Object Repository/Page_Welcome  Wallstant/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Wallstant/input_Login now_login_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Wallstant/input_Login now_login_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Login  Wallstant/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Report a problem'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Report a problem  Wallstant/span_Report a problem'), 'Report a problem')

WebUI.setText(findTestObject('Object Repository/Page_Report a problem  Wallstant/input_Report a problem_report_sub'), 'User make a report')

WebUI.setText(findTestObject('Object Repository/Page_Report a problem  Wallstant/textarea_Report a problem_report_txt'), 
    'This app has no feature lol')

WebUI.click(findTestObject('Object Repository/Page_Report a problem  Wallstant/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Support box'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Support box  Wallstant/span_Support box'), 'Support box')

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/div_User make a report openClick to view yo_8e3db8'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/a_Delete'))


WebUI.closeBrowser()


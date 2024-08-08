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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.delay(3)

WebUI.click(findTestObject('Page_CURA Healthcare Service_Appointment/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service_Appointment/input_Username_username'), 'John Doe')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_CURA Healthcare Service_Login/form_Demo account'), 0)

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service_Appointment/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.delay(3)

WebUI.click(findTestObject('Page_CURA Healthcare Service_Appointment/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_CURA Healthcare Service_Appointment/i_CURA Healthcare_fa fa-bars'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_CURA Healthcare Service_Appointment/a_Logout'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service_Appointment/h1_CURA Healthcare Service'), 5)

WebUI.delay(3)

WebUI.closeBrowser()


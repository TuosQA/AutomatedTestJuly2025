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

WebUI.navigateToUrl('https://tuos-qatest.simpacc.ca/')

WebUI.setText(findTestObject('Object Repository/CreateRecInv/Page_Login - Codx.Auth/input_Login_Username'), 'graceyguinto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateRecInv/Page_Login - Codx.Auth/input_Login_Password'), 'CTSjUTGqz7ePh4ERSxjjPQ==')

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Login - Codx.Auth/button_Remember My Login_button'))

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/h1_Dashboard_flex items-center'))

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/a_Estimates and Quotes_flex py-2 w-full tex_170712'))

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/button_Recurring Invoice_bg-primary-500 ite_01c704'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateRecInv/Page_Tuos/select_Customer_customerID'), '3', true)

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_Create first invoice on_block w-full _af49f7'))

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/button_Previous Month_react-datepicker__nav_a59faa'))

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/div_Sa_react-datepicker__day react-datepick_1b9685'))

WebUI.setText(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_invoices_recurrenceEndAfter'), '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateRecInv/Page_Tuos/select_SubTotal_mt-1 block w-full py-2 pl-3_012011'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8'))

WebUI.setText(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_2'), 
    '4')

WebUI.setText(findTestObject('Object Repository/CreateRecInv/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_3'), 
    '45')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateRecInv/Page_Tuos/select_SubTotal_mt-1 block w-full py-2 pl-3_012011_1'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/CreateRecInv/Page_Tuos/button_Cancel_ml-3 inline-flex justify-cent_ee1268'))

WebUI.closeBrowser()


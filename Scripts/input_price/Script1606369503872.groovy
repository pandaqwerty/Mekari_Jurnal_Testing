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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sandbox.jurnal.id/users/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Mekari Account/Login_email'), 'muhammadffuad@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mekari Account/Login_password'), 'sqU2EbHce7o0M+f/WEc7Vg==')

WebUI.click(findTestObject('Page_Mekari Account/Btn_login'))

WebUI.click(findTestObject('Page_Dashboard  Jurnal/btn_sales'))

WebUI.click(findTestObject('Page_create_sales_invoice/Btn_creat_new_sales'))

WebUI.setText(findTestObject('Page_create_sales_invoice/input_price'), '300000')

WebUI.click(findTestObject('Page_create_sales_invoice/dropdown_tax'))

WebUI.sendKeys(findTestObject('Page_create_sales_invoice/input_Select_tax'), 'PPN')

WebUI.setText(findTestObject('Page_create_sales_invoice/input_amount'), '100000')

WebUI.closeBrowser()


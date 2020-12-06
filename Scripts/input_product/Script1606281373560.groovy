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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sandbox.jurnal.id/users/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Mekari Account/Login_email'), 'muhammadffuad@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mekari Account/Login_password'), 'sqU2EbHce7o0M+f/WEc7Vg==')

WebUI.click(findTestObject('Page_Mekari Account/Btn_login'))

WebUI.click(findTestObject('Page_Dashboard  Jurnal/btn_sales'))

WebUI.click(findTestObject('Page_create_sales_invoice/Btn_creat_new_sales'))

WebUI.click(findTestObject('Page_Product/Drop_down_product'))

WebUI.click(findTestObject('Page_Sales  Jurnal/add_product'))

WebUI.setText(findTestObject('Page_Sales  Jurnal/input_ product_name'), '')

WebUI.setText(findTestObject('Page_Sales  Jurnal/input_code_product'), '')

WebUI.click(findTestObject('Page_Sales  Jurnal/unit_product'))

WebUI.click(findTestObject('Page_Sales  Jurnal/add_unit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Sales  Jurnal/input_unit_product'), '')

//WebUI.sendKeys(findTestObject('Page_Sales  Jurnal/input_unit_product'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Page_Sales  Jurnal/button_Close'))

WebUI.waitForElementVisible(findTestObject('Page_Sales  Jurnal/div_Product Categories_select2-drop-mask'), 30)

WebUI.click(findTestObject('Page_Sales  Jurnal/div_Product Categories_select2-drop-mask'))

WebUI.sendKeys(findTestObject('Page_Sales  Jurnal/div_input_categori'), 'hardware')

WebUI.setText(findTestObject('Page_Sales  Jurnal/div_input_categori'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()


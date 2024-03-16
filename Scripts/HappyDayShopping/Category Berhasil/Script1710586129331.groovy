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

WebUI.navigateToUrl('https://www.happydayshopping.com/')

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Happy Day Store/img'))

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale/img_PROMO_grid-product__picture'))

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Bench Tickle Pink 100ml/button_Add to Bag'))

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Bench Tickle Pink 100ml/span_Go to Checkout'))

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Checkout/input_Enter your email address. This addres_6659b3'), 
    'faizal@gmail.com')

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale Checkout/div_All data is transmitted encrypted via a_8e360a'))

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/input_First and last name_name'), 
    'faizal')

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/input_Phone_phone'), 
    '0895701867622')

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/input_Address_address-line1'), 
    'jkt')

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/input_Street address, apartment, suite, flo_b7b2f3'), 
    'jkt')

WebUI.selectOptionByValue(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/select_Please chooseAMERATRUWI HAMRIYAWADI _6df05a'), 
    'AMERAT', true)

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping  Delivery/div_Please choose_form-control__loader'))

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale Shipping method/div_Free_form-control__loader'))

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale Payment information/input_Cash on Delivery_form-control__radio'))

WebUI.setText(findTestObject('Object Repository/End to End Order/Page_Flash Sale Payment information/textarea_Use other address_textarea'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Object Repository/End to End Order/Page_Flash Sale Payment information/select_Please chooseFrom a friendIm a repea_a39832'), 
    'From a friend', true)

WebUI.click(findTestObject('Object Repository/End to End Order/Page_Flash Sale Payment information/div_it will help us greatly_form-control__loader'))

WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.model.FailureHandling


//case date is equal
strDate1 = '09/02/1973'
strDate2 = '09/02/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.equals'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is equal date",FailureHandling.CONTINUE_ON_FAILURE )

////case date is not equal
strDate1 = '09/02/1973'
strDate2 = '11/02/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.equals'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is not equal date",FailureHandling.CONTINUE_ON_FAILURE )


////case date is before date
strDate1 = '09/02/1973'
strDate2 = '10/03/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is before date",FailureHandling.CONTINUE_ON_FAILURE )
////case date is not before date
strDate1 = '09/02/1973'
strDate2 = '08/02/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is not before date",FailureHandling.CONTINUE_ON_FAILURE )

////case date is after date
strDate1 = '09/02/1973'
strDate2 = '08/02/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is after date",FailureHandling.CONTINUE_ON_FAILURE )

////case date is Not afetr date
strDate1 = '09/02/1973'
strDate2 = '10/03/1973'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter'(strDate1,strDate2,"dd/MM/yyyy","Verify Date is not after date",FailureHandling.CONTINUE_ON_FAILURE )

////case date is matched format pattern
strDate1 = '09/Jul/1973'
pattern1 = 'dd/MMM/yyyy'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat'(strDate1,pattern1,"Verify Date Time Format",FailureHandling.CONTINUE_ON_FAILURE )

////case date is NOT matched format pattern
strDate2 = '21/06/1973'
pattern2 = 'dd/MMM/yyyy'
CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat'(strDate2,pattern2,"Verify Date Time Format",FailureHandling.CONTINUE_ON_FAILURE )
	
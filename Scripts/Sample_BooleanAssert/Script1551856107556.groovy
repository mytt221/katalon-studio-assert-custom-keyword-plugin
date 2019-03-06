import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return

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

trueCondition = 1==1
falseCondition = 1==2
expectedValue = true

//Verify isTrue keyword with true condition
CustomKeywords.'kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue'(trueCondition, "Verify the condition", FailureHandling.STOP_ON_FAILURE)

//Verify isTrue keyword with false condition
CustomKeywords.'kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue'(falseCondition, "Verify the condition", FailureHandling.CONTINUE_ON_FAILURE)

//Verify isFalse keyword with true condition
CustomKeywords.'kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse'(falseCondition, "Verify the condition", FailureHandling.STOP_ON_FAILURE)

//Verify isFalse keyword with false condition
CustomKeywords.'kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse'(trueCondition, "Verify the condition", FailureHandling.CONTINUE_ON_FAILURE)



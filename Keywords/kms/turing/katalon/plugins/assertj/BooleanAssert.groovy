package kms.turing.katalon.plugins.assertj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class BooleanAssert extends GenericAssert{
	/**
	 * Verify an expression is true
	 * @param expression is the expression to be verified
	 * @param description is the verification info
	 */
	@Keyword
	static void isTrue(boolean expression, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE){
		info description
		try{
			String message = buildAssertMessage(description, "true", expression)
			if (expression == false){
				handleError(message, flowControl)
			}
			else
				pass("The expression is true")
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify an expression is false
	 * @param expression is the expression to be verified
	 * @param description is the verification info
	 */
	@Keyword
	static void isFalse(boolean expression, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE){
		info description
		try{
			String message = buildAssertMessage(description, "false", expression)
			if (expression == true){
				handleError(message, flowControl)
			}
			else
				pass("The expression is false")
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}
}

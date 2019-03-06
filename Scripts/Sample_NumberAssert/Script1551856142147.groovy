import com.kms.katalon.core.model.FailureHandling

//case x = y
x = 1.0
y = 1
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equals'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.notEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)


//case x > y
x = 1.03343
y = 1
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equals'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.notEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)


//case x < y
x = 4
y = 4.01
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equals'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.notEqual'(x, y, "Verify number of members", FailureHandling.CONTINUE_ON_FAILURE)


//case value is null
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isNull'(null, "Verify object is null", FailureHandling.CONTINUE_ON_FAILURE)


//case value = 0
value = 0.0
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isPositive'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isNegative'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isZero'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equalTo'(value, y, "Verify number of members", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equalTo'(x, value, "Verify number of members", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.equalTo'(x, y, "Verify number of members", FailureHandling.STOP_ON_FAILURE)


//case value > 0
value = 5.8
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isPositive'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isNegative'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isZero'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)


//case value < 0
value = -1.5
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isPositive'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isNegative'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'kms.turing.katalon.plugins.assertj.NumberAssert.isZero'(value, "Verify number", FailureHandling.STOP_ON_FAILURE)

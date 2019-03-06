package kms.turing.katalon.plugins.assertj

import java.util.stream.Collectors

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling

public class ListAssert extends GenericAssert{
	/**
	 * Verify whether two Lists are equals
	 * @param actual the list to be tested
	 * @param expected the list to compare
	 * @param description the verification info
	 */
	@Keyword
	static public void equalsWithOrder(List<Object> actual, List<Object> expected, String description, FailureHandling flowControl = FailureHandling.OPTIONAL){
		info description
		try{
			if(actual == null || expected == null){
				handleError("The tested list(s) is/are null. The actual list: $actual, the expected list: $expected", flowControl)
				return
			}
			if(actual.equals(expected)){
				pass "These two lists are equal"
			}
			else{
				String message = buildAssertMessage(description, "equal to the list $expected", actual)
				handleError(message, flowControl)
			}
		} catch(ex){
			handleError ex, flowControl
		}
	}

	/**
	 * Verify whether two Lists are equals ignoring their orders
	 * @param actual the list to be tested
	 * @param expected the list to compare
	 * @param description the verification info
	 */
	@Keyword
	static public void equalsIgnoreOrder(List<Object> actual, List<Object> expected, String description, FailureHandling flowControl = FailureHandling.OPTIONAL){
		info "$description"
		try{
			if(actual == null || expected == null){
				handleError("The tested list(s) is/are null. The actual list: $actual, the expected list: $expected", flowControl)
				return
			}
			List<Object> newActual = actual.stream().collect(Collectors.toList()).sort()
			List<Object> newExpected = expected.stream().collect(Collectors.toList()).sort()

			if(newActual.sort().equals(newExpected.sort())){
				pass "These two lists are equal ignoring their orders"
			}
			else{
				String message = buildAssertMessage(description, "equal to the list $expected ignoring their orders", actual)
				handleError(message, flowControl)
			}
		} catch(ex){
			handleError ex, flowControl
		}
	}

	/**
	 * Verify 1 list is contained another one
	 * @param list the list to be tested
	 * @param subList the sub list
	 * @param description the verification info
	 */
	@Keyword
	static public void contains(List<Object> list, List<Object> subList, String description, FailureHandling flowControl = FailureHandling.OPTIONAL){
		info "$description"
		try{
			if(list == null || subList == null){
				handleError("The tested list(s) is/are null. The parent list: $list, the sub list: $subList", flowControl)
				return
			}
			if(list.containsAll(subList)){
				pass "The tested list contains the sub list ${subList}"
			}
			else{
				String message = buildAssertMessage(description, "contains the list $subList ignoring their orders", list)
				handleError(message, flowControl)
			}
		} catch(ex){
			handleError ex, flowControl
		}
	}
}

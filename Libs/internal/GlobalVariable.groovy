package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object successCode
     
    /**
     * <p></p>
     */
    public static Object globalId
     
    /**
     * <p>Profile Xkom : Adres aplikacji</p>
     */
    public static Object url
     
    /**
     * <p>Profile rtvAGD : Adres aplikacji</p>
     */
    public static Object url1
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseUrl = selectedVariables['baseUrl']
            successCode = selectedVariables['successCode']
            globalId = selectedVariables['globalId']
            url = selectedVariables['url']
            url1 = selectedVariables['url1']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

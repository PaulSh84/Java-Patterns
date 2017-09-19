import TemplateMethod.CompanyCostsLog;
import TemplateMethod.CompanyReceiptLog;
import TemplateMethod.CustomerRegisterLog;
import TemplateMethod.TemplateAbstractClasses.UserActionsLog;
import org.junit.Assert;
import org.junit.Test;

public class TemplateTestMethod {

    private static final String USER_NAME = "Juggy";

    @Test
    public void executeCustomerLogTest() {
        UserActionsLog customerLog = new CustomerRegisterLog(USER_NAME);
        customerLog.generateLog();

        Assert.assertTrue(customerLog.isLogCreated());
    }

    @Test
    public void executeCompanyReceiptTest() {
        UserActionsLog companyReceiptLog = new CompanyReceiptLog(USER_NAME);

        companyReceiptLog.generateLog();

        Assert.assertTrue(companyReceiptLog.isLogCreated());
    }

    @Test
    public void executeCompanyCostsLog() {

        UserActionsLog companyCostsLog = new CompanyCostsLog(USER_NAME);

        companyCostsLog.generateLog();

        Assert.assertTrue(companyCostsLog.isLogCreated());
    }

}

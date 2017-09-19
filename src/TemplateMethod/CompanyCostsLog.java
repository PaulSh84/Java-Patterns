package TemplateMethod;

import TemplateMethod.TemplateAbstractClasses.UserActionsLog;

public class CompanyCostsLog extends UserActionsLog {

    public CompanyCostsLog(String userName) {
        super(userName);
    }

    @Override
    public void generateBodyLog() {
        System.out.println("Generating Company Costs body log...");
    }
}

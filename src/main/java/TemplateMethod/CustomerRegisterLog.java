package TemplateMethod;

import TemplateMethod.TemplateAbstractClasses.UserActionsLog;

public class CustomerRegisterLog extends UserActionsLog {

    public CustomerRegisterLog(String userName) {
        super(userName);
    }

    @Override
    public void generateBodyLog() {
        System.out.println("Generating customer body log...");
    }
}

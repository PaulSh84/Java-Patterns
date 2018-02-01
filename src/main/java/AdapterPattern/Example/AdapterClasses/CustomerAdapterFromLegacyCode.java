package AdapterPattern.Example.AdapterClasses;

import AdapterPattern.Example.AdapterInterface.Customer;
import AdapterPattern.Example.LegacyCode.CustomerFromLegacyCode;

public class CustomerAdapterFromLegacyCode implements Customer {

    private CustomerFromLegacyCode instance;

    public CustomerAdapterFromLegacyCode(
            CustomerFromLegacyCode instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getCn();
    }

}


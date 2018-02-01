package AdapterPattern.Example;

import AdapterPattern.Example.AdapterClasses.CustomerAdapterCSV;
import AdapterPattern.Example.AdapterClasses.CustomerAdapterFromLegacyCode;
import AdapterPattern.Example.AdapterClasses.CustomerDB;
import AdapterPattern.Example.AdapterInterface.Customer;
import AdapterPattern.Example.LegacyCode.CustomerCSV;
import AdapterPattern.Example.LegacyCode.CustomerFromLegacyCode;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public List<Customer> getEmployeeList() {
        List<Customer> customers = new ArrayList<>();

        Customer customerFromDB = new CustomerDB("1234",
                "Robert", "C. Martin","bobMartin@cleancode.com");

        customers.add(customerFromDB);

        CustomerFromLegacyCode customerFromLegacyCode =
                new CustomerFromLegacyCode("777", "Java", "Juggy", "juggy@java.com");

        customers.add(new
                CustomerAdapterFromLegacyCode(customerFromLegacyCode));

        CustomerCSV customerCSV = new
                CustomerCSV("567,James,Gosling,jamesGosling@java.com");

        customers.add(new CustomerAdapterCSV(customerCSV));

        return customers;
    }
}

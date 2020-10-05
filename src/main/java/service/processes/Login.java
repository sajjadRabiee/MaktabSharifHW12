package service.processes;

import repository.DAOEntites.BankManagerDAO;
import repository.DAOEntites.CustomerDAO;
import repository.DAOEntites.EmployeeDAO;
import service.Input.InputArea;
import service.entities.BankManager;
import service.entities.Customer;
import service.entities.Employee;

import java.util.Optional;

public final class Login {
    public static Customer customerLogin(){
        CustomerDAO customerDAO = new CustomerDAO();
        System.out.println("Please enter your username : ");
        while(true) {
            String username = InputArea.getUsername();
            Optional<Customer> oCustomer = customerDAO.findByName(username);
            if (oCustomer.isPresent()) {
                Customer customer = oCustomer.get();
                System.out.println("Please enter your password : ");
                while (true) {
                    String password = InputArea.getPassword();
                    if (password.equals(customer.getPassword())) {
                        return customer;
                    } else {
                        System.out.println("password is not corrected please try again : ");
                    }
                }
            } else {
                System.out.println("username for customer not found please try again :");
            }
        }
    }
    public static Employee employeeLogin(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("Please enter your username : ");
        while(true) {
            String username = InputArea.getUsername();
            Optional<Employee> oEmployee = employeeDAO.findByName(username);
            if (oEmployee.isPresent()) {
                Employee employee = oEmployee.get();
                System.out.println("Please enter your password : ");
                while (true) {
                    String password = InputArea.getPassword();
                    if (password.equals(employee.getPassword())) {
                        return employee;
                    } else {
                        System.out.println("password is not corrected please try again : ");
                    }
                }
            } else {
                System.out.println("username for employee not found please try again :");
            }
        }
    }
    public static BankManager bankManagerLogin(){
        BankManagerDAO bankManagerDAO = new BankManagerDAO();
        System.out.println("Please enter your username : ");
        while(true) {
            String username = InputArea.getUsername();
            Optional<BankManager> oBankManager = bankManagerDAO.findByName(username);
            if (oBankManager.isPresent()) {
                BankManager bankManager = oBankManager.get();
                System.out.println("Please enter your password : ");
                while (true) {
                    String password = InputArea.getPassword();
                    if (password.equals(bankManager.getPassword())) {
                        return bankManager;
                    } else {
                        System.out.println("password is not corrected please try again : ");
                    }
                }
            } else {
                System.out.println("username for bank manager not found please try again :");
            }
        }
    }
}

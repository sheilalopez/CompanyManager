package com.company;
import javax.management.relation.RelationTypeNotFoundException;
import java.util.List;

public interface CompanyManager {
    int getSize();

    void addEmployee(String id, String name, double salary, String id_manager,String type) throws TypeNotFoundException);

    void addManager (String id, String name, double salary);

    void addSell (String id_vendedor, double amount) throws VendedorNotFoundException;

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String id_manager) throws ManagerNotFoundException, ListEmployeesEmptyException;
    Employee findById(String id);

}

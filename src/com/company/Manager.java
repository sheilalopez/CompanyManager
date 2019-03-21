package com.company;

import java.util.LinkedList;
import java.util.List;

public class Manager extends Employee {
    //atributos
    private List<Employee> employees;

    public void addEmployeeToManager (Employee e){
        this.employees.add(e);
    }
    public int getListSize(){
        return employees.size();
    }
    public List<Employee> getEmployees(){
        return employees;
    }
    public Manager (String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.employees = new LinkedList<>();

    }
    @Override
    public void updateSalary(double base_salary) {

        double sell_amount = 0;
        double bonus;

        for(Employee employee: employees){
            if(employee instanceof Vendedor){
                List<Sell> sells = ((Vendedor) employee).getSells();

                if(sells!=null) {
                    for (Sell sell : sells) {
                        sell_amount += sell.getAmount();
                    }
                }
            }
        }

        bonus = sell_amount/100;

        this.salary = base_salary + bonus;
    }

}

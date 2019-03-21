package com.company;


import java.util.HashMap;

public class CompanyManagerImplementation  implements CompanyManager{
    private HashMap<String,Employee> employees;
    private int MAX_size;

    public int getSize(){
        return employees.size();
    }
    public CompanyManagerImplementation(){
        this.employees = new HashMap<String,Employee>();
    }
    public CompanyManagerImplementation(int MAX){
        this.employees = new HashMap<>(MAX);
        this.MAX_size = MAX;
    }

    public void addSell (String id_vendedor, double amount) throws VendedorNotFoundException{
        Employee v = findById(id_vendedor);
        if(v!=null && instanceof Vendedor){
            Sell s = new Sell (id_vendedor, amount);
            ((Vendedor) v).addSell(s);
        }
        else throw new VendedorNotFoundException("Vendedor not found");
    }

}

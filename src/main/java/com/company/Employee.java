package com.company;

public abstract class Employee implements Comparable<Employee>{
    //atributos  protected, que significa que las subclases sí pueden tener acceso al campo o método.
    protected String id;
    protected String name;
    protected Double salary;

    //métodos

    public String getId(){
        return id;
    }
    public void setId (String id){
        this.id =id;
    }

    public String getName(){
        return name;
    }
    public  void setName (String name){
        this.name = name;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary (Double salary){
        this.salary = salary;
    }
    public abstract void updateSalary (double base_salary);

    public int compareTo (Employee e){
        return this.name.compareTo(e.name);
    }
}

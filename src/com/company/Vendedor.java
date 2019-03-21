package com.company;
import java.util.LinkedList;
import java.util.List;


public class Vendedor extends Employee {
    //atributos
    public String id_manager;
    private List<Sell> sells;

    public List <Sell> getSells(){
        return this.sells;
    }
}

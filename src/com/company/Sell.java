package com.company;

public class Sell {
    public static int sell_count = 0;
    private int id;
    private String id_vendedor;
    private Double amount;

    public Sell (String id_vendedor,Double amount){
        this.id = sell_count++;
        this.id_vendedor = id_vendedor;
        this.amount = amount;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;

    }

    public String getId_vendedor(){
        return id_vendedor;
    }
    public void setId_vendedor(String id_vendedor){
        this.id_vendedor = id_vendedor;
    }
    public Double getAmount(){
        return amount;
    }
    public void setAmount(Double amount){
        this.amount = amount;
    }
}

package com.siit.bubblesortalgorithm;
/*
this class is used for creating objects in the array from th emain class
 */
class SalesRep {
    /**
     * gets the properties from the defined objects in the array
     * and returns the total sales worth
     */

    private String name;
    private int sales;
    private int quota;

    SalesRep(){}

    SalesRep(String name, int sales, int quota){
        this.name = name;
        this.sales = sales;
        this.quota = quota;   //astea imi trebuiau ca sa iau din array datele??
    }

    String getName(){
        return name;
    }

    int getSalesWorth(){
        return sales * quota;
    }
}

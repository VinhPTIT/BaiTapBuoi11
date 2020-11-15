package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;

public class Customer {
    private int iId;
    private String strName;
    private int iAge;
    private String strEmail;
    //private List<Customer> listCustomer;

    public Customer(int iId, String strName, int iAge, String strEmail){
        this.iId=iId;
        this.strName=strName;
        this.iAge=iAge;
        this.strEmail=strEmail;
        // this.listCustomer=listCustomer;
    }

    public Customer() {
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getStrName(String vinh) {
        return strName;
    }

//    public void setStrName(String strName) {
//        this.strName = strName;
//    }

    public int getiAge() {
        return iAge;
    }

    public void setiAge(int iAge) {
        this.iAge = iAge;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

//    public List<Customer> getListCustomer() {
//        return listCustomer;
//    }
//
//    public void setListCustomer(List<Customer> listCustomer) {
//        this.listCustomer = listCustomer;
//    }
    @Loggable
    public void setStrName(String strName) {
        this.strName = strName;
    }


    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }
    @Override
    public String toString() {
        return "Customer{" +
                "iId=" + iId +
                ", strName='" + strName + '\'' +
                ", iAge=" + iAge +
                ", strEmail='" + strEmail + '\'' +
                '}';
    }
}

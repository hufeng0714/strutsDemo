package com.how2java.bean;

//http://127.0.0.1:8080/struts/showProduct
//http://127.0.0.1:8080/struts/addProduct.jsp

public class Product {

    int id;
    String name;
    int age;
    public int getAge(){
    	return age;
    }
    
    public void setAge(int age){
    	this.age = age;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

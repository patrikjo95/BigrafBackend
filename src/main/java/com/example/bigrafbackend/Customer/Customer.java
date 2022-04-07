package com.example.bigrafbackend.Customer;

public class Customer {
    private int id;
    private String number;
    private String age;
    private String name;
    private String address;

    public Customer(int id, String number, String age, String name, String address){
        this.id = id;
        this.number = number;
        this.age = age;
        this.name = name;
        this.address = address;


    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Customer{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", address'" + address + '\'' +
                '}';


    }



}


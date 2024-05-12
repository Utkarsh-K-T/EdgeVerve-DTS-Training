package Association01;
//package com.infosys.demo; 

public class Student {//container class
    int id;
    String name;
    DOB dob;
    public Student(int id, String name, DOB dob){
        this id = id;
        this name = name;
        this dob = dob;
    }
    @Override
    public String toString(){
        return "Student [ id = "+ id + ", name="+name+" , dob="+dob;
    }
    public static void main(String[] args) {
        
    }
}

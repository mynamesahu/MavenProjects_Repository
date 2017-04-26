/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sambit.maven.mytestPackage;

/**
 *
 * @author Sambit
 */
public class Student {
    
    int id;
    String name;
    
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public static void main(String args[]){
        
        Student student = new Student(1,"Sattwik");
        System.out.println("Student id ="+student.id);
        System.out.println("Student name ="+student.name);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.iek.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x=20;
        int y=18;
        if(x>y){
            System.out.println("x is greater than y");
        }
        String name;
        int age;
        char gender;
        double salary;
        Scanner console =new Scanner(System.in);
        System.out.println("Enter name: ");
        name=console.nextLine();
        System.out.println("Enter age: ");
        age=console.nextInt();
        System.out.println("Enter gender: (F/M)");
        gender=console.next().charAt(0);
        System.out.println("Enter salary: ");
        salary=console.nextDouble();
        System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+" Salary: "+salary);
        
    }
}

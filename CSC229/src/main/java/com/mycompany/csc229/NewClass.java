/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229;

/**
 *
 * @author chriscanenguez
 */
public class NewClass 
{
    int id;
    NewClass nxt;
    NewClass (int id) {this.id = id;}
    
    @Override
    public String toString()
    {
        return "Class id is " + this.id;
    }
    
    public static void main(String[] args)
    {
        NewClass c1 = new NewClass(1);
        NewClass c2 = new NewClass(2);
        c1.nxt = c2;// This is called a linked list.
        NewClass c3 = new NewClass(3);
        c2.nxt = c3;
        NewClass c4 = new NewClass(4);
        NewClass c5 = new NewClass(5);
        
        System.out.println(c1);
    }
          
}

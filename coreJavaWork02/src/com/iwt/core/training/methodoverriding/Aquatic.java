package com.iwt.core.training.methodoverriding;

public class Aquatic extends Animal{

//	static int a;
//	static int b;
	
@Override
int  fun(int a, int b){
        System.out.println("Sum by super class: " + super.fun(a, b));
       
        a = 10;
        b= 20;
        int c = a * b;
         return c;
       }
}


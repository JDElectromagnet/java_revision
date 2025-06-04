package org.example;

import java.util.Arrays;

public class DataTypeClass {

    // This Class refers to Data Types of JAVA
    // Here I will experiment with various datatypes in JAVA

    private int a;
    public float b;
    public boolean c;
    public byte d;
    public String e;


    public int[] array1 = new int[10];

    public DataTypeClass(){

        System.out.println();
        System.out.println("Class: Data Type Class \n---");
        System.out.println();
        System.out.println("byte: " + Byte.SIZE + " bits, Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " bits, Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.SIZE + " bits, Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " bits, Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("float: " + Float.SIZE + " bits, Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " bits, Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("char: " + Character.SIZE + " bits, Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: not precisely defined (true/false only)");

        System.out.println("Class: Data Type Class \n---");
    }

    public void show(){
        System.out.println("Int a: "+this.a);
        System.out.println("Float b: "+this.b);
        System.out.println("Boolean c: "+this.c);
        System.out.println("Byte d: "+this.d);
        System.out.println("String e: "+this.e);
        System.out.println(Arrays.toString(this.array1));
    }

}

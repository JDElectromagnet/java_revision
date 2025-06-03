package org.example;

public class LoopClass {

    //Here I will test All the Loops

    public void forloop(){

        for(int i=0; i<10; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("j");
            }
            System.out.println("");
        }
    }

    public void forloop_tables(int a, int upto){

        for (int i = 1; i<=upto; i++){
            System.out.println(a+" * "+i+" = " +(a*i));
        }
    }
}

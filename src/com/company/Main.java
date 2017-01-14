package com.company;

//public class Main {

//public static void main(String[] args) {
public class Main {

    public static void main(String[]args){
        int i;
        int z ;

        Rog one = new Rog();
        one.z= 0;
        Rog.sl(5,3);
        Rog.sl (2,8);
        Rog.sl (3,2);
        one.setZ(3);

        if (one.getZ() > 0) {
            System.out.println(one.sl(2, 8));
        }else
        System.out.println(one.getZ());

    }
}
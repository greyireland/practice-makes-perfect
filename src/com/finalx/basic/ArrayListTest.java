package com.finalx.basic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tengyu on 2016/7/11.
 */
public class ArrayListTest {
    public static void main(String[] args){
        Single s=Single.getInstance();
        //s.hello();
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("first one.");
        arr.add("test");
        boolean b=arr.contains("test");
        ArrayList arr2=new ArrayList<Integer>();
        String[] arg=new String[3];
        int arr3[]=new int[3];
        String[] str2={"test","test2"};
        int arr4[]={1,2,3};
        int[] arr5={3,4,5};
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(Integer.parseInt("2"));

        Random rand=new Random();//默认以当前时间为种子,每次都会变化
        Random rand2=new Random(100);//如果固定了以100为种子的话,就会产生固定的序列
        System.out.print(rand.nextInt(200)+"\n");
        System.out.print(rand.nextInt(200)+"\n");
        System.out.print(rand2.nextInt(200)+"\n");
        System.out.print(rand2.nextInt(200)+"\n");
        System.out.print(rand.nextDouble()+"\n");

        System.out.println(Math.abs(-1));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,3));


    }
}

package com.example.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RCTest2 {

    public static void main(String[] args) {
        //double[] ints ={571.00,572.00,573.00,574.00,587.00,1000,2000,3000,4000,5000,6000,7000};
        //double[] ints ={551.00, 551.00, 551.00, 551.00, 552.00, 552.00, 552.00, 552.00, 552.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 555.00, 555.00, 556.00, 555.00, 556.00, 33.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 557.00, 557.00, 557.00, 557.00, 558.00, 557.00, 558.00, 557.00};
        Double[] ints={376.00, 377.00, 377.00, 377.00, 376.00, 377.00, 376.00, 377.00, 376.00, 377.00, 377.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 375.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 376.00, 375.00, 376.00, 375.00, 375.00, 374.00, 375.00, 374.00, 375.00, 375.00, 375.00, 375.00, 375.00, 375.00, 375.00, 375.00, 375.00, 374.00, 375.00, 374.00, 374.00, 374.00, 374.00, 374.00, 374.00, 374.00, 373.00, 374.00, 374.00, 374.00, 373.00};
       //   Double[] ints={324.00, 324.00, 325.00, 325.00, 325.00, 325.00, 323.00, 323.00, 323.00, 323.00, 323.00, 323.00, 324.00, 322.00, 323.00, 323.00, 323.00, 323.00, 323.00, 324.00, 323.00, 323.00, 324.00, 324.00};

        double temp=0;
        // 计算波峰波谷

        ArrayList arrayList = peak(ints);
        System.out.println(arrayList);
        System.out.println("***************************");

        ArrayList list=new ArrayList();
        for(int j=0 ; j <arrayList.size()-1;j++){

            temp = filter(ints[j], ints[j+1],temp);
            int intValue = new Double(temp).intValue();
            System.out.println(intValue);
            list.add(intValue);
        }
        System.out.println("***************************");
        Double[] doubles=new Double[list.size()];
         list.toArray(doubles);

        ArrayList peak = peak(doubles);


    }

    public static double filter(double NEW_DATA,double OLD_DATA,double temp){


    if(NEW_DATA - OLD_DATA >temp || OLD_DATA -NEW_DATA >temp){
        return  OLD_DATA;

    }
    return NEW_DATA;


    }



    public static ArrayList peak(Double[] wave){

        ArrayList arrayList=new ArrayList();
        int direction = wave[0] > 0? -1:1;
        for(int i=0;i<wave.length-1;i++) {
            if((wave[i+1]-wave[i])*direction>0) {
                direction*=-1;
                if(direction == 1) {
                    System.out.println("("+i+","+wave[i]+")"+"波峰");
                    arrayList.add(wave[i]);
                } else {
                    System.out.println("("+i+","+wave[i]+")"+"波谷");
                    arrayList.add(wave[i]);
                }
            }
        }

        return arrayList;

    }

}

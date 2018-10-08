package com.example.springboot;

import java.util.ArrayList;
import java.util.Map;

public class Peak2Test {

    public static void main(String[] args) {

//
 //      double[] wave ={551.00, 551.00, 551.00, 551.00, 552.00, 552.00, 552.00, 552.00, 552.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 555.00, 555.00, 556.00, 555.00, 556.00, 33.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 557.00, 557.00, 557.00, 557.00, 558.00, 557.00, 558.00, 557.00};
//        System.out.println(findPeak(ints));
        double[] wave ={563.00, 563.00, 563.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 566.00, 565.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00 };


  //      byte[] wave = new byte[]{4,5,1,1,4,3,3,3,3,5,5,6,4,4,3,2};
        int direction = wave[0] > 0? -1:1;
        for(int i=0;i<wave.length-1;i++) {
            if((wave[i+1]-wave[i])*direction>0) {
                direction*=-1;
                if(direction == 1) {
                    System.out.println("("+i+","+wave[i]+")"+"波峰");
                } else {
                    System.out.println("("+i+","+wave[i]+")"+"波谷");
                }
            }
        }


    }

    public static Map findPeak(double[]  arrayList) {
        if (null == arrayList || arrayList.length <= 3) {
            return null;
        }

        for (int i = 0; i <arrayList.length-2; i = i + 1) {

            int count=0;

            if ( arrayList[i + 1] >  arrayList[i] &&  arrayList[i + 1] >  arrayList[i + 2]) {
                System.out.println("波峰" + arrayList[i ]+":"+arrayList[i + 1]+":"+arrayList[i +2]);
            }

            if ( arrayList[i + 1] <  arrayList[i] &&  arrayList[i + 1] < arrayList[i + 2]) {
                System.out.println("波谷" + arrayList[i ]+":"+arrayList[i + 1]+":"+arrayList[i +2]);

            }

            count++;

        }


        return null;

    }

}

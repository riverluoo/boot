package peak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class PeakTest {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(200);
        arrayList.add(100);
        arrayList.add(50);
        arrayList.add(400);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(4);

        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

       // findPeak(arrayList);




    }

    public static Map findPeak(ArrayList arrayList) {

        int direction= (Integer) arrayList.get(0) >0 ? -1 :1;
        for(int i=0 ; i< arrayList.size()-1; i++){
            if(((Integer)arrayList.get(i+1)-(Integer)arrayList.get(i)) * direction>0){
                direction *=-1;
                if (direction == 1) {
                    System.out.println("("+i+","+arrayList.get(i)+")"+"波峰");
                }else {
                    System.out.println("("+i+","+arrayList.get(i)+")"+"波谷");
                }
            }
        }


//
//        if (null == arrayList || arrayList.size() <= 3) {
//            return null;
//        }
//
//        for (int i = 0; i <arrayList.size()-2; i = i + 1) {
//
//            int count=0;
//
//            if ((Integer) arrayList.get(i + 1) > (Integer) arrayList.get(i) && (Integer) arrayList.get(i + 1) > (Integer) arrayList.get(i + 2)) {
//                System.out.println("波峰" + arrayList.get(i + 1));
//            }
//
//            if ((Integer) arrayList.get(i + 1) < (Integer) arrayList.get(i) && (Integer) arrayList.get(i + 1) < (Integer) arrayList.get(i + 2)) {
//                System.out.println("波谷" + arrayList.get(i + 1));
//
//            }
//
//            count++;
//
//        }


        return null;

    }
}

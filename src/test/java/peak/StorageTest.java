package peak;

import java.util.HashMap;
import java.util.Map;

public class StorageTest {

    public static void main(String[] args) {

       // double[] ints = {597.00, 597.00, 597.00, 597.00, 597.00, 597.00, 597.00, 598.00, 598.00, 598.00, 598.00, 598.00, 598.00, 598.00, 598.00, 599.00, 599.00, 599.00, 599.00, 599.00, 599.00, 599.00, 599.00, 599.00, 599.00, 600.00, 600.00, 600.00, 600.00, 600.00, 600.00, 600.00, 600.00, 600.00, 600.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 601.00, 602.00, 602.00, 602.00, 602.00, 602.00, 602.00, 602.00, 602.00, 602.00, 602.00};
        double[] ints ={551.00, 551.00, 551.00, 551.00, 552.00, 552.00, 552.00, 552.00, 552.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 555.00, 555.00, 556.00, 555.00, 556.00, 33.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 557.00, 557.00, 557.00, 557.00, 558.00, 557.00, 558.00, 557.00};
        System.out.println(findPeak(ints));
    }

    public static boolean isUp(double[] array, int m) {
        return array[m - 1] < array[m] && array[m] < array[m + 1];
    }

    public static Map findPeak(double[] array) {
        Map<String, Double> map = new HashMap<>();

        if (array == null || array.length <= 2) {
            return null;
        }
        int mark = 0;

        if (array[0] > array[1]) {
            mark = -1;
        } else {
            mark = 1;
        }

        int start = 0, end = array.length - 1;

        while (start <= end) {
            int m = (start + end) / 2;

            if (m == 0 || m == array.length - 1) {
                return map;
            }

            if (array[m - 1] > array[m] && array[m + 1] > array[m]) {
                map.put("波谷",array[m]);
            }

            if(array[m - 1] < array[m] && array[m + 1] < array[m]){
                map.put("波峰",array[m]);
            }

            //往左边
            if ((isUp(array, m) && mark < 0) || (!isUp(array, m) && mark > 0)) {
                end = m - 1;
            } else {//右边
                start = m + 1;
            }


        }
        return map;
    }
}
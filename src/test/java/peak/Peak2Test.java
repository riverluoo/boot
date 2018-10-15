package peak;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Peak2Test {

    public static void main(String[] args) {

//
        //      double[] wave ={551.00, 551.00, 551.00, 551.00, 552.00, 552.00, 552.00, 552.00, 552.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 553.00, 554.00, 554.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 554.00, 555.00, 555.00, 555.00, 555.00, 555.00, 556.00, 555.00, 556.00, 33.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 556.00, 557.00, 557.00, 557.00, 557.00, 558.00, 557.00, 558.00, 557.00};
//        System.out.println(findPeak(ints));
        double[] wave = {563.00, 563.00, 563.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 564.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 565.00, 566.00, 565.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 566.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00, 567.00};


        //      byte[] wave = new byte[]{4,5,1,1,4,3,3,3,3,5,5,6,4,4,3,2};
        int direction = wave[0] > 0 ? -1 : 1;
        for (int i = 0; i < wave.length - 1; i++) {
            if ((wave[i + 1] - wave[i]) * direction > 0) {
                direction *= -1;
                if (direction == 1) {
                    System.out.println("(" + i + "," + wave[i] + ")" + "波峰");
                } else {
                    System.out.println("(" + i + "," + wave[i] + ")" + "波谷");
                }
            }
        }


    }

    public static Map findPeak(double[] arrayList) {
        if (null == arrayList || arrayList.length <= 3) {
            return null;
        }

        for (int i = 0; i < arrayList.length - 2; i = i + 1) {

            int count = 0;

            if (arrayList[i + 1] > arrayList[i] && arrayList[i + 1] > arrayList[i + 2]) {
                System.out.println("波峰" + arrayList[i] + ":" + arrayList[i + 1] + ":" + arrayList[i + 2]);
            }

            if (arrayList[i + 1] < arrayList[i] && arrayList[i + 1] < arrayList[i + 2]) {
                System.out.println("波谷" + arrayList[i] + ":" + arrayList[i + 1] + ":" + arrayList[i + 2]);

            }

            count++;

        }


        return null;

    }

    public List<String> getWaveAndPeak(List<Double> data) {
        List<String> paramTrendList = new ArrayList<>();

        int direction = data.get(0) > 0 ? -1 : 1;
        for (int i = 0; i < data.size() - 1; i++) {
            if ((data.get(i + 1) - data.get(i)) * direction > 0) {
                direction *= -1;
                if (direction == 1) {
                    // 波峰
                    System.out.println("(" + i + "," + data.get(i) + ")" + "波峰");

                } else {
                    System.out.println("(" + i + "," + data.get(i) + ")" + "波谷");
                }
            }
        }

        return paramTrendList;

    }

    /**
     * 波峰波谷
     *
     * @param wave
     * @return
     */
    public ArrayList peak(Double[] wave) {

        ArrayList arrayList = new ArrayList();
        int direction = wave[0] > 0 ? -1 : 1;
        for (int i = 0; i < wave.length - 1; i++) {
            if ((wave[i + 1] - wave[i]) * direction > 0) {
                direction *= -1;
                if (direction == 1) {
                    System.out.println("(" + i + "," + wave[i] + ")" + "波峰");
                    arrayList.add(wave[i]);
                } else {
                    System.out.println("(" + i + "," + wave[i] + ")" + "波谷");
                    arrayList.add(wave[i]);
                }
            }
        }

        return arrayList;

    }

    /**
     * 三点线性平滑
     *
     * @param in
     * @param
     */
    double[] linearSmooth3(double in[], int num) {
        double out[] = new double[num];
        int i;
        if (num < 3) {
            for (i = 0; i <= num - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (5.0 * in[0] + 2.0 * in[1] - in[2]) / 6.0;

            for (i = 1; i <= num - 2; i++) {
                out[i] = (in[i - 1] + in[i] + in[i + 1]) / 3.0;
            }

            out[num - 1] = (5.0 * in[num - 1] + 2.0 * in[num - 2] - in[num - 3]) / 6.0;
        }

        return out;
    }

    /**
     * 五点线性平滑
     *
     * @param in
     */
    Double[] linearSmooth5(Double in[], int num) {
        Double out[] = new Double[num];
        int i;
        if (num < 5) {
            for (i = 0; i <= num - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (3.0 * in[0] + 2.0 * in[1] + in[2] - in[4]) / 5.0;
            out[1] = (4.0 * in[0] + 3.0 * in[1] + 2 * in[2] + in[3]) / 10.0;
            for (i = 2; i <= num - 3; i++) {
                out[i] = (in[i - 2] + in[i - 1] + in[i] + in[i + 1] + in[i + 2]) / 5.0;
            }
            out[num - 2] = (4.0 * in[num - 1] + 3.0 * in[num - 2] + 2 * in[num - 3] + in[num - 4]) / 10.0;
            out[num - 1] = (3.0 * in[num - 1] + 2.0 * in[num - 2] + in[num - 3] - in[num - 5]) / 5.0;
        }

        return out;
    }

    List<Double> linearSmooth(List<Double> in, int num) {
        ArrayList<Double> out = new ArrayList<>();
        int i;
        if (num < 5) {
            for (i = 0; i <= num - 1; i++) {
                out.add(in.get(i));
            }
        } else {
            out.add(0, (3.0 * in.get(0) + 2.0 * in.get(1) + in.get(2) - in.get(4)) / 5.0);
            out.add(1, (4.0 * in.get(0) + 3.0 * in.get(1) + 2 * in.get(2) + in.get(3)) / 10.0);
            for (i = 2; i <= num - 3; i++) {
                out.add(i, (in.get(i - 2) + in.get(i - 1) + in.get(i) + in.get(i + 1) + in.get(i + 2)) / 5.0);
            }
            out.add(num - 2, (4.0 * in.get(num - 1) + 3.0 * in.get(num - 2) + 2.0 * in.get(num - 3) + in.get(num - 4)) / 10.0);
            out.add(num - 1, (3.0 * in.get(num - 1) + 2.0 * in.get(num - 2) + in.get(num - 3) - in.get(num - 5)) / 5.0);
        }

        return out;
    }

    /**
     * 七点线性平滑
     *
     * @param in
     * @param N
     */
    double[] linearSmooth7(double in[], int N) {
        double out[] = new double[N];
        int i;
        if (N < 7) {
            for (i = 0; i <= N - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (13.0 * in[0] + 10.0 * in[1] + 7.0 * in[2] + 4.0 * in[3] +
                    in[4] - 2.0 * in[5] - 5.0 * in[6]) / 28.0;

            out[1] = (5.0 * in[0] + 4.0 * in[1] + 3 * in[2] + 2 * in[3] +
                    in[4] - in[6]) / 14.0;

            out[2] = (7.0 * in[0] + 6.0 * in[1] + 5.0 * in[2] + 4.0 * in[3] +
                    3.0 * in[4] + 2.0 * in[5] + in[6]) / 28.0;

            for (i = 3; i <= N - 4; i++) {
                out[i] = (in[i - 3] + in[i - 2] + in[i - 1] + in[i] + in[i + 1] + in[i + 2] + in[i + 3]) / 7.0;
            }

            out[N - 3] = (7.0 * in[N - 1] + 6.0 * in[N - 2] + 5.0 * in[N - 3] +
                    4.0 * in[N - 4] + 3.0 * in[N - 5] + 2.0 * in[N - 6] + in[N - 7]) / 28.0;

            out[N - 2] = (5.0 * in[N - 1] + 4.0 * in[N - 2] + 3.0 * in[N - 3] +
                    2.0 * in[N - 4] + in[N - 5] - in[N - 7]) / 14.0;

            out[N - 1] = (13.0 * in[N - 1] + 10.0 * in[N - 2] + 7.0 * in[N - 3] +
                    4 * in[N - 4] + in[N - 5] - 2 * in[N - 6] - 5 * in[N - 7]) / 28.0;
        }

        return out;
    }


    /**
     * 五点二次函数拟合平滑
     *
     * @param in
     * @param N
     */
    double[] quadraticSmooth5(double in[], int N) {
        double out[] = new double[N];
        int i;
        if (N < 5) {
            for (i = 0; i <= N - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (31.0 * in[0] + 9.0 * in[1] - 3.0 * in[2] - 5.0 * in[3] + 3.0 * in[4]) / 35.0;
            out[1] = (9.0 * in[0] + 13.0 * in[1] + 12 * in[2] + 6.0 * in[3] - 5.0 * in[4]) / 35.0;
            for (i = 2; i <= N - 3; i++) {
                out[i] = (-3.0 * (in[i - 2] + in[i + 2]) +
                        12.0 * (in[i - 1] + in[i + 1]) + 17 * in[i]) / 35.0;
            }
            out[N - 2] = (9.0 * in[N - 1] + 13.0 * in[N - 2] + 12.0 * in[N - 3] + 6.0 * in[N - 4] - 5.0 * in[N - 5]) / 35.0;
            out[N - 1] = (31.0 * in[N - 1] + 9.0 * in[N - 2] - 3.0 * in[N - 3] - 5.0 * in[N - 4] + 3.0 * in[N - 5]) / 35.0;
        }

        return out;
    }


    /**
     * 七点二次函数拟合平滑
     *
     * @param in
     * @param
     * @param N
     */
    double[] quadraticSmooth7(double in[], int N) {
        double out[] = new double[N];
        int i;
        if (N < 7) {
            for (i = 0; i <= N - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (32.0 * in[0] + 15.0 * in[1] + 3.0 * in[2] - 4.0 * in[3] -
                    6.0 * in[4] - 3.0 * in[5] + 5.0 * in[6]) / 42.0;

            out[1] = (5.0 * in[0] + 4.0 * in[1] + 3.0 * in[2] + 2.0 * in[3] +
                    in[4] - in[6]) / 14.0;

            out[2] = (1.0 * in[0] + 3.0 * in[1] + 4.0 * in[2] + 4.0 * in[3] +
                    3.0 * in[4] + 1.0 * in[5] - 2.0 * in[6]) / 14.0;
            for (i = 3; i <= N - 4; i++) {
                out[i] = (-2.0 * (in[i - 3] + in[i + 3]) +
                        3.0 * (in[i - 2] + in[i + 2]) +
                        6.0 * (in[i - 1] + in[i + 1]) + 7.0 * in[i]) / 21.0;
            }
            out[N - 3] = (1.0 * in[N - 1] + 3.0 * in[N - 2] + 4.0 * in[N - 3] +
                    4.0 * in[N - 4] + 3.0 * in[N - 5] + 1.0 * in[N - 6] - 2.0 * in[N - 7]) / 14.0;

            out[N - 2] = (5.0 * in[N - 1] + 4.0 * in[N - 2] + 3.0 * in[N - 3] +
                    2.0 * in[N - 4] + in[N - 5] - in[N - 7]) / 14.0;

            out[N - 1] = (32.0 * in[N - 1] + 15.0 * in[N - 2] + 3.0 * in[N - 3] -
                    4.0 * in[N - 4] - 6.0 * in[N - 5] - 3.0 * in[N - 6] + 5.0 * in[N - 7]) / 42.0;
        }

        return out;
    }


    /**
     * 五点三次平滑
     */
    double[] cubicSmooth5(double in[], int N) {
        double out[] = new double[N];
        int i;
        if (N < 5) {
            for (i = 0; i <= N - 1; i++)
                out[i] = in[i];
        } else {
            out[0] = (69.0 * in[0] + 4.0 * in[1] - 6.0 * in[2] + 4.0 * in[3] - in[4]) / 70.0;
            out[1] = (2.0 * in[0] + 27.0 * in[1] + 12.0 * in[2] - 8.0 * in[3] + 2.0 * in[4]) / 35.0;
            for (i = 2; i <= N - 3; i++) {
                out[i] = (-3.0 * (in[i - 2] + in[i + 2]) + 12.0 * (in[i - 1] + in[i + 1]) + 17.0 * in[i]) / 35.0;
            }
            out[N - 2] = (2.0 * in[N - 5] - 8.0 * in[N - 4] + 12.0 * in[N - 3] + 27.0 * in[N - 2] + 2.0 * in[N - 1]) / 35.0;
            out[N - 1] = (-in[N - 5] + 4.0 * in[N - 4] - 6.0 * in[N - 3] + 4.0 * in[N - 2] + 69.0 * in[N - 1]) / 70.0;
        }
        return out;
    }

    /**
     * 七点三次平滑
     *
     * @param in
     * @param out
     * @param N
     */
    double[] cubicSmooth7(double in[], int N) {
        double out[] = new double[N];
        int i;
        if (N < 7) {
            for (i = 0; i <= N - 1; i++) {
                out[i] = in[i];
            }
        } else {
            out[0] = (39.0 * in[0] + 8.0 * in[1] - 4.0 * in[2] - 4.0 * in[3] +
                    1.0 * in[4] + 4.0 * in[5] - 2.0 * in[6]) / 42.0;
            out[1] = (8.0 * in[0] + 19.0 * in[1] + 16.0 * in[2] + 6.0 * in[3] -
                    4.0 * in[4] - 7.0 * in[5] + 4.0 * in[6]) / 42.0;
            out[2] = (-4.0 * in[0] + 16.0 * in[1] + 19.0 * in[2] + 12.0 * in[3] +
                    2.0 * in[4] - 4.0 * in[5] + 1.0 * in[6]) / 42.0;
            for (i = 3; i <= N - 4; i++) {
                out[i] = (-2.0 * (in[i - 3] + in[i + 3]) +
                        3.0 * (in[i - 2] + in[i + 2]) +
                        6.0 * (in[i - 1] + in[i + 1]) + 7.0 * in[i]) / 21.0;
            }
            out[N - 3] = (-4.0 * in[N - 1] + 16.0 * in[N - 2] + 19.0 * in[N - 3] +
                    12.0 * in[N - 4] + 2.0 * in[N - 5] - 4.0 * in[N - 6] + 1.0 * in[N - 7]) / 42.0;
            out[N - 2] = (8.0 * in[N - 1] + 19.0 * in[N - 2] + 16.0 * in[N - 3] +
                    6.0 * in[N - 4] - 4.0 * in[N - 5] - 7.0 * in[N - 6] + 4.0 * in[N - 7]) / 42.0;
            out[N - 1] = (39.0 * in[N - 1] + 8.0 * in[N - 2] - 4.0 * in[N - 3] -
                    4.0 * in[N - 4] + 1.0 * in[N - 5] + 4.0 * in[N - 6] - 2.0 * in[N - 7]) / 42.0;
        }

        return out;
    }


}

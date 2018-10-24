package peak;

public class RCTest {

    public static void main(String[] args) {

        double[] ints ={571.00,572.00,573.00,574.00,587.00,1000,2000,3000,4000,5000,6000,7000};
       // double[] ints={  378.00, 378.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00, 377.00};
        double temp=0;
        for(int i=0; i< ints.length; i++){

            if(i==0){
                temp=ints[i+1];
            }

             temp = filter(ints[i], temp, 30);
            System.out.println(temp);
        }






    }

    public static double filter(double NEW_DATA,double OLD_DATA,double k){
        double result;
        if(NEW_DATA<OLD_DATA)
        {
            result=OLD_DATA-NEW_DATA;
            result=result*k;
            result=result+128;
            result=result/256;
            result=OLD_DATA-result;
        }
        else if(NEW_DATA>OLD_DATA)
        {
            result=NEW_DATA-OLD_DATA;
            result=result*k;
            result=result+128;
            result=result/256;
            result=OLD_DATA-result;
        }
        else result=OLD_DATA;
        return result;

    }
}

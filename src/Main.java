import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nam = {3.3 ,-2.2, 2.3, 2.5, - 2.9, 3.3, -2.8, 4.3, -3.3, 3.8 , 3.9, 4.3, 4.2, 6.5, 3.6};
        double leng = 0.0;
        int reac = 0;
       boolean bul = false;
       for (double f : nam ){
           if (f < 0){
               bul = true;
           }else if (bul){
               reac++;
               leng = leng + f;
           }
       }
        System.out.println(reac/leng);
    }














    public static void Sort(double [] array){
        double[] numbers = {21.4, -2.4, 12.3, -31.6, 43.5, 31.8, 45.5, -32.8, 45.9, 4.3, 4.4, 6.6, 98.1, -56.1, 43.3};
        for (int i = 0; i < numbers.length ; i++) {
            double min = numbers[i];
            int min_i = i;
            for (int j = i + 1; j <numbers.length ; j++) {
                if (numbers[j] < min){
                    min = array[j];
                    min_i = j;

                }

            }
            if (i!=min_i){
                double tmp = numbers[i];
                numbers [i] = numbers[min_i];
                numbers[min_i]=tmp;

            }
            System.out.println(numbers[i]+"_____________");


        }



    }

}

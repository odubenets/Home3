package org.example;

public class Massiv3 {
    public void testmass (){
        int[] arr = {2,5,7,9,4};
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0) {
                int x = arr[i];
                sum1 = sum1 + arr[i];
            }
                int a = arr[i + 1];
                sum2 = sum2 + arr[i + 1];
            }
            int raz = sum1 - sum2;
            System.out.println(raz);


            }
        }


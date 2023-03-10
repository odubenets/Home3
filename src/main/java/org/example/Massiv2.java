package org.example;

public class Massiv2 {
    public void testmassiv(){
        int[]arr = {1, 5, 10, 7,4};
        int min = arr[0];
        int max = arr[arr.length -1];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
            max = arr[i];
        }
        int sum = min + max;
        System.out.println(sum);

        }

    }


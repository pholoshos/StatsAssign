package  com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public  class Main {


    public static void main(String[] args) {
        int[][] numbers = {{4,9,7,3},{4,7,3,5}};

        int[][] sumAndSq = {{15,57},{18,90},{20,122},{18,90},{20,122},{23,155},{18,90},{20,122},{23,155},{19,97},{21,129},{24,162}};
        int sum = 18;
        int finalSum = 0;
        int finalSquare =0;
        boolean isFound = false;

        for(int i = 0;i<numbers.length;i++){
            finalSum = 0;
            finalSquare =0;
            isFound = false;

            for(int j = 0;j<numbers[i].length;j++){
                finalSum += numbers[i][j];
                finalSquare += (numbers[i][j]*numbers[i][j]);

            }
            for(int x = 0;x< sumAndSq.length;x++){
                if(sumAndSq[x][0] == finalSum && sumAndSq[x][1] == finalSquare ){

                    isFound = true;
                    // System.out.println(numbers[i].toString()+" is on activity");
                    // System.out.println("sum is "+finalSum);
                    //System.out.println("sq sum is "+finalSquare);
                }else{
                    //System.out.println(numbers[i]+" is not on activity");
                }
            }
            if(isFound){
                for (int num:numbers[i]){
                    System.out.print(num+", ");
                }
                System.out.print(" is on activity");
                System.out.println(" ,sum is "+finalSum);
                System.out.println("sq sum is "+finalSquare);
            }else{
                for (int num:numbers[i]){
                    System.out.print(num+ ", ");
                }
                System.out.print(" is not on activity");
                System.out.println();
                System.out.println();
            }

        }

    }

}













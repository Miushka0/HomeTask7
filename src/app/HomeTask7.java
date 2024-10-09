package app;

import java.util.Arrays;
import java.util.Random;

public class HomeTask7 {
    public static void main(String[] args){
        Random random = new Random();
        int[] arrayInt = new int[20];

        int totalSum = 0;
        for (int index = 0; index < arrayInt.length; index++){
            totalSum += index;
            arrayInt[index] = random.nextInt(201) -100;
        }

        int evenSum = 0;
        int oddSum = 0;
        int negativeSum = 0;
        int minValue = 0;
        int minIndex = 0;
        int maxValue = 0;
        int maxIndex = 0;
        // Determining the sum of even, odd and negative numbers
        for (int i = 0; i < arrayInt.length ;  i++) {
            int currentNumber = arrayInt[i];
            // check for negative values
            if (currentNumber < 0) {
                negativeSum += currentNumber;
            }

            // check for even/odd values
            if (currentNumber % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }

            // check for min value
            if (currentNumber < minValue) {
                minValue = currentNumber;
                minIndex = i;
            }

            // check for max value
            if (currentNumber > maxValue) {
                maxValue = currentNumber;
                maxIndex = i;
            }
        }

        System.out.print("Елементи масиву:" + Arrays.toString(arrayInt));
        System.out.println("\nСума від'ємних чисел: " + negativeSum);
        System.out.println("Кількість парних чисел: " + evenSum );
        System.out.println("Кількість непарних чисел: " + oddSum);
        System.out.println("Найменший елемент: " + minValue + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxValue + " (з індексом " + maxIndex + ")");

        // found first negative number and arithmetic mean
        boolean foundNegative = false;
        int sumAfterNegative = 0;
        int countAfterNegative = 0;

        for (int num : arrayInt) {
            if (foundNegative) {
                sumAfterNegative += num;
                countAfterNegative++;
            } else if (num < 0) {
                foundNegative = true;
            }
        }

        if (countAfterNegative > 0) {
            double averageAfterNegative = (double) sumAfterNegative / countAfterNegative;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", averageAfterNegative);
        } else {
            System.out.println("Від'ємних чисел немає в масиві.");
        }

    }

}

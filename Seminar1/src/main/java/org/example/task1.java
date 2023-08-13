package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //todo: переделать
        int sum = 0;
        sum = getSum(n, sum);
        System.out.println(sum);
        
    }

    /**
     * @apiNote Задача
     * @param n число итераций
     * @param sum
     * @return
     */
    private static int getSum(int n, int sum) {
        for (int i = 1; i <= n; i++) {
            sum += 1;
        }
        return sum;
    }
}

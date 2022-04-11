package com.greatlerning.paymoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the values of array");
		for (int j = 0; j < size; j++) {
			array[j] = sc.nextInt();

		}

		System.out.println("\nEnter the total number of  target that need to be achieved");
		int targetNum = sc.nextInt();
		while (targetNum-- != 0) {
			int flag = 0;
			System.out.println("\nEnter the target value");
			int target = sc.nextInt();
		

			for (i = 0; i < size; i++) {
				sum = sum + array[i];
				if (sum >= target) {
					System.out.println("target achieved after " + (i + 1) + " transaction");
					flag = 1;

					break;
				}
			}
			if (flag == 0) {

				System.out.println("target not achieved");

			}

		}

	}
}

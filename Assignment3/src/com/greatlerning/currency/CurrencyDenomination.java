package com.greatlerning.currency;

import java.util.Scanner;

public class CurrencyDenomination {

	public void sort(int[] arr, int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int k = 0; k < n - 1; k++)
				if (arr[k] < arr[k + 1]) {
					temp = arr[k + 1];
					arr[k + 1] = arr[k];
					arr[k] = temp;
				}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int n = sc.nextInt();
		int[] notes = new int[n];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < n; i++) {
			notes[i] = sc.nextInt();
		}
		CurrencyDenomination obj = new CurrencyDenomination();
		obj.sort(notes, n);
		System.out.println("Enter the amount you want to pay");

		int amount = sc.nextInt();
		int[] counter = new int[n];
		sc.close();
		for (int i = 0; i < n; i++) {
			if (amount >= notes[i]) {
				counter[i] = amount / notes[i];
				amount = amount - counter[i] * notes[i];

			}
		}
		if (amount > 0) {
			System.out.println("exact amount can not be given higest denomination");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < n; i++) {

				if (counter[i] != 0) {
					System.out.println(notes[i] + ":" + counter[i]);
				}
			}

		}

	}

}

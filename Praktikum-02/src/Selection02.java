//package com.ibik.praktikum02;
import java.util.Scanner;

public class Selection02 {
	public static void main(String[] args) {
	String x;
	int y;
	Scanner input = new Scanner(System.in);
	
	System.out.println("X: ");
	x = input.nextLine();
	System.out.println("Y: ");
	y = input.nextInt();
	input.close();
	
	System.out.println("Nilai x : "+ x);
	System.out.println("Nilai y : "+ y);
	
	switch (x) {
	case "PBO": {
		System.out.println("Anda benar");
		break;
	 }
	default:
		System.out.println("Anda salah");
	}	
	switch (y) {
	case 2: {
		System.out.println("Nilai y adalah 2");
		}
	default:
		System.out.println("Nilain y bukan 2");
		}
	switch () {
	case true: {
		System.out.println("X lebih besar dari y");
		break;
		}
	default:
		System.out.println("nilai x lebih kecil");
	}
 }
}
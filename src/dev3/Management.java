package dev3;
import java.util.Scanner;

public class Management {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Nhâp n : ");
		int n = sc.nextInt();

		System.out.print("Nhap Integer: \n");
		Array<Integer> arr[] = new Array[n];
		Integer(arr);
		Print(arr);

		System.out.printf("\n\nNhap String:");
		Array<String> arr2[] = new Array[n];
		String(arr2);
		Print(arr2);

		System.out.printf("\n\\nNhap Character: ");
		Array<Character> arr3[] = new Array[n];
		String(arr3);
		Print(arr3);
	}

	public static <T> void Integer(Array<T> arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.printf("Nhap [%d]: ", i);
			int x = sc.nextInt();
			arr[i] = new Array(x);
		}
	}
	public static <T> void String(Array<T> arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.printf("\nNhap [%d]: ", i);
			String x = sc.next();
			arr[i] = new Array(x);
		}
	}
	public static <T> void Char(Array<T> arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.printf("\nNhap [%d]: ", i);
			char x = sc.next().charAt(0);
			arr[i] = new Array(x);	
		}
	}
	public static <T> void Print(Array<T> arr[]) {
		System.out.print("Xuat mang: \n");
		for(int i=0; i< arr.length; i++) {
			System.out.printf("[%d]: " + arr[i].getY1() + "\t", i);
		}
	}
}
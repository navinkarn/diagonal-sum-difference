package com.example.diagonaldifference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiagonalDifferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagonalDifferenceApplication.class, args);
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int left_to_right =0;
		int right_to_left=0;
		int rows = arr.length;
		int columns = arr[0].length;
		int i=0, j=0, k=0, l=arr.length -1;

		while (i < rows && j < columns && k < rows && l >= 0) {
			left_to_right += arr[i][j];
			right_to_left += arr[k][l];
			i +=1;
			j+=1;
			k+=1;
			l-=1;

		}
		int diff = Math.abs(left_to_right -right_to_left);
		System.out.println("The difference of diagonal sum is:" +diff);
	}

}

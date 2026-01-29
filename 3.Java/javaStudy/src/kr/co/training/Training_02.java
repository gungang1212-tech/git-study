package kr.co.training;

import java.util.Random;

public class Training_02 {

	public static void main(String[] args) {
		// 1. 짝수 출력 for문
		// -  범위 : 1~ 20
		
		for( int i = 1; i <= 20; i++) {
			if( i % 2 == 0) {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println();
		System.out.println();
		//2. 3과 5의 공배수를 출력하는 for문
		// -  범위 : 1~100
			
			for(int i = 1; i <= 100; i++) {
				if( i % 3 == 0 && i % 5 == 0 ) {
					System.out.print(i + " ");
				}
			}
		
			System.out.println();
			System.out.println();
		// 3. 10팩토리얼의 값을 출력하는 for문
		// - 10 팩토리얼 = 1*2*3*4*5*6*7*8*9*10
			int result = 1;
			for( int i = 10; i>=1; i-- ) {
				result *= i;
			}
			System.out.print(result);
			
			System.out.println();
			System.out.println();
		// 4. 별찍기
		//*
		//**
		//***
		//****
		//*****
			
			for(int i=1; i <=5; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			///로또번호 생성하기
			
			
			Random rd = new Random();
			
			for( int i = 0; i < 6; i++) {
				int number = rd.nextInt(45) + 1;
				System.out.print(number + " ");
			}
			
			for(int i = 0; i <3; i++) {
				System.out.println("바깥 for문 i :" + i);
				
				for(int j = 0; j <5; j++) {
					System.out.println("j : " + j);
				}
			}
			
			// 2단부터 9단까지 구구단
			
			for(int i =2; i <=9; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.print( i  + "*" + j + "=" + i*j + " ");
				}
				System.out.println();
			} 
	}

}

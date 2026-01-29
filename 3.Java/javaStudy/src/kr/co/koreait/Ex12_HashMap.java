package kr.co.koreait;

import java.util.HashMap;
import java.util.Scanner;

public class Ex12_HashMap {

	public static void main(String[] args) {
		// HashMap
		// - Key -Value 형태를 가진 자료구조
		// - 순서 보장 x
		// - 키는 중복허용 x, 값은 중복 허용 o
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String key1 = sc.nextLine();
//		map.put(key1, null);
		
		Integer value1 = sc.nextInt();
		map.put(key1, value1);
		sc.nextLine();
		for(String key : map.keySet()) {
			System.out.println(key + " / " +map.get(key));
		} 
		
//		map.remove("키2");
//		
//		System.out.println(map);
//		System.out.println(map.get("키1"));
//		
//		System.out.println(map.keySet());	// 키를 배열 형태로 반환
//		for(String key : map.keySet()) {
//			System.out.println("Key: " + key + ", Value : " + map.get(key));
//		}
//		System.out.println(map.values());	// 값을 배열 형태로 반환
//		
//		for( Integer value: map.values()){
//			System.out.println(value);
//		}
	}

}

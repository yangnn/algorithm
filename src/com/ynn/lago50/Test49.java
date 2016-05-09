package com.ynn.lago50;

import java.util.Scanner;

/**
 * 计算字符串中子串出现的次数
 * @author yangnn
 *
 */
public class Test49 {

	public static void main(String args[]){
		System.out.println("请输入字符串：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("请输入子字符串：");
		String st = sc.nextLine();
		
		int count = 0;
		int start = 0;
		int len = st.length();
		while(start < str.length() - len + 1){
			if(str.substring(start, start+len).equals(st)){
				count++;
				System.out.println(start);
			}
			start++;
		}
		System.out.println("出现次数为" + count);
	}
}

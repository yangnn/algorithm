package com.ynn.lago50;

import java.util.Scanner;

/**
 * �����ַ������Ӵ����ֵĴ���
 * @author yangnn
 *
 */
public class Test49 {

	public static void main(String args[]){
		System.out.println("�������ַ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("���������ַ�����");
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
		System.out.println("���ִ���Ϊ" + count);
	}
}

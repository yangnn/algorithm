package com.ynn.lago50;

import java.util.Scanner;

/**
 * ��Ŀ��һ��ż�����ܱ�ʾΪ��������֮�͡�
 * @author yangnn
 *
 */
public class TestEven44 {

	public static void main(String[] args) {
		System.out.println("������һ��ż����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 != 0 || n == 0){
			System.out.println("��������ȷ��ż��!");
		}
		
		int a,b,c;
		
		for(a = 3; a <= n/2; a+=2){
			for(b = 2; b <= Math.sqrt(a); b++)
				if(a % b == 0) break;
			if(b > Math.sqrt(a)) 
				c = n - a;
			else
				break;
			for(b = 2; b <= Math.sqrt(c); b++)
				if(c % b == 0) break;
			if(b > Math.sqrt(c)) 
				System.out.println(n + "=" + a +"+" + c);
		}
	}
}

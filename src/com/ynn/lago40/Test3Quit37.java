package com.ynn.lago40;

import java.util.Scanner;

/**
 * ��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
 * @author yangnn
 *
 */
public class Test3Quit37 {

	public static void main(String args[]){
		System.out.println("������n��ֵ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n]; 
		for(int i = 0; i <n; i++){
			a[i] = 0;
		}
		
		int t = 0;
		int i = 0;
		while(n > 1){
			if(a[i] == 0){
				t++;
				if(t == 3){
					t = 0;
					a[i] = 1;
					n--;
				}
			}
			i++;
			if(i == a.length){
				i = 0;
			}
		}
		for(int k = 0; k < a.length;k++){
			if(a[k] == 0){
				System.out.println(k+1);
			}
		}
		
	}
}

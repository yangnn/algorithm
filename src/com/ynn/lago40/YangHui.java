package com.ynn.lago40;

import java.util.Scanner;

/**
 * ��Ŀ����ӡ����������Σ�Ҫ���ӡ��10������ͼ�� 
1.��������� 
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
 * @author yangnn
 *
 */
public class YangHui {

	public static void main(String args[]){
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int a[] = new int[line];
		for(int i = 0; i < line; i++){
			a[i] = 1;
		}
		if(line >= 1){
			System.out.println(1);
		}
		if(line >= 2){
			System.out.println(1 + "\t" + 1);
		}
		for(int i = 1; i < line - 1; i++){
			for(int j = i; j > 0; j--){
				a[j] = a[j] + a[j-1];
			}
			for(int k = 0; k < i + 2 ; k++){
				System.out.print(a[k] + "\t");
			}
			System.out.println();
		}
	}
}

package com.ynn.lago20;

import java.util.Scanner;

/**
 * ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿 1.�����������3��5��Ϊ����Ӧ���Ȱ�ǰ�����µļ������� Ȼ���ټ���5�켴����ĵڼ��죬
 * ��������������������·ݴ���3ʱ�迼�Ƕ��һ�졣
 * @author yangnn
 *
 */
public class Testday {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = sc.nextInt();
        System.out.println("�������·ݣ�");
        int month = sc.nextInt();
        System.out.println("������������");
        int day = sc.nextInt();
        int date = 0;
        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0)){
        	arr[1] = 29;
        }
        for(int i = 0; i < month; i++){
        	date += arr[i];
        }
        System.out.println(date);
	}
}

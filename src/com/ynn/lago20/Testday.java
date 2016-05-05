package com.ynn.lago20;

import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？ 1.程序分析：以3月5日为例，应该先把前两个月的加起来， 然后再加上5天即本年的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 * @author yangnn
 *
 */
public class Testday {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入天数：");
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

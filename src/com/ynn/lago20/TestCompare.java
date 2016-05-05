package com.ynn.lago20;

import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。 
 * 1.程序分析：我们想办法把最小的数放到x上，
 * 先将x与y进行比较，如果x>y则将x与y的值进行交换，
 * 然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
 * @author yangnn
 *
 */
public class TestCompare {

	public static void main(String args[]){
		System.out.println("请输入3个整数");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int temp = 0;
		if(x > y){
			temp = y;
			y = x;
			x= temp;
		}
		if(y > z){
			temp = y;
			y = z;
			z= temp;
		}
		if(x > y){
			temp = y;
			y = x;
			x= temp;
		}
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
}

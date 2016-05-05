package com.ynn.lago10;


/**
 * 兔子问题
 * 斐波那契数列求值
 *题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class TestRabbit {

	public static final int MOUTH = 15;
	
//	public static void main(String args[]){
//		long f1 = 1;
//		long f2 = 2;
//		long f;
//		
//		for(int i = 3; i <MOUTH; i++){
//			f = f1 + f2;
//			f1 = f2;
//			f2 = f;
//			System.out.println("第" + i +"个月的兔子对数为" + f2); 
//		}
//	}
	
	//递归方法
	public static void main(String args[]){
		for(int i = 1; i < MOUTH; i++){
			System.out.println("第" + i +"个月的兔子对数为" + fib(i)); 
		}
	}
	
	public static int fib(int mouth){
		if(mouth == 1 || mouth == 2){
			return 1;
		}else{
			return fib(mouth-1) + fib(mouth-2);
		}
	}
	
}

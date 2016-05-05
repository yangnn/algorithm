package com.ynn.lago10;

/**
 *  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 * @author yangnn
 *
 */
public class TestBall {

	public static void main(String args[]){
		
		double sum = 100;
		double temp = 50;
		for(int i = 1; i < 10;i++){
			sum += temp*2;
			temp = temp * 0.5;
		}
		System.out.println(sum);
		System.out.println(temp);
		
	}
}

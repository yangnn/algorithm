package com.ynn.lago20;


/**
 * ��Ŀ����ӡ������ͼ�������Σ� * *** ****** ******** ****** *** *
 * 1.����������Ȱ�ͼ�ηֳ���������������ǰ����һ�����ɣ� ������һ�����ɣ�����˫�� forѭ���� ��һ������У��ڶ�����
 * @author yangnn
 *
 */
public class LingXing {

	public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 8, 6, 3, 1 };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 4; i < arr.length; i++) {
            for (int j = arr[i]; j < 8; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

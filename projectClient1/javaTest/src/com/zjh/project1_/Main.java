package com.zjh.project1_;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int func() throws Exception{
		Scanner scanner=new Scanner(System.in);//��ȡ����
		System.out.println("������1-100֮�������");//��ʾ�û�
		return scanner.nextInt();//�����û����������
	}
	public static void main(String[] args){
		Random random=new Random();//�������
		int randomNum=random.nextInt(100)+1;//����1-100�������
		int inputNum=-1;//�û�����
		int total=0;//�²�Ĵ���
		boolean flag=true;//flag�����ж��Ƿ����ѭ��
		Scanner scanner=new Scanner(System.in);
		while(flag){//�ж��Ƿ����
			flag=false;
			try{
				inputNum=func();//��ȡ�û�������
				total++;//�²������1
			}catch(Exception e){
				flag=true;//�����������Ϊ�������������ѭ��
			}
			if(flag){//�������������ʾ�û��������˴�����ַ���
				System.out.println("���������ַ�");
			}else{//���������Ϊ�������ж��Ƿ�¶ԣ���������ʾ��Ϣ
				flag=true;//����ѭ��
				if(inputNum==randomNum){//���е����
					System.out.println("��ϲ�㣬������");//��ʾ����
					System.out.println("�²���ܴ���Ϊ��"+total);
					System.out.println("�Ƿ����¿�ʼ�����¿�ʼ�����롮1�����������Ϊ�˳�");//��ʾ�û�
					String restart=scanner.nextLine();//����
					if("1".equals(restart)){//�ж��û��Ƿ�����Ϊ��1��
						total=0;//�²��������
						randomNum=random.nextInt(100)+1;//���»�������
					}
					else//����Ϊ�ǡ�1�����
						flag=false;//�˳���ȡ������ѭ��
				}else if(inputNum<randomNum)//����ƫС
					System.out.println("�����������ƫС��");
				else//����ƫ��
					System.out.println("�����������ƫ����");
			}
		}
		System.out.println("��Ϸ����");
	}
}

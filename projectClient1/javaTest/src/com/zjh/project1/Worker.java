package com.zjh.project1;

public class Worker extends Employee{//�̳�Employee��
	private int workTime;//ÿ�µĹ�������
	private double salaryPerDay;//����һ��Ĺ���
	//���캯��
	public Worker(String name, String sex, int age, long id,int workTime,double salaryPerDay) {
		super(name, sex, age, id);//���ø��๹�캯��
		this.workTime=workTime;
		this.salaryPerDay=salaryPerDay;
	}

	@Override
	public double ComputeSalary() {
		salary=workTime*salaryPerDay;//���㹤��,ÿ�¹������������㹤�ʡ�
		return salary;
	}

}

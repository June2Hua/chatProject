package com.zjh.project1;

public class Manager extends Employee{//������̳й�Ա��
	private double salaryPerMonth;//ÿ���¹̶�����
	//���캯��
	public Manager(String name, String sex, int age, long id,double salaryPerMonth) {
		super(name, sex, age, id);//���๹�캯��
		this.salaryPerMonth=salaryPerMonth;
	}
	@Override
	public double ComputeSalary() {
		salary=salaryPerMonth;//���㹤��,ÿ�»��һ�ݹ̶��Ĺ���
		return salary;
	}
}
package com.zjh.project1;

public class Manager extends Employee{//经理类继承雇员类
	private double salaryPerMonth;//每个月固定工资
	//构造函数
	public Manager(String name, String sex, int age, long id,double salaryPerMonth) {
		super(name, sex, age, id);//父类构造函数
		this.salaryPerMonth=salaryPerMonth;
	}
	@Override
	public double ComputeSalary() {
		salary=salaryPerMonth;//计算工资,每月获得一份固定的工资
		return salary;
	}
}
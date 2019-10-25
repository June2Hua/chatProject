package com.zjh.project1;

public class Worker extends Employee{//继承Employee类
	private int workTime;//每月的工作天数
	private double salaryPerDay;//工作一天的工资
	//构造函数
	public Worker(String name, String sex, int age, long id,int workTime,double salaryPerDay) {
		super(name, sex, age, id);//调用父类构造函数
		this.workTime=workTime;
		this.salaryPerDay=salaryPerDay;
	}

	@Override
	public double ComputeSalary() {
		salary=workTime*salaryPerDay;//计算工资,每月工作的天数计算工资。
		return salary;
	}

}

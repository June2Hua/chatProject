package com.zjh.project1;

public class Salesman extends Employee{//销售人员类继承雇员类
	private double basicSalry;//基础工资
	private double commission;//销售提成
	//构造函数
	public Salesman(String name, String sex, int age, long id,double basicSalry,double commission) {
		super(name, sex, age, id);//调用父类构造函数
		this.basicSalry=basicSalry;
		this.commission=commission;
	}

	@Override
	public double ComputeSalary() {
		salary=basicSalry+commission;//计算工资,在基本工资的基础上每月还有销售提成。
		return salary;
	}

}

package com.zjh.project1;

abstract class Employee {//雇员类
	protected String name;//雇员名字
	protected String sex;//雇员性别
	protected int age;//雇员年龄
	protected long id;//雇员编号
	protected double salary;
	public abstract double ComputeSalary();//抽象方法，用于计算工资
	//构造函数
	public Employee(String name, String sex, int age, long id) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
	}

	//生成get和set方法
	public String getName() {
		return name;//返回名字
	}
	public void setName(String name) {
		this.name = name;//修改名字
	}
	public String getSex() {
		return sex;//返回性别
	}
	public void setSex(String sex) {
		this.sex = sex;//修改性别
	}
	public int getAge() {
		return age;//返回年龄
	}
	public void setAge(int age) {
		this.age = age;//修改年龄
	}
	public long getId() {
		return id;//返回id
	}
	public void setId(long id) {
		this.id = id;//修改id
	}
	public double getSalary() {
		return salary;//返回工资
	}
	public void setSalary(double salary) {
		this.salary = salary;//修改工资
	}
	
}

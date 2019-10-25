package com.zjh.project1;

public class MyClass {
	public static void main(String[] args) {
		//创建对象
		Employee manager=new Manager("张三", "男", 26, 930212, 8000);
		Employee salesman=new Salesman("李四", "女", 20, 990819, 5000, 2000);
		Employee worker=new Worker("王五", "男", 29, 900729, 26, 260);
		//输出工资
		System.out.println(manager.getName()+"的工资为:"+manager.ComputeSalary());
		System.out.println(salesman.getName()+"的工资为:"+salesman.ComputeSalary());
		System.out.println(worker.getName()+"的工资为:"+worker.ComputeSalary());
	}		
}

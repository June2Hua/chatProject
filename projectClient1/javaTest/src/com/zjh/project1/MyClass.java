package com.zjh.project1;

public class MyClass {
	public static void main(String[] args) {
		//��������
		Employee manager=new Manager("����", "��", 26, 930212, 8000);
		Employee salesman=new Salesman("����", "Ů", 20, 990819, 5000, 2000);
		Employee worker=new Worker("����", "��", 29, 900729, 26, 260);
		//�������
		System.out.println(manager.getName()+"�Ĺ���Ϊ:"+manager.ComputeSalary());
		System.out.println(salesman.getName()+"�Ĺ���Ϊ:"+salesman.ComputeSalary());
		System.out.println(worker.getName()+"�Ĺ���Ϊ:"+worker.ComputeSalary());
	}		
}

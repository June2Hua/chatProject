package com.zjh.project1;

public class Salesman extends Employee{//������Ա��̳й�Ա��
	private double basicSalry;//��������
	private double commission;//�������
	//���캯��
	public Salesman(String name, String sex, int age, long id,double basicSalry,double commission) {
		super(name, sex, age, id);//���ø��๹�캯��
		this.basicSalry=basicSalry;
		this.commission=commission;
	}

	@Override
	public double ComputeSalary() {
		salary=basicSalry+commission;//���㹤��,�ڻ������ʵĻ�����ÿ�»���������ɡ�
		return salary;
	}

}

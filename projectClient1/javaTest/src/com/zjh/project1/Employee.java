package com.zjh.project1;

abstract class Employee {//��Ա��
	protected String name;//��Ա����
	protected String sex;//��Ա�Ա�
	protected int age;//��Ա����
	protected long id;//��Ա���
	protected double salary;
	public abstract double ComputeSalary();//���󷽷������ڼ��㹤��
	//���캯��
	public Employee(String name, String sex, int age, long id) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
	}

	//����get��set����
	public String getName() {
		return name;//��������
	}
	public void setName(String name) {
		this.name = name;//�޸�����
	}
	public String getSex() {
		return sex;//�����Ա�
	}
	public void setSex(String sex) {
		this.sex = sex;//�޸��Ա�
	}
	public int getAge() {
		return age;//��������
	}
	public void setAge(int age) {
		this.age = age;//�޸�����
	}
	public long getId() {
		return id;//����id
	}
	public void setId(long id) {
		this.id = id;//�޸�id
	}
	public double getSalary() {
		return salary;//���ع���
	}
	public void setSalary(double salary) {
		this.salary = salary;//�޸Ĺ���
	}
	
}

package com.zjh.project3;

public class Station extends Thread{
	public static int total=20;//Ʊ������
	
	public Station(String name){
		super(name);//���ø��๹�캯������ʼ���߳�����
	}
	
	@Override
	public void run() {
		//��дrun ����
		while(true){//������ʣƱ���������Ʊ
			synchronized (this.getClass()) {//�������
				if(total>0){//�����д�Ʊ
					System.out.println(getName()+"�����˵�"+(21-total)+"��Ʊ��");//�����Ʊ���
					total--;//��Ʊ��Ʊ����1
				}else{//Ʊ��Ϊ0
					break;
				}
				
			}
			try{
				sleep(1000);//��ǰ�߳�����1��
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}


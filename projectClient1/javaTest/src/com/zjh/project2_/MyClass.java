package com.zjh.project2_;
import java.awt.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("Menu");//���
		MenuBar bar=new MenuBar();//�˵���
		//��������ò˵���
		frame.setMenuBar(bar);
		Menu fileMenu=new Menu("File");//file�˵�
		Menu formatMenu=new Menu("Format");//format�˵�
		Menu helpMenu=new Menu("Help");//help�˵�
		Menu binaryMenu=new Menu("����");//format�Ĳ˵�
		//���ò˵���������
		bar.add(fileMenu);
		bar.add(formatMenu);
		bar.add(helpMenu);
		MenuItem chinaItem=new MenuItem("����");//format�Ĳ˵���
		MenuItem binaryItem=new MenuItem("������");//format�Ĳ˵���
		MenuItem octItem=new MenuItem("�˽���");//format�Ĳ˵���
		MenuItem decItem=new MenuItem("ʮ����");//format�Ĳ˵���
		//���ò˵�Format�Ĳ˵���
		formatMenu.add(chinaItem);
		formatMenu.add(binaryMenu);
		//���ò˵����ƵĲ˵���
		binaryMenu.add(binaryItem);
		binaryMenu.add(octItem);
		binaryMenu.add(decItem);
		frame.setSize(new Dimension(300,200));//���ô�С
		frame.setVisible(true);//��ʾ
	}

}

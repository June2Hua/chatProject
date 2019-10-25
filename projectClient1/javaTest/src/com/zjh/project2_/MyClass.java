package com.zjh.project2_;
import java.awt.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("Menu");//框架
		MenuBar bar=new MenuBar();//菜单栏
		//框架中设置菜单栏
		frame.setMenuBar(bar);
		Menu fileMenu=new Menu("File");//file菜单
		Menu formatMenu=new Menu("Format");//format菜单
		Menu helpMenu=new Menu("Help");//help菜单
		Menu binaryMenu=new Menu("进制");//format的菜单
		//设置菜单栏的内容
		bar.add(fileMenu);
		bar.add(formatMenu);
		bar.add(helpMenu);
		MenuItem chinaItem=new MenuItem("中文");//format的菜单项
		MenuItem binaryItem=new MenuItem("二进制");//format的菜单项
		MenuItem octItem=new MenuItem("八进制");//format的菜单项
		MenuItem decItem=new MenuItem("十进制");//format的菜单项
		//设置菜单Format的菜单项
		formatMenu.add(chinaItem);
		formatMenu.add(binaryMenu);
		//设置菜单进制的菜单项
		binaryMenu.add(binaryItem);
		binaryMenu.add(octItem);
		binaryMenu.add(decItem);
		frame.setSize(new Dimension(300,200));//设置大小
		frame.setVisible(true);//显示
	}

}

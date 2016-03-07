package com.justwin.dp.decorator.learn;


/**
 * 
 * @author justwin
 * @date 2016年3月7日
 * @version 1.0
 * @description 装饰者模式：通常是装饰原有类的核心职责或主要行为。新的装饰类仅仅是为了满足一些只在特殊情况下需要执行的特殊行为，
 * 装饰者模式是一个不错的解决方案。 举例：数据过滤器
 */
public class Main {

	public static void main(String[] args) {
		
		PersonOperator person = new PersonOperator(); // 原有类
		Decorator decorator = new Decorator(); // 装饰类
	
		decorator.setOperator(person); 
		
		HatDecorator hatDecorator = new HatDecorator(); //
		hatDecorator.setOperator(decorator);
	
		TShirtDecorator tShirtDecorator = new TShirtDecorator(); //
		tShirtDecorator.setOperator(hatDecorator);
	
		tShirtDecorator.operation();
	}
}

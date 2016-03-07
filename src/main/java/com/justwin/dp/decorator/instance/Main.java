package com.justwin.dp.decorator.instance;

public class Main {

	public static void main(String[] args) {
		Decrease decrease = new Decrease();  // 实际操作
		Plus plus = new Plus(); // 实际操作
	
		Formator formator = new Formator();
		ShowFormator showFormator = new ShowFormator(); // 具体装饰类
		
		showFormator.setCalculator(plus);
		showFormator.calculate(100, 50);
		
		showFormator.setCalculator(decrease);
		showFormator.calculate(20, 10);
	}
}

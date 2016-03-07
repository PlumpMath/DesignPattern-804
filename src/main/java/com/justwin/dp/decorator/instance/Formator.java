package com.justwin.dp.decorator.instance;

/**
 * 
 * @author justwin
 * @date 2016年3月7日
 * @version 1.0
 * @description 装饰者
 */
public class Formator implements Calculator {

	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public long calculate(long num1, long num2) {
		System.out.println("Formator do");
		return calculator.calculate(num1, num2);
	}
	
}

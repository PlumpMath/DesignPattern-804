package com.justwin.dp.decorator.instance;

public class ShowFormator extends Formator {

	@Override
	public long calculate(long num1, long num2) {
		long sum = super.calculate(num1, num2);
		System.out.println("ShowFormator do");
		System.out.println("Sum:" + sum);   // 装饰内容
		return sum;
	}
}

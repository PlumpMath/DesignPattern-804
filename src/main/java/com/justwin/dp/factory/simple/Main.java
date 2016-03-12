package com.justwin.dp.factory.simple;

/**
 * 
 * @author justwin
 * @date 2016年3月12日
 * @version 1.0
 * @description Simple factory. 扩展方便
 */
public class Main {

	public static void main(String[] args) {
		
		OperatorFactory operatorFactory = new OperatorFactory();
		
		Operator operator = operatorFactory.createOperator('+');
		operator.setNum1(146L);
		operator.setNum2(37L);
		System.out.println(operator + " result: " +  operator.operation());
		
		operator = operatorFactory.createOperator('-');
		operator.setNum1(146L);
		operator.setNum2(37L);
		System.out.println(operator + " result: " +  operator.operation());
		
//		operatorFactory.createOperator('=');
	
	}
}

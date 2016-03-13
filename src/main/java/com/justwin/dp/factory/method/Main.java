package com.justwin.dp.factory.method;

/**
 * 
 * @author justwin
 * @date 2016年3月12日
 * @version 1.0
 * @description Factory method.遵循"开放－封闭"原则，当需要扩展Operator类时 不需要修改factory类，将选择Operator的职能由Server端转移到client端
 */
public class Main {

	public static void main(String[] args) {
		
		OperatorFactory operatorFactory = new MinusOperatorFactory();
		Operator operator = operatorFactory.createOperator('-');
		operator.setNum1(134L);
		operator.setNum1(27L);
		System.out.println(operator + " result: " +  operator.operation());
		
		operatorFactory = new AddOperatorFactory();
		operator = operatorFactory.createOperator('+');
		operator.setNum1(134L);
		operator.setNum1(27L);
		System.out.println(operator + " result: " +  operator.operation());
	}
}

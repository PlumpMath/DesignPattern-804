package com.justwin.dp.factory.simple;

public class OperatorFactory {

	public Operator createOperator(char op) {
		
		switch (op) {
			case '+':
				return new AddOperator();
			case '-':
				return new MinusOperator();
			default:
				throw new IllegalArgumentException("Unsupport operator!");
		}
	}
}

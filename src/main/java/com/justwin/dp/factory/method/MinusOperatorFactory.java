package com.justwin.dp.factory.method;

public class MinusOperatorFactory implements OperatorFactory {

	public Operator createOperator(char op) {
		if ('-' == op) {
			return new MinusOperator();
		} else {
			throw new IllegalArgumentException("Wrong input: " + op);
		}
	}

}

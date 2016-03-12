package com.justwin.dp.factory.method;

public class AddOperatorFactory implements OperatorFactory {

	public Operator createOperator(char op) {
		if ('+' == op) {
			return new AddOperator();
		} else {
			throw new IllegalArgumentException("Wrong input: " + op);
		}
	}

}

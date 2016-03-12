package com.justwin.dp.factory.method;

public class MinusOperator extends Operator {

	@Override
	public long operation() {
		return num1 - num2;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

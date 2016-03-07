package com.justwin.dp.decorator.learn;


public class Decorator implements Operator {
	
	private Operator operator;

	public Decorator() {
		
	}
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public void operation() {
		if (operator != null) {
			operator.operation();
		}
	}

}

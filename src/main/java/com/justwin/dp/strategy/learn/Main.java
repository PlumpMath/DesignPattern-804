package com.justwin.dp.strategy.learn;

public class Main {

	public static void main(String[] args) {
		Full500Discount full500Discount = new Full500Discount();
		Percent80Discount percent80Discount = new Percent80Discount();
	
		Supermarket supermarket = new Supermarket(full500Discount);
		supermarket.showBill(supermarket.payBill(2000L));
	
		supermarket = new Supermarket(percent80Discount);
		supermarket.showBill(supermarket.payBill(300L));
	}
}

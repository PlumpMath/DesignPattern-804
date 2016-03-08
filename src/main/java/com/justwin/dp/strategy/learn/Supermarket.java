package com.justwin.dp.strategy.learn;

public class Supermarket {

	private Discount discount;

	public Supermarket(Discount discount) {
		this.discount = discount;
	}
	
	public long payBill(long bill) {
		return discount.discount(bill);
	}
	
	public void showBill(long bill) {
		System.out.println("支付: " + bill + ", 优惠方式: " + discount.toString());
	}
}

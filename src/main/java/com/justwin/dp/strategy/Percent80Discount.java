package com.justwin.dp.strategy;

public class Percent80Discount implements Discount {

	public long discount(long bill) {
		if (bill > 0) {
			return (long) (bill * 0.8);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "8折优惠";
	}
}

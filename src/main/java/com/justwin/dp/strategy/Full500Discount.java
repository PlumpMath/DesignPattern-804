package com.justwin.dp.strategy;

public class Full500Discount implements Discount {

	public long discount(long bill) {
		if (bill >= 500) {
			return bill - 100L;
		}
		return bill;
	}

	@Override
	public String toString() {
		return "满500减100";
	}
}

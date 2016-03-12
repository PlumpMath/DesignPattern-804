package com.justwin.dp.proxy;

public class Proxy implements Subject {
	
	private Subject realDo;

	public void execute(String thing) {
		if (realDo != null) {
			realDo.execute(thing);
		} else {
			System.out.println("Nobody do!");
		}
	}

	public void setRealDo(Subject realDo) {
		this.realDo = realDo;
	}
	
}

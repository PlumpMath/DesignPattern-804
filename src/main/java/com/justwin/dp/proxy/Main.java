package com.justwin.dp.proxy;

/**
 * 
 * @author justwin
 * @date 2016年3月12日
 * @version 1.0
 * @description static proxy
 */
public class Main {
	
	public static void main(String[] args) {
		RealSubject zhansan = new RealSubject("Zhang san");
		RealSubject lisi = new RealSubject("Li si");
	
		// 实例化 代理
		Proxy proxy = new Proxy();
		proxy.execute("swim");
		
		proxy.setRealDo(zhansan);
		proxy.execute("swim");
		
		proxy.setRealDo(lisi);
		proxy.execute("play game");
	}

}

package com.justwin.dp.builder;

/**
 * 
 * @author justwin
 * @date 2016年3月21日
 * @version 1.0
 * @description 建造者模式。对于建造的过程，由Director来组装，而实际组件的建造，由Builder的实现类负责。在java应用中，JavaMail使用到了该模式。
 */
public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		
		director.construct();
	}
}

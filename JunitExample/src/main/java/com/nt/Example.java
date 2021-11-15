package com.nt;

import org.apache.log4j.Logger;

public class Example {
	int a;
	static Logger logger= Logger.getLogger(Example.class);
	
	public int m1(int a, int b) {
		logger.info("mujif");
		int result=0;
		if(a>b) {
			result= a+b;
		}else {
			result= a-b;
		}
		return result;
	}
	
}

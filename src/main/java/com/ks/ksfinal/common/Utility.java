package com.ks.ksfinal.common;

import java.security.SecureRandom;



public class Utility {

	public static long generateRandomNo() {
		
		 SecureRandom random = new SecureRandom();
			return (100000 + random.nextInt(900000));
	}
	
	public static void main(String[] args) {
		generateRandomNo();
	}
}

package com.nag.demo;

enum Person {

	NAME("a"), AGE("b"), NUMBER("c"), GENDER("d");

	private String test;

	private Person(String s) {
		this.test = s;
	}

	public String getTest() {
		return test;
	}
	
	public static void main(String args[]) {
		
	}

}

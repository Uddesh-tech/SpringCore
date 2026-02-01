package com.springcore.constructorinjection;

public class person {
	private String name;
	private int person_id;

	public person(String name, int person_id) {
		this.name = name;
		this.person_id = person_id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.person_id;
	}

}

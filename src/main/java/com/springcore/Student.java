package com.springcore;

public class Student {
	private int studID;
	private String studName;
	private String studAddress;

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public Student(int studID, String studName, String studAddress) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studAddress = studAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studID=" + studID + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}

}

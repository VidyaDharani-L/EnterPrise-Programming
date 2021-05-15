package com.klu;

public class University {
	private int id;
	private String name;
	private String branch;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}

}

package com.code.ahmad.JsonPractice.Entity;

public class Clouds {

	private int all;

	public Clouds() {

	}

	public Clouds(int all) {
		this.all = all;
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

}

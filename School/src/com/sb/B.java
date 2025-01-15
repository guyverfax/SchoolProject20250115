package com.sb;

import com.sa.Student;
import com.sa.Student2;

public class B extends Student implements Student2{

	private int eng;
	
	public B(String name, int eng) {
		super(name);
		this.eng=eng;

	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String show() {
		return super.show()+"英文"+eng;
	}
	
	public void skill() {
		System.out.println("B skill");
		
	}


}

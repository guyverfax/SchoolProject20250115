package com.sb;

import com.sa.Student;
import com.sa.Student2;

public class A extends Student implements Student2{

	private int chi;
	
	public A(String name, int chi) {
		super(name);
		this.chi=chi;
		// TODO Auto-generated constructor stub
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	
	public String show() {
		return super.show()+"國文"+chi;
	}

	public void skill() {
		System.out.println("A skill");		
	}
	
	

}

package com.sa;

/**
 * @version 1.0
 * @author teacher
 * <br>
 * <h3>學員管理系統</h3>
 * 20250115
 */
public class Student //com.sa.Student, 提供別人使用, 需 public
{
	private String name;

	/**
	 * 
	 * @param name 新增學生姓名<br>
	 * Ex<br>
	 * new Student("aa");
	 */
	public Student(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 * @return 讀取姓名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name 修改姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return 輸出...
	 */
	public String show()
	{
		return "名:"+name;
	}
	
}
package org.main.practice;

public class NullRef {
	public void acceptData() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullRef emp=null;
		NullRef emp1;//The local variable emp1 may not have been initialized
		emp.acceptData();
		//emp1.acceptData();

	}

}

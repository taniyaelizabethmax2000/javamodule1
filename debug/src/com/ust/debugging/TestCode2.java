package com.ust.debugging;

public class TestCode2 {
  int a;
  int b;
  int x;
  int r=0;
  int a1[] = {2,5,7,8,5};
  int b1[]= {23,43,27,32,12};
  int x1[]= {18,19,20,21,22};
  //ax^2 +bx^2 +2ab;
  void fun() {
  for(int i=0;i<5;i++) {
	  r=(a1[i]*(x1[i]*x1[i]))+(b1[i]*(x1[i]*x1[i]))+(2*a1[i]*b1[i]);
	  System.out.println(r);
  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestCode2 t=new TestCode2();
       t.fun();
	}

}

package com.iwt.core.training.constr;

class Add
{
	int a,b,c;
	Add()        //default constructure
	{
		a=1;
		b=2;
	}

	Add(int x,int y)       //parameterised constructor
	{
		a=x;
		b=y;
	}

	void sum()
	{
		c=a+b;
		System.out.println(c);
	}

	public static void main(String args[])
	{
		Add obj1=new Add();
		obj1.sum();

		Add obj2=new Add(8,9);     // constructure overloading because of 2 constructures
		obj2.sum();
	}

}
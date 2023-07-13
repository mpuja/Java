package com.java;

	public interface Eatable {

		void eat();
	 }
		class TestAnnoymousInner1
		{
			public void main(String [] args)
			{
				Eatable e = new Eatable()
						{
					public void eat()
					{
						System.out.println("Nice Fruits");
					}
						};
						
						e.eat();
			}
		}



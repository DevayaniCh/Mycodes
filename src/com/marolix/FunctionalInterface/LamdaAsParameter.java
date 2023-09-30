package com.marolix.FunctionalInterface;

	@FunctionalInterface
	interface StringReverse {

		String reverse(String s);
	}

	
	public class LamdaAsParameter 
	{
		void displayString(StringReverse s,String s1) {
		s1=	s.reverse(s1);
			System.out.println(s1);
		}

		public static void main(String[] args) {

			LamdaAsParameter l = new LamdaAsParameter();
			StringReverse s = (String s1) -> {
				return new StringBuffer(s1).reverse().toString();

			};
			l.displayString((String s1) -> {
				return new StringBuffer(s1).reverse().toString();

			},"bharath");

		}

	}


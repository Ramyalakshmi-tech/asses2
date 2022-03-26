package com.asses2;

public abstract class Shape {
	
		
		abstract void RectangleArea(float l,float b);
		
		abstract void SquareArea(int s);
		
		abstract void CircleArea(double r);
	}
	class Area extends Shape{
		
		void RectangleArea(float l,float b) {
			double arearec=(l*b);
			System.out.println(arearec);
		}
		
		void SquareArea(int s) {
			int areasqr=s*s;
			System.out.println(areasqr);
		}
		
		void CircleArea(double r) {
			double areacir=(22*r*r)/7;
			System.out.println(areacir);
		}
		
		public static void main(String args[]) {
			Area a=new Area();
			
			System.out.println("Area of rectangle :");
			a.RectangleArea(2,3);
			
			System.out.println("Area of Square :");
			a.SquareArea(3);
			
			System.out.println("Area of Circle :");
			a.CircleArea(5);
		}
	}


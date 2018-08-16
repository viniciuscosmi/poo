package br.curso.poo.triangle;

public class MainTriangule {

	public static void main(String[] args) throws Exception {
		System.out.println(Triangle.isIsosceles(5, 1, 1));
		System.out.println(Triangle.isScalene(1, 2, 5));
		System.out.println(Triangle.isEquilateral(2, 2, 2));

		Triangle t1 = new Triangle(5,1,1) {};
		Triangle t2 = new Triangle(2,2,2) {};
		Triangle t3 = new Triangle(1,2,5) {};


		IsoscelesTriangule i = new IsoscelesTriangule(5,1,1);
		EquilateralTriangule e = new EquilateralTriangule(2,2,2);
		ScaleneTriangule s = new ScaleneTriangule(1,2,5);

		System.out.println(t1.getArea() == i.getArea());
		System.out.println(t2.getArea() == e.getArea());
		System.out.println(t3.getArea() == s.getArea());
	}
}
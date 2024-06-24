package com.in28minutes.oops.level2.interfaces;

public class ProjectModule {

	public static void main(String[] args) {
		
		//ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));

	}

}

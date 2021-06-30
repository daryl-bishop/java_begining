package com.qa.operator_task;

public class customer {

	public static int physics = 120;
	public static int chemistry = 150;
	public static int biology = 90;
	public static int total = physics + chemistry + biology;
	public static double percentage = total / 450.0 * 100;

	public static void displayResult() {
		System.out.print("Physics: ");
		System.out.println(physics);
		System.out.print("Chemistry: ");
		System.out.println(chemistry);
		System.out.print("Biology: ");
		System.out.println(biology);
		System.out.print("Total: ");
		System.out.println(total);
		System.out.print("Total Percentage: ");
		System.out.println(percentage);

	}

}

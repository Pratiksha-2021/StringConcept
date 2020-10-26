package com.stringFunctions;

public class CountChracterOccurance {
	public static void charoccurance(){
		String str="java programming java oops";
		int totallength=str.length();
		int afterremove_a=str.replace("a", "").length();
		int count=totallength-afterremove_a;
		System.out.println("number of occurance of a......>"+count);
	}
	public static void main(String[] args) {
		CountChracterOccurance.charoccurance();
	}
}

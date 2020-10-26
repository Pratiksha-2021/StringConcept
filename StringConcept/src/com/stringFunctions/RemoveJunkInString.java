package com.stringFunctions;

public class RemoveJunkInString {
	public static void removejunk(){
		String str="prat$$$*90^^iksha#%^&";
	
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("After removing junk....>"+str);
		
	}
	public static void main(String[] args) {
		RemoveJunkInString.removejunk();
	}

}

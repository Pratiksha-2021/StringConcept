package com.stringFunctions;

public class RemoveSpace {
	public static void removeSpace(){
		String str=" pratiksa gunjal ";
	  str=str.replaceAll("\\s","");
		System.out.println("After removing space....>"+str);
		
	}
	public static void main(String[] args) {
		RemoveSpace.removeSpace();
	}
}

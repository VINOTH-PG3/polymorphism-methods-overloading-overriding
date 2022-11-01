package Polymorphizam;

public class MethodOverlodingEx {  // In  Method over_loading many method  with same name created with different arguements & data types 
	int add(int a){  
		return a;
	}
	String add(String a){ // same method with different data type String is used
		return a;
	}
	int add(int a,int b,int c){  //same method with different arguments 
		return a*b*c;
	}
	
//	public class overLoads extends MethodOverlodingEx{
//		int add(int k ){    // just tryed to add  over riding in overloading not possible for me
//			return -k;
//		}
//	}
   public static void main(String[] args) {
	MethodOverlodingEx m = new MethodOverlodingEx(); //obj m is created to call the methods and pass arguements
	System.out.println(m.add(5));
	System.out.println(m.add("dfd") ); 
	System.out.println(m.add(2,4,2) ); 
	System.out.println(m.add(2,4,1));
	//overLoads OL= new overLoads();
	//System.out.println(OL.add(3444)); 
}
}

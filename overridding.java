package Polymorphizam;
class parent{          //parent class created
public void eat(){     //in overriding method ,method names are same with different arguements
	System.out.println(" man likes to eat Food With Healthy Items ");
}
}
class child extends parent{
	public void eat(){   // object "ch" for child class is created and calling method <ch.eat();>
                         // as a result it overrides parent and display childs statement
		System.out.println(" child likes to eat food and Icecreams ");
	}
	
}
public class overridding {
	
public static void main(String[] args) {
	parent  ch= new child(); // objName ch is created to get childs statement
	ch.eat();
	ch.eat();
	parent ch1=new parent();  // objnamech1 is created to call parent statement
	ch1.eat();
	
}
}

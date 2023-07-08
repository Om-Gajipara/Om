import java.util.*;
public class Lab91{
	public static void main(String[] args) {
		potato p1= new potato("potato","skin");
		brinjal b1= new brinjal("brinjal","Purple");
		tomato t1= new tomato("tomato","red");

		System.out.println(p1);
		System.out.println(b1);
		System.out.println(t1);
	}
}

abstract class vegitable {
	String name;
	String color;
	int i;
}

class potato extends vegitable {
	potato(String name,String color){
		this.name=name;
		this.color=color;
	}

	public String toString(){
		return "Name of vegitable is :"+name+" ,and color is :"+color;
	}
}

class brinjal extends vegitable {
	brinjal(String name,String color){
		this.name=name;
		this.color=color;
	}

	public String toString(){
		return "Name of vegitable is :"+name+" ,and color is :"+color;
	}
}

class tomato extends vegitable {
	tomato(String name,String color){
		this.name=name;
		this.color=color;
	}

	public String toString(){
		return "Name of vegitable is :"+name+" ,and color is :"+color;
	}
}
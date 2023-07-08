import java.util.*;

class zoo implements MouseListener, KeyListener{

}

interface Transport {
	void deliver();
}

abstract class Animal{
	String Name;
	String type;
	
}
class Tiger extends Animal{
	Tiger(String name , String type){
		this.name=name;
		this.type=type;
	}
	void  display();
}
class Camel extends Animal implements Transport{
	Camel(String name , String type){
		this.name=name;
		this.type=type;
	}
	void display();
	public void deliver(){
		System.out.println("")
	}
}

interface KeyListener extends EventListener {
	void keyPressed();

	void keyReleased();
}


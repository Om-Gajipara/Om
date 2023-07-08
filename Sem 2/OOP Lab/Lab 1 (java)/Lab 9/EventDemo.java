import java.util.*;

class EventDemo implements MouseListener, KeyListener{
	public void performEvent(){
		System.out.println("Event is performed");
	}
	public void mouseClicked(){
		System.out.println("mouse is clicked");
	}
	public void mousePressed(){
		System.out.println("mouse is pressed");
	}
	public void mouseReleased(){
		System.out.println("mouse is released");
	}
	public void mouseMoved(){
		System.out.println("mouse is moved");
	}
	public void mouseDragged(){
		System.out.println("mouse is dragged");
	}
	public void keyPressed(){
		System.out.println("key is pressed");
	}
	public void keyReleased(){
		System.out.println("key is released");
	}

	public static void main(String[] args) {
		EventDemo e1= new EventDemo();

		e1.performEvent();
		e1.mouseClicked();
		e1.mousePressed();
		e1.mouseReleased();
		e1.mouseMoved();
		e1.mouseDragged();
		e1.keyPressed();
		e1.keyReleased();
	}

}

interface EventListener {
	void performEvent();
}

interface MouseListener extends EventListener {
	void mouseClicked();
	
	void mousePressed();

	void mouseReleased();

	void mouseMoved();

	void mouseDragged();
}

interface KeyListener extends EventListener {
	void keyPressed();

	void keyReleased();
}


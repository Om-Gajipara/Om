class Test implements  MouseListener,KeyListener {
	
		
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
			System.out.println("mouse is realeased");
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
			System.out.println("key is realeased");
		}
		public static void main(String[] args) {
		Test t1=new Test();
		t1.performEvent();
		t1.mouseClicked();
		t1.mousePressed();
		t1.mouseReleased();
		t1.mouseMoved();
		t1.mouseDragged();
		t1.keyPressed();
		t1.keyReleased();
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

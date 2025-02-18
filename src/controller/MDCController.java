package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	public int MDCResultado (int x, int y) {
		if (x == y) {
			return x;
			
		}
		if (x > y) {
			return MDCResultado (x-y, y);
		}
		else {
			return MDCResultado (y, x);
		}
	}

}
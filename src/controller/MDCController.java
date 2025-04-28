package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int mdcResultado (int x, int y) {
		if (x == y) {
			return x;
			
		}
		if (x > y) {
			return mdcResultado (x-y, y);
		}
    return mdcResultado (y, x);
		}
	}
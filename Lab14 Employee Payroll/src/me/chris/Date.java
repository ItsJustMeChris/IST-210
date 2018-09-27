package me.chris;

public class Date {
	private int m;
	private int d;
	private int y;
	
	Date(int m, int d, int y) {
		this.m = m;
		this.d = d;
		this.y = y;
	}
	
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return m + "/"+ d +"/"+ y;
	}
	
	
}

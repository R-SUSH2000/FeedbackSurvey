package javaCollection;

public class point implements Comparable<point>{
	
	int x,y;
	point (int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(point p) {
		return this.x-p.x;
	}

}

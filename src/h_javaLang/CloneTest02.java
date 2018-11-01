package h_javaLang;

public class CloneTest02 {
	public static void main(String[] args) {
		
		Circle c = new Circle(new Point(100,100),50);
		Circle cCopy = (Circle)c.shallowCopy();
		Circle cDCopy = (Circle)c.deepCopy();
		
		System.out.println(c);
		System.out.println(cCopy);
		System.out.println(cDCopy);
		
		c.r = 200;
		c.p.x = 5000;
		System.out.println(c);
		System.out.println(cCopy);
		System.out.println(cDCopy);
		
	}
}


class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}


class Circle implements Cloneable{
	
	Point p;
	int r;
	
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}
	
	protected Object shallowCopy(){ 
		
		Object obj = null;
		//try에서 실패해서 obj에 값이 안들어갈수도 있어서
		//리턴 obj에 오류나기 때문에 null값으로 미리 초기화
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	protected Object deepCopy(){
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		((Circle)obj).p = new Point(p.x,p.y);
		return obj;
	}


	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
}







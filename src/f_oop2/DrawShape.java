package f_oop2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {

	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
//		ds.paint(g); <= 자동생성이므로 paint호출
	}
	
	DrawShape() {
		super("그냥 만들어 봤어");
		
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.YELLOW);
		setResizable(false);
	}
	
	public void paint(Graphics g) {
		// 1. Circle 객체를 만드세요 c
		//	   매개변수 두 개짜리 생성자를 이용해서 200, 200, 100
		Circle c = new Circle(new Point(200,200),100);
		// 2. 원을 그리세요
		// g.drawOval(Point p(x, y), width, height); <= 지름이 들어와야함, c에서 가져와야함
		g.drawOval(c.p.x, c.p.y, c.r*2, c.r*2);
		// 3. Triangle 객체를 만드세요 t
		// 	   매개변수 한 개짜리 생성자를 이용하세요 <= 배열
		//	  100 100, 200 200, 200 100
//		Triangle t = new Triangle(new Point(100,100), new Point(200,200), new Point(200,100));
		Point[] p = new Point[] {new Point(100,100), new Point(200,200), new Point(200,100)};
		Triangle t = new Triangle(p);
		
		// 4. 삼각형을 그리세요
		//	  d.drawLine(x, y, x1, x2);
		g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawLine(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);
		// 5. JVM 그리세요.
		
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	// 1. 점 하나를 담을 수 있는 변수를 선언하세요 p
	Point p; // <= 다른 클래스를 멤버변수로 선언하여 포함
//	Point p = new Point();
	// 2. 반지름을 저장할 수 있는 변수를 선언하세요 r
	int r;
	// 3. 매개변수가 두 개인 생성자를 만들어 p와 r을 초기화하세요
	Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	// 4. 기본생성자를 만들고 매개변수가 두 개인 생성자를 호출하여
	// 중심점은 100, 100 반지름은 50으로 p와 r을 초기화 해주세요
	Circle() {
		this(new Point(100,100),50);
	}
}

class Triangle {
	// 1. 점 3개를 저장할 수 있는 변수를 선언하세요 p
	Point[] p;
	// 2. 매개변수가 하나인 생성자를 만들어서 p변수를 초기화 하세요
	Triangle(Point[] p) {
		this.p = p;
	}
	// 3. 매개변수가 세개인 생성자를 이용해서 p변수를 초기화 하세요
	Triangle(Point p1, Point p2, Point p3) {
		Point[] p = new Point[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
	}
}

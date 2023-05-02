package UF4.UF4.Figures;

public class Rectangle {

	public int base;
	public int altura;

	public String color;

	public Rectangle(){}
	public Rectangle(int b, int a) {
		base = b;
		altura = a;
	}
	public Rectangle(String c) {
		color = c;
	}

	public Rectangle(int b, int a, String c) {
		base = b;
		altura = a;
		color = c;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

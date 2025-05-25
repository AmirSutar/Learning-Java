package CommonBox;

public class CreateBox {

	private int length;
	private int width;
	private int height;

	public void createbox(int l, int b, int h)

	{
		if (l == 0 || b == 0 || h == 0) {
			System.out.println("Incoret parameters");
		} else {
			System.out.println("Box has been created with dia " + l + " " + b + " " + h);
		}
	}

	public int SetLength(int l) {
		length = l;
		return length;
	}

	public int SetHeight(int h) {
		height = h;
		return height;
	}

	public int SetWidth(int b) {
		width = b;
		return width;
	}

	public int GetWidth(int b) {
		width = b;
		return width;
	}

	public int GetHeight(int h) {
		height = h;
		return height;
	}

	public int GetLength(int l) {
		length = l;
		return length;
	}

}

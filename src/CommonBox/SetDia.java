package CommonBox;

public class SetDia {
	
	 public static void main(String[] args)
	 {
	CreateBox dm = new CreateBox();
	int h =dm.SetHeight(55);
	int l = dm.SetLength(20);
	int b = dm.SetWidth(30);
	
	//int l = dm.height = 10;
	//int b =dm.length = 20;
	//int h =dm.width = 30;
	dm.createbox(l,b,h);
	//System.out.println(dm.GetLength(l));
	
	}

}

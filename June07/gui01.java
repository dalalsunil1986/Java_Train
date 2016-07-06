import java.awt.*;

class gui01
{
	public static void main(String args[])
	{
		Frame f;
		Button b1 = new Button("Red");
		Button b2= new Button("Green");
		f = new Frame();
		f.setSize(300, 500);
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
	}
}
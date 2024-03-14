import java.awt.Dimension;

import javax.swing.JFrame;

import jp.co.jeus.commons.enums.PropertyAnnotation;

@PropertyAnnotation(bundle = "")
public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setSize(new Dimension(100, 100));
		f.setVisible(true);		
	}
}

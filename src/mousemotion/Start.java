package mousemotion;

import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setBounds(10, 10, 100, 105);
		f.add(new Panel());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

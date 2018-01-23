import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorProgram {
	JFrame jf = new JFrame("SELECT COLOR");
	JButton red = new JButton("RED");
	JButton green = new JButton("GREEN");
	JButton blue = new JButton("BLUE");
	JButton yellow = new JButton("YELLOW");

	JPanel panel = new JPanel();

	public ColorProgram() {

		red.setActionCommand("RED");
		green.setActionCommand("GREEN");
		blue.setActionCommand("BLUE");
		yellow.setActionCommand("YELLOW");

		panel.setLayout(new FlowLayout());

		red.addActionListener(new ButtonListener(panel));
		green.addActionListener(new ButtonListener(panel));
		blue.addActionListener(new ButtonListener(panel));
		yellow.addActionListener(new ButtonListener(panel));

		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(yellow);

		jf.setSize(400, 400);
		jf.setLayout(new GridLayout(3, 1));
		jf.add(panel);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }
		});

	}

	public static void main(String[] args) {
		new ColorProgram();
	}
}

class ButtonListener implements ActionListener, EventListener {

	JPanel panel;

	public ButtonListener(JPanel jf) {
		this.panel = jf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch (command) {
		case "RED":
			panel.setBackground(Color.RED);
			System.out.println("RED CLICKED");
			break;

		case "GREEN":
			panel.setBackground(Color.GREEN);
			System.out.println("GREEN CLICKED");
			break;

		case "BLUE":
			panel.setBackground(Color.BLUE);
			System.out.println("BLUE CLICKED");
			break;

		case "YELLOW":
			panel.setBackground(Color.YELLOW);
			System.out.println("YELLOW CLICKED");
			break;
		}

	}

}

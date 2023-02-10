import javax.swing.*;

public class FirstFrame
{
	public static void main(String[ ] args)
	{
		// construct appropriate objects to show
		JFrame frame = new JFrame();
		JPanel contents = new JPanel();
		JLabel label = new JLabel("URL:");
		JTextField url = new JTextField(15);
		JTextArea html = new JTextArea(10, 20);
		// use their services, set up the contents
		contents.add(label);
		contents.add(url);
		contents.add(html);
		// set the frame’s contents to display the panel
		frame.setContentPane(contents);
		// set up and show the frame
		frame.setTitle("Browser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 100);
		frame.setSize(250, 250);
		frame.setVisible(true);
	}
}



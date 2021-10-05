package GuiClasses;
import javax.swing.*;
import java.awt.event.*;

public class GUI {

	public GUI(){
		JFrame frame1 = new JFrame("YourBankingApp"); // Create our window frame and name it "YourBankingApp".

		
		JPanel panel1 = new JPanel(); // Create the panels
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		//panel1.add(textArea); // Add the textArea component to the panel component
		JTabbedPane tabbedPane = new JTabbedPane(); // Create a tabbed pane object
		tabbedPane.setBounds(0, 0, 375, 575); // Set the dimensions of the TabbedPane
		tabbedPane.add("MyAccounts", panel1); // Add the panels to the Tabbed Pane
		tabbedPane.add("Transfers", panel2);
		tabbedPane.add("BillPayments", panel3);
		tabbedPane.add("Profile", panel4);
		frame1.add(tabbedPane); // Add the TabbedPane to to the frame.

		String[] comboBoxAccountChoices = { // Create the dropdown menu options for MyAccounts pane
			"Savings Account",
			"Checking Account"
		};
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(300, 300);
		JButton button2 = new JButton("Show Account");
		button2.setBounds(200, 100, 100, 20);
		final JComboBox comboBox = new JComboBox(comboBoxAccountChoices);
		comboBox.setBounds(25, 50, 75, 25);
		panel1.add(comboBox);
		panel1.add(label);
		panel1.add(button2);

		frame1.setSize(375, 600); // Frame Dimensions to fit a large smartphone
		frame1.setLayout(null);
		frame1.setVisible(true); // Make the frame window visible

		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String data = "Account Selected: " +
				comboBox.getItemAt(comboBox.getSelectedIndex());
				label.setText(data);
			}
		});


			

	}
	
}
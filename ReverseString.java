import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseString extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseString frame = new ReverseString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReverseString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REVERSE  STRING");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(133, 25, 232, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER A STRING");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1.setBounds(143, 75, 232, 24);
		contentPane.add(lblNewLabel_1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBackground(new Color(211, 211, 211));
		ta1.setForeground(new Color(0, 0, 0));
		ta1.setFont(new Font("Cambria", Font.BOLD, 20));
		ta1.setBounds(70, 119, 335, 29);
		contentPane.add(ta1);
		
		JLabel lblNewLabel_1_1 = new JLabel("REVERSED STRING ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(133, 226, 232, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBackground(new Color(211, 211, 211));
		ta2.setForeground(new Color(0, 0, 0));
		ta2.setFont(new Font("Cambria", Font.BOLD, 20));
		ta2.setBounds(70, 277, 335, 29);
		contentPane.add(ta2);
		
		JButton btnNewButton = new JButton("CLICK HERE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to reverse the string
				String data=ta1.getText();
				char arr[]=data.toCharArray();
				char[] narr=new char[arr.length];
				int j=arr.length-1;
				for(int i=0;i<=arr.length-1;i++)
				{
					narr[j]=arr[i];
					j--;
				}
				String rstr=new String(narr);
				ta2.setText(rstr);
				
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 18));
		btnNewButton.setBounds(128, 169, 210, 35);
		contentPane.add(btnNewButton);
	}
}

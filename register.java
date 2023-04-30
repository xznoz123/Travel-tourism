package swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class register extends JFrame implements ActionListener {

	private JPanel k;

	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;

	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JButton SUMIT, BACK;

	public register() {
		setSize(518, 526);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 1069, 433);
		k = new JPanel();
		k.setBorder(new EmptyBorder(5, 5, 5, 5));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/adolfo-felix-Yi9-QIObQ1o-unsplash.jpg").getFile());

		setContentPane(k);
		k.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(10, 54, 124, 59);
		k.add(lblNewLabel);

		text1 = new JTextField();
		text1.setBounds(200, 67, 232, 44);
		k.add(text1);
		text1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		text1.setBackground(new Color(255, 255, 255));
		text1.setColumns(10);

		text2 = new JTextField();
		text2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		text2.setColumns(10);
		text2.setBackground(Color.WHITE);
		text2.setBounds(200, 122, 232, 44);
		k.add(text2);

		text4 = new JTextField();
		text4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		text4.setColumns(10);
		text4.setBackground(Color.WHITE);
		text4.setBounds(200, 230, 232, 44);
		k.add(text4);

		lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(10, 124, 180, 44);
		k.add(lblNewLabel_2);

		lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(10, 230, 180, 44);
		k.add(lblNewLabel_1);

		text5 = new JTextField();
		text5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		text5.setColumns(10);
		text5.setBackground(Color.WHITE);
		text5.setBounds(200, 285, 232, 44);
		k.add(text5);

		lblNewLabel_3 = new JLabel("Phone No:");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setBounds(10, 285, 180, 44);
		k.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Gender:");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setBounds(10, 179, 180, 44);
		k.add(lblNewLabel_4);

		text3 = new JTextField();
		text3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		text3.setColumns(10);
		text3.setBackground(Color.WHITE);
		text3.setBounds(200, 175, 232, 44);
		k.add(text3);

		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setForeground(Color.GRAY);
		lblRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblRegister.setEnabled(false);
		lblRegister.setBackground(Color.GRAY);
		lblRegister.setBounds(166, 0, 166, 59);
		k.add(lblRegister);

		btnNewButton = new JButton("SUMIT");
		btnNewButton.setBounds(75, 416, 115, 45);
		k.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == SUMIT) {
					String username = text1.getText();
					String lastname = text2.getText();
					String gender = text3.getText();
					String email = text4.getText();
					String password = text5.getText();

					String query = "insert into account values('" + username + "','" + lastname + "','" + gender + "','"
							+ email + "','" + password + "')";
					try {
						connections c = new connections();
						c.s.executeUpdate(query);

						JOptionPane.showMessageDialog(null, "account create sucessfully");
						setVisible(false);
						new demol2();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton.setBackground(new Color(0, 191, 255));

		btnReset = new JButton("BACK");
		btnReset.setBounds(294, 416, 115, 45);
		k.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//         		if(e.getSource() == BACK) {
//        			setVisible(true);
//        			new demol2(); }
				demol2 d = new demol2();
				d.show();
				dispose();

			}

		});
		btnReset.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnReset.setBackground(new Color(0, 191, 255));

		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 206, 209));
		label.setIcon(img);
		label.setBounds(0, 0, 504, 489);
		k.add(label);
	}

	public void actionPerformed(ActionEvent ac) {
		if (ac.getSource() == SUMIT) {

		}
//		else if(ac.getSource() == BACK) {
//			setVisible(false);
//			new demol2(); 
//		}
//			
	}
}

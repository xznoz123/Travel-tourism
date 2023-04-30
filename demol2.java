package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class demol2 extends JFrame {
	private JPanel contentPane;
	private JTextField ID;
	private JTextField PSS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demol2 frame = new demol2();
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
	public demol2() {

		setEnabled(true);

		setResizable(false);
		setBackground(new Color(64, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblHello = new JLabel("ID          :");
		lblHello.setEnabled(false);
		lblHello.setFont(new Font("Trebuchet MS", Font.PLAIN, 33));
		lblHello.setForeground(new Color(0, 0, 0));
		lblHello.setBackground(new Color(240, 240, 240));
		lblHello.setVerticalAlignment(SwingConstants.BOTTOM);

		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.PLAIN, 29));
		ID.setColumns(10);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IDS = ID.getText();
				String PWD = PSS.getText();

				if (PWD.contains("ashish") && IDS.contains("sahay")) {
					ID.setText(null);
					PSS.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "invalid login");
					ID.setText(null);
					PSS.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setForeground(new Color(128, 0, 128));
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));

		PSS = new JTextField();
		PSS.setFont(new Font("Tahoma", Font.PLAIN, 26));
		PSS.setColumns(10);

		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID.setText(null);
				PSS.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setForeground(new Color(128, 0, 128));

		JLabel lblNewLabel = new JLabel("PASSWORD :");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(128, 128, 128));

		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/s.png").getFile());
		label.setIcon(img);
		label.setBounds(122, 49, 92, 86);

		JButton btnNewButton_3 = new JButton("Register");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register r = new register();
				r.show();
				dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(128, 0, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton).addGap(4)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3, Alignment.TRAILING).addComponent(lblNewLabel, Alignment.TRAILING)
						.addComponent(lblHello, Alignment.TRAILING))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(44).addComponent(btnNewButton_2)
								.addGap(58).addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(PSS, Alignment.LEADING).addComponent(ID, Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(label,
								GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(36)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblHello, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(PSS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton).addComponent(btnNewButton_1)
										.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE))))
				.addGap(48)));
		contentPane.setLayout(gl_contentPane);
	}
}

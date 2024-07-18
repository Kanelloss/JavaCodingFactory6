package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TeachersInsertFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel TeacherInsertFrame;
	private JTextField firstnameText;
	private JTextField lastnameText;
	private JLabel errorFirstname;
	private JLabel errorLastname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachersInsertFrame frame = new TeachersInsertFrame();
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
	public TeachersInsertFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				firstnameText.setText("");
				lastnameText.setText("");
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(TeachersInsertFrame.class.getResource("/resources/eduv2.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 949, 615);
		TeacherInsertFrame = new JPanel();
		TeacherInsertFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(TeacherInsertFrame);
		TeacherInsertFrame.setLayout(null);
		
		JLabel firstnameLabel = new JLabel("Όνομα");
		firstnameLabel.setForeground(new Color(0, 0, 255));
		firstnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstnameLabel.setBounds(60, 97, 48, 34);
		TeacherInsertFrame.add(firstnameLabel);
		
		firstnameText = new JTextField();
		firstnameText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String inputFirstname;
				
				inputFirstname = firstnameText.getText().trim();
				
				
				if (inputFirstname.equals("")) {
					errorFirstname.setText("Υποχρεωτικό πεδίο");
				}
				
				if (!inputFirstname.equals("")) {
					errorFirstname.setText("");
				}
			}
		});
		firstnameText.setBounds(130, 97, 533, 34);
		TeacherInsertFrame.add(firstnameText);
		firstnameText.setColumns(10);
		
		JButton insertTeacherBtn = new JButton("Εισαγωγή");
		insertTeacherBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Data Binding
				 String inputFirstname = firstnameText.getText().trim();
				 String inputLastname = lastnameText.getText().trim();
				
				if (inputFirstname.equals("")) {
					errorFirstname.setText("Υποχρεωτικό πεδίο");
				}
				
				if (!inputFirstname.equals("")) {
					errorFirstname.setText("");
				}
				
				if (inputLastname.equals("")) {
					errorLastname.setText("Υποχρεωτικό πεδίο");
				}
				
				if (!inputLastname.equals("")) {
					errorLastname.setText("");
				}
				
				if (inputFirstname.equals("") || inputLastname.equals("")) {
					return;
				}
				
				
				String sql = "INSERT INTO teachers (firstname, lastname) VALUES (?, ?)";
				
				try {
					PreparedStatement ps = MainMenuFrame.getConnection().prepareStatement(sql);
					ps.setString(1, inputFirstname);
					ps.setString(2,  inputLastname);
					
					int n = ps.executeUpdate();
					JOptionPane.showMessageDialog(null, n + " record(s) inserted successfully!", "INSERT", JOptionPane.PLAIN_MESSAGE);
					
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Insertion error", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		insertTeacherBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		insertTeacherBtn.setForeground(new Color(0, 0, 205));
		insertTeacherBtn.setBounds(596, 502, 145, 39);
		TeacherInsertFrame.add(insertTeacherBtn);
		
		JButton closeBtn = new JButton("Κλείσιμο");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getTeachersMenuFrame().setVisible(true);
				Main.getTeachersInsertFrame().setVisible(false);
			}
		});
		closeBtn.setForeground(new Color(0, 0, 205));
		closeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		closeBtn.setBounds(767, 502, 145, 39);
		TeacherInsertFrame.add(closeBtn);
		
		JPanel pane = new JPanel();
		pane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pane.setBounds(26, 26, 715, 315);
		TeacherInsertFrame.add(pane);
		pane.setLayout(null);
		
		JLabel lastnameLabel = new JLabel("Επώνυμο");
		lastnameLabel.setBounds(24, 170, 58, 34);
		pane.add(lastnameLabel);
		lastnameLabel.setForeground(new Color(0, 0, 255));
		lastnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lastnameText = new JTextField();
		lastnameText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String inputLastname;
				inputLastname = lastnameText.getText().trim();
				
				if (inputLastname.equals("")) {
					errorLastname.setText("Υποχρεωτικό πεδίο");
				}
				
				if (!inputLastname.equals("")) {
					errorLastname.setText("");
				}
			}
		});
		lastnameText.setBounds(104, 173, 533, 34);
		pane.add(lastnameText);
		lastnameText.setColumns(10);
		
		errorFirstname = new JLabel("");
		errorFirstname.setForeground(new Color(255, 0, 0));
		errorFirstname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		errorFirstname.setBounds(104, 122, 533, 28);
		pane.add(errorFirstname);
		
		errorLastname = new JLabel("");
		errorLastname.setForeground(Color.RED);
		errorLastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		errorLastname.setBounds(104, 231, 533, 28);
		pane.add(errorLastname);
	}
}

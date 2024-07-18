package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class TeachersUpdateDeleteFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable teachersTable;
	private DefaultTableModel model = new DefaultTableModel();
	private JButton lastnameSearchText;
	private JTextField textField;
	private JTextField firstnameText;
	private JTextField lastnameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachersUpdateDeleteFrame frame = new TeachersUpdateDeleteFrame();
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
	public TeachersUpdateDeleteFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 697);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		teachersTable = new JTable();
		teachersTable.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {"Κωδικός", "Όνομα", "Επώνυμο"}
		));
		
		
		model = (DefaultTableModel) teachersTable.getModel();
		
		teachersTable.setBounds(33, 79, 444, 535);
		contentPane.add(teachersTable);
		
		JScrollPane scrollPane = new JScrollPane(teachersTable);
		scrollPane.setBounds(39, 82, 444, 535);
		contentPane.add(scrollPane);
		
		JLabel lastnameSearchLabel = new JLabel("Επώνυμο");
		lastnameSearchLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastnameSearchLabel.setForeground(new Color(0, 0, 255));
		lastnameSearchLabel.setBounds(39, 23, 76, 26);
		contentPane.add(lastnameSearchLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(106, 24, 288, 24);
		contentPane.add(textArea);
		
		JButton btnSearch = new JButton("Αναζήτηση");
		btnSearch.setForeground(new Color(0, 0, 255));
		btnSearch.setBounds(419, 24, 103, 24);
		contentPane.add(btnSearch);
		
		JLabel idLabel = new JLabel("Κωδικός");
		idLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		idLabel.setForeground(new Color(0, 0, 205));
		idLabel.setBounds(535, 119, 48, 26);
		contentPane.add(idLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(604, 123, 115, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel firstnameLabel = new JLabel("Όνομα");
		firstnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstnameLabel.setForeground(new Color(0, 0, 205));
		firstnameLabel.setBounds(535, 173, 36, 26);
		contentPane.add(firstnameLabel);
		
		firstnameText = new JTextField();
		firstnameText.setColumns(10);
		firstnameText.setBounds(604, 177, 229, 22);
		contentPane.add(firstnameText);
		
		JLabel lastnameLabel = new JLabel("Επώνυμο");
		lastnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastnameLabel.setForeground(new Color(0, 0, 205));
		lastnameLabel.setBounds(524, 228, 48, 26);
		contentPane.add(lastnameLabel);
		
		lastnameText = new JTextField();
		lastnameText.setColumns(10);
		lastnameText.setBounds(604, 231, 229, 22);
		contentPane.add(lastnameText);
		
		JLabel errorFirstname = new JLabel("");
		errorFirstname.setForeground(new Color(220, 20, 60));
		errorFirstname.setBounds(594, 209, 207, 12);
		contentPane.add(errorFirstname);
		
		JLabel errorLastname = new JLabel("");
		errorLastname.setForeground(new Color(220, 20, 60));
		errorLastname.setBounds(594, 263, 207, 12);
		contentPane.add(errorLastname);
		
		JButton updateBtn = new JButton("Ενημέρωση");
		updateBtn.setForeground(new Color(0, 0, 255));
		updateBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		updateBtn.setBounds(524, 339, 125, 47);
		contentPane.add(updateBtn);
		
		JButton deleteBtn = new JButton("Διαγραφή");
		deleteBtn.setForeground(Color.BLUE);
		deleteBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		deleteBtn.setBounds(693, 339, 125, 47);
		contentPane.add(deleteBtn);
		
		JButton closeBtn = new JButton("Κλείσιμο");
		closeBtn.setForeground(Color.BLUE);
		closeBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		closeBtn.setBounds(693, 545, 125, 47);
		contentPane.add(closeBtn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(505, 77, 387, 198);
		contentPane.add(panel);
	}
	
	
	private void buildTable() {
		
		Vector<String> vector;
		
		try {
			
			String sql = "SELECT id, firstname, lastname FROM teachers WHERE lastname LIKE ?";
			PreparedStatement ps = MainMenuFrame.getConnection().prepareStatement(sql);
			ps.setString(1,  lastnameSearchText.getText().trim() + "%");
			
			ResultSet rs = ps.executeQuery();
			
			// Clear Model -> Clear Table - MVVM - Model View View Model
			for (int i = model.getRowCount() - 1; i >= 0; i--) {
				model.removeRow(i);
			}
			
			while (rs.next()) {
				vector = new Vector<>(3);
				vector.add(rs.getString("id"));
				vector.add(rs.getString("firstname"));
				vector.add(rs.getString("lastname"));
				
				model.addRow(vector);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

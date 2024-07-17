package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeachersMenuFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					TeachersMenuFrame frame = new TeachersMenuFrame();
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
	public TeachersMenuFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TeachersMenuFrame.class.getResource("/resources/eduv2.png")));
		setTitle("Μενού Εκπαιδευτών");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton teachersViewBtn = new JButton("Προβολή Εκπαιδευτών");
		teachersViewBtn.setForeground(Color.BLUE);
		teachersViewBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		teachersViewBtn.setBounds(252, 150, 360, 88);
		contentPane.add(teachersViewBtn);
		
		JButton teachersViewBtn_1 = new JButton("Εισαγωγή Εκπαιδευτή");
		teachersViewBtn_1.setForeground(Color.BLUE);
		teachersViewBtn_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		teachersViewBtn_1.setBounds(252, 328, 360, 88);
		contentPane.add(teachersViewBtn_1);
		
		JButton closeBtn = new JButton("Κλείσιμο");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getMainMenuFrame().setEnabled(true);
				Main.getTeachersMenuFrame().setVisible(false);
			}
		});
		closeBtn.setForeground(Color.BLUE);
		closeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		closeBtn.setBounds(690, 602, 213, 55);
		contentPane.add(closeBtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 584, 947, 8);
		contentPane.add(separator);
	}
	
	

}

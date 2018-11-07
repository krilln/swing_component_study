package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEx frame = new ButtonEx();
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
	public ButtonEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		
		JButton btnNewButton = new JButton("call~~");
		String iconPath1 = System.getProperty("user.dir")+"\\images\\";
		btnNewButton.setRolloverIcon(new ImageIcon(iconPath1 +"rolloverIcon.gif"));
		btnNewButton.setPressedIcon(new ImageIcon(iconPath1 +"pressedIcon.gif"));
		
		btnNewButton.setIcon(new ImageIcon(iconPath1 +"normalIcon.gif"));
		contentPane.add(btnNewButton);
	}

}

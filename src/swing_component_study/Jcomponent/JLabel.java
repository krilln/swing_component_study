package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class JLabel extends JFrame {

	private JPanel txttabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabel frame = new JLabel();
					frame.setVisible(true);
					
					String dir = System.getProperty("user.dir")+"\\images";
					System.out.println(dir);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLabel() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 566);
		txttabel = new JPanel();
		txttabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txttabel);
		txttabel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		javax.swing.JLabel label = new javax.swing.JLabel("사랑합니다");
		txttabel.add(label);
		
		javax.swing.JLabel lblNewLabel = new javax.swing.JLabel("");
		String iconPath1 = System.getProperty("user.dir")+"\\images\\";
		lblNewLabel.setIcon(new ImageIcon(iconPath1 + "beauty.jpg"));
		txttabel.add(lblNewLabel);
		
		javax.swing.JLabel label_1 = new javax.swing.JLabel("보고싶은면 전화하세요.");
		label_1.setIcon(new ImageIcon(iconPath1 +"normalIcon.gif"));
		txttabel.add(label_1);
	}

}

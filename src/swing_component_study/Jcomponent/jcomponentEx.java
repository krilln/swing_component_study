package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jcomponentEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jcomponentEx frame = new jcomponentEx();
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
	public jcomponentEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b1.setForeground(Color.MAGENTA);
		b1.setBackground(Color.YELLOW);
		setSize(297,224);
		setVisible(true);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Disabled Button");
		b2.setEnabled(false);
		setSize(260,200);
		setVisible(true);
		contentPane.add(b2);
		
		JButton b3 = new JButton("getX(), getY()");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				jcomponentEx frame = (jcomponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
			}
		});
		setSize(260,200);
		setVisible(true);
		contentPane.add(b3);
	}

}

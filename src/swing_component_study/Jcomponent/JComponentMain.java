package swing_component_study.Jcomponent;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ComponentOrientation;

public class JComponentMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponentMain frame = new JComponentMain();
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
	public JComponentMain() {
		initComponents();
	}
	private void initComponents() {
		setTitle("모든 Jcomponent예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		btn = new JButton("ButtonEx");
		btn.addActionListener(this);
		contentPane.add(btn);
		
		btn_1 = new JButton("CheckBoxEx");
		btn_1.addActionListener(this);
		contentPane.add(btn_1);
		
		btn_2 = new JButton("CheckBoxItemEventEx");
		btn_2.addActionListener(this);
		contentPane.add(btn_2);
		
		btn_3 = new JButton("jcomponentEx");
		btn_3.addActionListener(this);
		contentPane.add(btn_3);
		
		btn_4 = new JButton("JLabel");
		btn_4.addActionListener(this);
		contentPane.add(btn_4);
		
		btn_5 = new JButton("JListAndJComboEx");
		btn_5.addActionListener(this);
		contentPane.add(btn_5);
		
		btn_6 = new JButton("JTextFieldOtherEx");
		btn_6.addActionListener(this);
		contentPane.add(btn_6);
		
		btn_7 = new JButton("RadioButtonItemEventEx");
		btn_7.addActionListener(this);
		contentPane.add(btn_7);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_7) {
			do_btn_7_actionPerformed(e);
		}
		if (e.getSource() == btn_6) {
			do_btn_6_actionPerformed(e);
		}
		if (e.getSource() == btn_5) {
			do_btn_5_actionPerformed(e);
		}
		if (e.getSource() == btn_4) {
			do_btn_4_actionPerformed(e);
		}
		if (e.getSource() == btn_3) {
			do_btn_3_actionPerformed(e);
		}
		if (e.getSource() == btn_2) {
			do_btn_2_actionPerformed(e);
		}
		if (e.getSource() == btn_1) {
			do_btn_1_actionPerformed(e);
		}
		if (e.getSource() == btn) {
			do_btn_actionPerformed(e);
		}
	}
	private void showFrame(JFrame frame) {
		frame.setVisible(true);
	}
	protected void do_btn_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btn_1_actionPerformed(ActionEvent e) {
	}
	protected void do_btn_2_actionPerformed(ActionEvent e) {
	}
	protected void do_btn_3_actionPerformed(ActionEvent e) {
	}
	protected void do_btn_4_actionPerformed(ActionEvent e) {
	}
	protected void do_btn_5_actionPerformed(ActionEvent e) {
		 showFrame(new JListAndJComboEx());
		
	}
	protected void do_btn_6_actionPerformed(ActionEvent e) {
	}
	protected void do_btn_7_actionPerformed(ActionEvent e) {
	}
}

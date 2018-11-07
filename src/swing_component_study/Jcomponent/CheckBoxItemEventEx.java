package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JLabel sumLabel;
	private int sum = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxItemEventEx frame = new CheckBoxItemEventEx();
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
	public CheckBoxItemEventEx() {
		initComponents();
	}

	private void initComponents() {
		setTitle("CheckBox와ItemEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("사과100원, 배500원, 체리20000원");
		contentPane.add(label);
		setSize(250,200);
		setVisible(true);
		setSize(250,200);
		setVisible(true);
		
		chckbxNewCheckBox = new JCheckBox("사과");
		chckbxNewCheckBox.addItemListener(this);
		contentPane.add(chckbxNewCheckBox);
		setSize(250,200);
		setVisible(true);
		
		chckbxNewCheckBox_1 = new JCheckBox("배");
		chckbxNewCheckBox_1.addItemListener(this);
		setSize(250,200);
		setVisible(true);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("체리");
		chckbxNewCheckBox_2.addItemListener(this);
		setSize(250,200);
		setVisible(true);
		contentPane.add(chckbxNewCheckBox_2);
		
		sumLabel = new JLabel("현재 0 원입니다.");
		contentPane.add(sumLabel);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == chckbxNewCheckBox_2) {
			do_chckbxNewCheckBox_2_itemStateChanged(e);
		}
		if (e.getSource() == chckbxNewCheckBox_1) {
			do_chckbxNewCheckBox_1_itemStateChanged(e);
		}
		if (e.getSource() == chckbxNewCheckBox) {
			do_chckbxNewCheckBox_itemStateChanged(e);
		}
		sumLabel.setText("현재" +sum+ " 원입니다.");
	}
	protected void do_chckbxNewCheckBox_itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		}else {
			sum -= 100;
		}
	}
	protected void do_chckbxNewCheckBox_1_itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		}else {
			sum -= 500;
		}
	}
	protected void do_chckbxNewCheckBox_2_itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 20000;
		}else {
			sum -= 20000;
		}
		
	}
	
}

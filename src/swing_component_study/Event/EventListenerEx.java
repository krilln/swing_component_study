package swing_component_study.Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.FeatureDescriptor;

import javax.swing.JButton;

public class EventListenerEx extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventListenerEx frame = new EventListenerEx();
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
	public EventListenerEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 10));
		
		JButton btn1 = new JButton("독립 클래스");
		btn1.addActionListener(new MyActionListenr());
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("내부 클래스");
		btn2.addActionListener(new MyActioninnerListenr());
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("익명 클래스");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				
			}
		});
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("필드를 이용");
		btn4.addActionListener(fieldListener);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("부모");
		btn5.addActionListener(this);
		contentPane.add(btn5);
	}
	
	private ActionListener fieldListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
			
		}
	};
	class MyActioninnerListenr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
			
		}
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
		
	}

}


class MyActionListenr implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
		
	}
	
}

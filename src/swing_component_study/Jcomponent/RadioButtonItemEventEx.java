package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;

public class RadioButtonItemEventEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbApple;
	private JRadioButton rdbPear;
	private JRadioButton rdbCherry;
	private JPanel panel;
	private JLabel lblNewLabel;
	private String iconPath;
	private ImageIcon appleIcon;
	private ImageIcon pearIcon;
	private ImageIcon cherryIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonItemEventEx frame = new RadioButtonItemEventEx();
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
	public RadioButtonItemEventEx() {
		iconPath = System.getProperty("user.dir")+"\\images\\fruits\\";
		appleIcon = new ImageIcon(iconPath +"apple.jpg");
		pearIcon = new ImageIcon(iconPath +"pear.jpg");
		cherryIcon = new ImageIcon(iconPath +"cherry.jpg");
		
		initComponents();
	}
	private void initComponents() {
		setTitle("라디오버튼Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(506,323);
		setVisible(true);
		contentPane.setLayout(new BorderLayout(0, 0));
		setSize(250,200);
		setVisible(true);
		setSize(250,200);
		setVisible(true);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("");
		rdbApple = new JRadioButton("사과");
		rdbApple.addItemListener(this);
		rdbApple.setSelected(true);
		buttonGroup.add(rdbApple);
		panel.add(rdbApple);
		
		rdbPear = new JRadioButton("배");
		rdbPear.addItemListener(this);
		buttonGroup.add(rdbPear);
		panel.add(rdbPear);
		rdbPear.setHorizontalAlignment(SwingConstants.CENTER);
		
		rdbCherry = new JRadioButton("체리");
		rdbCherry.addItemListener(this);
		buttonGroup.add(rdbCherry);
		panel.add(rdbCherry);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
	}



	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbCherry) {
			do_rdbCherry_itemStateChanged(e);
		}
		if (e.getSource() == rdbPear) {
			do_rdbPear_itemStateChanged(e);
		}
		if (e.getSource() == rdbApple) {
			do_rdbApple_itemStateChanged(e);
		}
	}
	protected void do_rdbApple_itemStateChanged(ItemEvent e) {
		lblNewLabel.setIcon(appleIcon);
	}
	protected void do_rdbPear_itemStateChanged(ItemEvent e) {
		lblNewLabel.setIcon(pearIcon);
	}
	protected void do_rdbCherry_itemStateChanged(ItemEvent e) {
		lblNewLabel.setIcon(cherryIcon);
	}
}

package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class TabbedPaneEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabbedPaneEx frame = new TabbedPaneEx();
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
	private String imgPath;
	
	public TabbedPaneEx() {
		imgPath = System.getProperty("user.dir")+"\\images\\";
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(imgPath+"cherry.jpg"));
		tabbedPane.addTab("tab1", null, lblNewLabel, "체리");
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(imgPath+"img1.jpg"));
		tabbedPane.addTab("tab2", null, lblNewLabel_2, "슈퍼맨");
		
		
		
		TblPanel panel = new TblPanel();
		tabbedPane.addTab("New tab", null, panel, null);
	}

}

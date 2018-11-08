package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderChangeEx extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JSlider slider_R;
	private JSlider slider_G;
	private JSlider slider_B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderChangeEx frame = new SliderChangeEx();
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
	public SliderChangeEx() {
		initComponents();
	}
	private void initComponents() {
		setTitle("SliderChangeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel pacSlider = new JPanel();
		pacSlider.setBorder(new TitledBorder(null, "\uC2AC\uB77C\uC774\uB354 \uCEF4\uD3EC\uB10C\uD2B8", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pacSlider.setToolTipText("");
		contentPane.add(pacSlider);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		pacSlider.add(slider);
		
		btnOk = new JButton("New button");
		btnOk.addActionListener(this);
		pacSlider.add(btnOk);
		
		JPanel padSlider = new JPanel();
		padSlider.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC2AC\uB77C\uC774\uB354 \uCCB4\uC778\uC9C0 \uCEEC\uB7EC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(padSlider);
		
		slider_R = new JSlider();
		slider_R.addChangeListener(this);
		slider_R.setForeground(Color.RED);
		slider_R.setMinorTickSpacing(10);
		slider_R.setMajorTickSpacing(50);
		slider_R.setPaintTicks(true);
		slider_R.setPaintLabels(true);
		slider_R.setMaximum(255);
		int r = slider_R.getValue();
		padSlider.add(slider_R);
		
		slider_G = new JSlider();
		slider_G.addChangeListener(this);
		slider_G.setForeground(Color.GREEN);
		slider_G.setPaintTicks(true);
		slider_G.setPaintLabels(true);
		slider_G.setMajorTickSpacing(50);
		slider_G.setMinorTickSpacing(10);
		slider_G.setMaximum(255);
		int g = slider_G.getValue();
		padSlider.add(slider_G);
		
		slider_B = new JSlider();
		slider_B.addChangeListener(this);
		slider_B.setForeground(Color.BLUE);
		slider_B.setMajorTickSpacing(50);
		slider_B.setMinorTickSpacing(10);
		slider_B.setMaximum(255);
		slider_B.setPaintTicks(true);
		slider_B.setPaintLabels(true);
		int b = slider_B.getValue();
		padSlider.add(slider_B);
		
		JLabel lblColor = new JLabel("SLIDER EXAMPLE");
		lblColor.setOpaque(true);
		lblColor.setBackground(new Color(r,g,b));
		padSlider.add(lblColor);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == slider_B) {
			do_slider_B_stateChanged(e);
		}
		if (e.getSource() == slider_G) {
			do_slider_G_stateChanged(e);
		}
		if (e.getSource() == slider_R) {
			do_slider_R_stateChanged(e);
		}
	}
	protected void do_slider_R_stateChanged(ChangeEvent e) {
			
	}
	protected void do_slider_G_stateChanged(ChangeEvent e) {
		
	}
	protected void do_slider_B_stateChanged(ChangeEvent e) {
		
	}
	
}


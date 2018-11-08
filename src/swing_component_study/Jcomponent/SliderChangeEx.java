package swing_component_study.Jcomponent;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JSlider slider_R;
	private JSlider slider_G;
	private JSlider slider_B;
	private JSlider slider;
	private JLabel lblValue;
	private JLabel lblColor;
	private JPanel panel;
	private JSpinner setList;
	private JSpinner setNumber;
	private JSpinner setDate;
	private JButton btnNewButton;
	private JPanel panel_1;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 801, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
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
		
		slider_R.setForeground(Color.RED);
		slider_R.setMinorTickSpacing(10);
		slider_R.setMajorTickSpacing(50);
		slider_R.setPaintTicks(true);
		slider_R.setPaintLabels(true);
		slider_R.setMaximum(255);
		int r = slider_R.getValue();
		padSlider.add(slider_R);
		
		slider_G = new JSlider();
		
		slider_G.setForeground(Color.GREEN);
		slider_G.setPaintTicks(true);
		slider_G.setPaintLabels(true);
		slider_G.setMajorTickSpacing(50);
		slider_G.setMinorTickSpacing(10);
		slider_G.setMaximum(255);
		int g = slider_G.getValue();
		padSlider.add(slider_G);
		
		slider_B = new JSlider();
		
		slider_B.setForeground(Color.BLUE);
		slider_B.setMajorTickSpacing(50);
		slider_B.setMinorTickSpacing(10);
		slider_B.setMaximum(255);
		slider_B.setPaintTicks(true);
		slider_B.setPaintLabels(true);
		int b = slider_B.getValue();
		padSlider.add(slider_B);
		
		lblColor = new JLabel("SLIDER EXAMPLE");
		lblColor.setOpaque(true);
		lblColor.setBackground(new Color(r,g,b));
		padSlider.add(lblColor);
		
		slider_R.addChangeListener(this);
		slider_G.addChangeListener(this);
		slider_B.addChangeListener(this);
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		setList = new JSpinner();
		setList.setModel(new SpinnerListModel(new String[] {"\uC18C\uC124", "\uC7A1\uC9C0", "\uC804\uACF5\uC11C\uC801", "\uCDE8\uBBF8"}));
		panel_1.add(setList);
		
		setNumber = new JSpinner();
		setNumber.setModel(new SpinnerNumberModel(1, 0, 9, 1));
		panel_1.add(setNumber);
		
		setDate = new JSpinner();
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();
		
		cal.add(Calendar.YEAR,-50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR,100);
		Date end = cal.getTime();
		
		
		setDate.setModel(new SpinnerDateModel(value, start, end, Calendar.YEAR));
		setDate.setEditor(new JSpinner.DateEditor(setDate,"yyyy//MM//dd"));
		panel_1.add(setDate);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		int value = slider.getValue();
		JOptionPane.showMessageDialog(null, "슬라이더의 값은 " + value);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == slider_R || e.getSource() == slider_B || e.getSource() == slider_G) {
			Color color = new Color(slider_R.getValue(), slider_G.getValue(), slider_B.getValue());
			lblColor.setBackground(color);
		}

		if (e.getSource() == slider) {
			int value = slider.getValue();
			lblValue.setText(value + "");
		}
	}
	protected void do_slider_R_stateChanged(ChangeEvent e) {
		
			
	}
	protected void do_slider_G_stateChanged(ChangeEvent e) {
		
	}
	protected void do_slider_B_stateChanged(ChangeEvent e) {
		
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String strVal = (String) setList.getValue();
		int intVal = (int) setNumber.getValue();
		Date dateVal = (Date) setDate.getValue();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy//MM//dd");
		JOptionPane.showMessageDialog(null, strVal + "\n" + intVal + "\n" + sdf.format(dateVal));
	}
}


package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.text.ParseException;
import java.time.LocalDate;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class JTextFieldOtherEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfid;
	private JPasswordField pfPwd;
	private JPasswordField pfPwd2;
	private JButton btnOk;
	private JLabel lvlConfirm;
	private JFormattedTextField ftfDate;
	private JScrollPane scrollPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldOtherEx frame = new JTextFieldOtherEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public JTextFieldOtherEx() throws ParseException {
		initComponents();
	}

	private void initComponents() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pContent = new JPanel();
		pContent.setForeground(Color.GREEN);
		contentPane.add(pContent);
		pContent.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblid = new JLabel("ID");
		pContent.add(lblid);

		tfid = new JTextField();
		pContent.add(tfid);
		tfid.setColumns(10);

		JLabel tfid_1 = new JLabel("PASSWARD");
		pContent.add(tfid_1);

		pfPwd = new JPasswordField();
		pContent.add(pfPwd);

		JLabel lblPassward2 = new JLabel("PASSWARD 확인");
		pContent.add(lblPassward2);

		pfPwd2 = new JPasswordField();
		pContent.add(pfPwd2);

		JPanel pBlank = new JPanel();
		pContent.add(pBlank);

		lvlConfirm = new JLabel("");
		lvlConfirm.setForeground(Color.RED);
		lvlConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		pContent.add(lvlConfirm);

		JLabel lblDate = new JLabel("DATE");
		pContent.add(lblDate);

		MaskFormatter mf = new MaskFormatter("####-##-##");
		mf.setPlaceholderCharacter('_');
		ftfDate = new JFormattedTextField(mf);
		ftfDate.setValue(LocalDate.now());
		pContent.add(ftfDate);

		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		pContent.add(btnOk);

		JButton btnCancel = new JButton("초기화");
		pContent.add(btnCancel);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			do_btnOk_actionPerformed(e);
		}
	}

	protected void do_btnOk_actionPerformed(ActionEvent e) {
		valiCheck();
		String pwd1 = new String(pfPwd.getPassword());
		String pwd2 = new String(pfPwd2.getPassword());
		if (pwd1.equals(pwd2)) {

		} else {

		}

		String message = String.format("id=%s%n" + "passwd1=%s%n" + "passwd2=%s%n", tfid.getText().trim(), pwd1, pwd2,
				ftfDate.getText());

		/*
		 * ta.append(message); tfid.requestFocus(); tfid.selectAll();
		 * ta.setCaretPosition(ta.getDocument());
		 */

		JOptionPane.showMessageDialog(null, message);
	}

	private void valiCheck() {
		if (tfid.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ID가 비었음");
			tfid.requestFocus();
		}
		String pwd1 = new String(pfPwd.getPassword());
		String pwd2 = new String(pfPwd2.getPassword());
		if (pwd1.equals("")) {
			JOptionPane.showMessageDialog(null, "password가 비었음");
			pfPwd.requestFocus();
		}
		if (pwd2.equals("")) {
			JOptionPane.showMessageDialog(null, "password확인이 비었음");
			pfPwd2.requestFocus();
		}
	}
}

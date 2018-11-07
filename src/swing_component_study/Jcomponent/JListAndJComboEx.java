package swing_component_study.Jcomponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JListAndJComboEx extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JList<String> listJListName;
	private List<String> listArrayListNames;
	private String iconPath;
	private ImageIcon appleIcon;
	private ImageIcon bananaIcon;
	private ImageIcon cherryIcon;
	private JComboBox<String> cmb1;
	private JPanel panel_1;

	public JListAndJComboEx() {
		listArrayListNames = new ArrayList<>();
		listArrayListNames.add("김보민");
		listArrayListNames.add("황경수");
		listArrayListNames.add("우선미");
		
		iconPath = System.getProperty("user.dir")+"\\images\\fruits\\";
		appleIcon = new ImageIcon(iconPath +"apple.jpg");
		bananaIcon = new ImageIcon(iconPath +"banana.jpg");
		cherryIcon = new ImageIcon(iconPath +"cherry.jpg");
		
		initComponents();
	}
	private void initComponents() {
		setTitle("JList And JComboEx");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 836, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 0));
		
		JPanel pJList = new JPanel();
		pJList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJList);
		pJList.setLayout(new GridLayout(0, 3, 10, 0));
		
		JList<String> list = new JList<>();
		list.setListData(getStringData());
		pJList.add(list);
		
		JList<ImageIcon> listImg = new JList<>();
		listImg.setListData(getImgIcons());
		pJList.add(listImg);
		
		JPanel pInputList = new JPanel();
		pJList.add(pInputList);
		pInputList.setLayout(new BorderLayout(0, 0));
		
		JPanel pInputName = new JPanel();
		pInputList.add(pInputName, BorderLayout.NORTH);
		
		JLabel lblName = new JLabel("이름 입력 후 <Enter>키");
		lblName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = listJListName.getSelectedValue();
				int selectIndex = listJListName.getSelectedIndex();
				JOptionPane.showMessageDialog(null, "선택한 이름은 " + name + "\n선택한 이름의 위치 : " + selectIndex);
			}
			
		});
		pInputName.add(lblName);
		
		tfName = new JTextField();
		tfName.addActionListener(this);
		pInputName.add(tfName);
		tfName.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		pInputList.add(scrollPane, BorderLayout.CENTER);
		
	
		listJListName = new JList<>();
		listJListName.setListData(new Vector<>(listArrayListNames));
		listJListName.setVisibleRowCount(5);
		listJListName.setFixedCellWidth(100);
		scrollPane.setViewportView(listJListName);
		
		JPanel pJCombo = new JPanel();
		pJCombo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pJCombo);
		pJCombo.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel = new JPanel();
		pJCombo.add(panel);
		
		String[] strArr1 = {"apple","banana","cherry"};
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(strArr1);
		cmb1 = new JComboBox<>(model);
		cmb1.addItemListener(this);
		panel.add(cmb1);
		
		String[] strArr2 = {"김보민","우선민","황경수","이준민"};
		JComboBox<String> cmb2 = new JComboBox<>();
		for(int i=0; i<strArr2.length; i++) {
			cmb2.addItem(strArr2[i]);
		}
		cmb2.setSelectedIndex(-1);
		
		cmb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String) cmb2.getSelectedItem();
				int index = cmb2.getSelectedIndex();
				JOptionPane.showMessageDialog(null, index + "번째 선택된 이름" + name);
				//
			}
		});
		panel.add(cmb2);
		
		panel_1 = new JPanel();
		
		pJCombo.add(panel_1);
		
	}

	private ImageIcon[] getImgIcons() {
		String imgPath = System.getProperty("user.dir") + "\\images\\";
		ImageIcon[] icons = new ImageIcon[] {
				new ImageIcon(imgPath + "icon1.png"),
				new ImageIcon(imgPath + "icon2.png"),
				new ImageIcon(imgPath + "icon3.png"),
				new ImageIcon(imgPath + "icon4.png")
		};
		return icons;
	}

	private String[] getStringData() {
		return new String[] {"apple", "banaa", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackverry"};
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfName) {
			do_tfName_actionPerformed(e);
		}
	}
	protected void do_tfName_actionPerformed(ActionEvent e) {
		listArrayListNames.add(tfName.getText().trim());//tfname에 있는 값을 List<String>에 추가
		listJListName.setListData(new Vector<>(listArrayListNames));
		tfName.setText("");
		tfName.requestFocus();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}
}

package s0925;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DicApp extends JFrame implements ActionListener{
	private JTextField eng = new JTextField(9);
	private JTextField kor = new JTextField(9);
	private JButton saveBtn = new JButton("저장");
	private JButton searchBtn = new JButton("찾기");
	private JLabel countLabel = new JLabel("0");
	private JTextArea ta = new JTextArea(7,25);
	private JScrollPane sp = new JScrollPane(ta);
	
	private HashMap<String, String> dic = new
			HashMap<String,String>();
	public DicApp() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		
		saveBtn.setBackground(Color.YELLOW);
		searchBtn.setBackground(Color.GREEN);
		
		p.add(new JLabel("영어"));
		p.add(eng);
		p.add(new JLabel("한글"));
		p.add(kor);
		p.add(saveBtn);
		p.add(searchBtn);
		p.add(countLabel);
		p.add(sp);
		
		saveBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		
		setTitle("단어사전만들기");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DicApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == saveBtn) {
			String eText = eng.getText();
			String kText = kor.getText();
			
		if(eText.length() == 0 || kText.length() == 0) {
			ta.append("삽입실패("+eText+","+kText+")\n");
			return;
		}
		
		if(dic.containsKey(eText)) {
			ta.append("변경("+eText+","+kText+")\n");
			dic.put(eText, kText);
		} else {
			ta.append("삽입("+eText+","+kText+")\n");
			dic.put(eText, kText);
		
			int count = Integer.parseInt(countLabel.getText());
			countLabel.setText(Integer.toString(count+1));
		}
		}
		else if(e.getSource() == searchBtn) {
			String kText = dic.get(eng.getText());
			kor.setText(kText);
		}			
	}
}
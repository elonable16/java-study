package hello2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("ok");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame, title, true);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200,100);
		
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	public String getInput() {
		if(tf.getText().length() ==0)return null;
		else return tf.getText();
	}
}
public class DialogEx2 extends JFrame {
	private MyModalDialog dialog;
	public DialogEx2() {
		super("dialogex2 «¡∑π¿”");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("show modal dialog");
		
		dialog = new MyModalDialog(this, "test modal dialog");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				String text = dialog.getInput();
				if(text ==null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx2();
	}

}

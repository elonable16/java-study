package StudentGrade;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;

// TxstField ��Ŀ�� �̵� ������//

public class TextFocusEvent implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField tf = (JTextField)e.getSource();
		tf.transferFocus();
	}

}
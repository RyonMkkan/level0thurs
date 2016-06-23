package level0thurs;

import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		
JOptionPane.showInputDialog("what is your yes or no question?");	
	}
		for (int i = 0; i < 5; i++) {
			
		
int magic= new Random().nextInt(4);
if (magic==0) {
	JOptionPane.showMessageDialog(null, "sleep on it");
}
if (magic==1) {
	JOptionPane.showMessageDialog(null, "just do it!");
}
if (magic==2) {
JOptionPane.showMessageDialog(null, "no");
}
if (magic==3) {
	JOptionPane.showMessageDialog(null, "hyes");
}
	}
	}

}

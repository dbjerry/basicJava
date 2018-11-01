package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnoInner02 {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
				
			}
		});
		
		
		
		
		
		
		
	}
	
}

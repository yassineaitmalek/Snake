import javax.swing.*;

public class Gameframe extends JFrame{
	
	Gameframe(){
		
		this.add(new Gamepanel());
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.show();
		
		
		
		
		
	}
}

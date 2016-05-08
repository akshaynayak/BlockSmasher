import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Block Smasher");
		
		
		BlockBreakerPanel panel=new BlockBreakerPanel();
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(490, 600);
		frame.setResizable(false);
	}

}

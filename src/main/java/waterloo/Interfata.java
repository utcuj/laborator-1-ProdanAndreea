package waterloo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfata extends JFrame {	
	
	private static final long serialVersionUID = 1L;
	
	JLabel label = new JLabel("Cod tren");
	JTextField field = new JTextField("", 5);
	JButton button = new JButton("Afisare tren");
	JTextArea text_res = new JTextArea("", 3, 10);
	
	JPanel panel = new JPanel(new GridBagLayout());
	GridBagConstraints grid = new GridBagConstraints();

	Controller controller;
	
	public Interfata(Controller controller) {
		super("Train Station");
		
		this.controller = controller;
		
		setSize(350, 200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());

		// x - col, y - row
		grid.gridx = 0;
		grid.gridy = 0;
        panel.add(label, grid);

        grid.gridx = 1;
        grid.gridy = 0;
        panel.add(field, grid);
       
        grid.gridx = 2;
        grid.gridy = 0;
        panel.add(button, grid);
        
        grid.gridx = 1;
        grid.gridy = 2;
        panel.add(text_res, grid);
        
        button.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {   
	        	String cod = field.getText();
	        	String data = controller.getTren(cod);
	        	if (data == null) {
	        		text_res.setText("Nu a fost gasit !");
	        	} else {
	        		text_res.setText(data);
	        	}
	        }
        });
        
        
        add(panel);
		setVisible(true);
	}

}


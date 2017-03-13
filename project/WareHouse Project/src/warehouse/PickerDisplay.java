package warehouse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class PickerDisplay extends JFrame {

	private JPanel contentPane;
	private String zone;
	private int aisle = 0;
	private int rack = 0;
	private int level = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PickerDisplay frame = new PickerDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PickerDisplay(String zone, int aisle, int rack, int level) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.zone = zone;
		this.aisle = aisle;
		this.rack = rack;
		this.level = level;
		
		JLabel lblNextFasciaPick = new JLabel("NEXT FASCIA PICK FROM ");
		lblNextFasciaPick.setForeground(Color.RED);
		lblNextFasciaPick.setFont(new Font("Tahoma", Font.PLAIN, 50));
		contentPane.add(lblNextFasciaPick, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JTextArea txtrZone = new JTextArea();
		txtrZone.setForeground(Color.GREEN);
		txtrZone.setBackground(Color.LIGHT_GRAY);
		contentPane.add(txtrZone, BorderLayout.CENTER);
		txtrZone.setFont(new Font("Tahoma", Font.BOLD, 42));
		txtrZone.setText("ZONE: "+zone+"\nAisle: "+aisle+"\nRack: "+rack+"\nLevel: "+level);
	}

}

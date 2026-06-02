package pekan8_2511532019;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import pekan8_2511532019.BubbleSortGUI_2511532019;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BubbleSortGUI_2511532019 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int [] array_2019;
	private JLabel[] labelArray_2019;
	private JButton stepButton_2019, resetButton_2019, setButton_2019;
	private JTextField inputField_2019;
	private JPanel panelArray_2019;
	private JTextArea stepArea_2019;
	private int i_2019=1, j_2019;
	private boolean sorting_2019 = false;
	private int stepCount_2019=1;

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511532019() {
		setTitle("Bubble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//panel input
		JPanel inputPanel_2019 = new JPanel (new FlowLayout());
		inputField_2019=new JTextField(30);
		setButton_2019=new JButton ("Set Array");
		inputPanel_2019.add(new JLabel ("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_2019.add (inputField_2019);
		inputPanel_2019.add(setButton_2019);
		
		//panel array visual
		panelArray_2019=new JPanel();
		panelArray_2019.setLayout(new FlowLayout());
		
		//panel kontrol
		JPanel controlPanel_2019=new JPanel();
		stepButton_2019=new JButton ("Langkah selanjutnya");
		resetButton_2019=new JButton ("Reset");
		stepButton_2019.setEnabled(false);
		controlPanel_2019.add(stepButton_2019);
		controlPanel_2019.add(resetButton_2019);
		
		//Area teks untuk log langkah-langkah
		stepArea_2019 = new JTextArea(8,60);
		stepArea_2019.setEditable(false);
		stepArea_2019.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2019=new JScrollPane(stepArea_2019);
		
		//tambahkan panel ke frame
		add(inputPanel_2019, BorderLayout.NORTH);
		add(panelArray_2019, BorderLayout.CENTER);
		add(controlPanel_2019, BorderLayout.SOUTH);
		add(scrollPane_2019,BorderLayout.EAST);
		
		//Event Set Array
		setButton_2019.addActionListener(e-> setArrayFromInput());
		
		//event langkah selanjutnya
		stepButton_2019.addActionListener(e->performStep());
		
		//event Reset
		resetButton_2019.addActionListener(e->reset());
	}
	
	private void setArrayFromInput() {
		String text=inputField_2019.getText().trim();
		if (text.isEmpty()) return;
		String[] parts=text.split(",");
		array_2019= new int [parts.length];
		try {
			for (int k_2019=0; k_2019<parts.length;k_2019++) {
				array_2019 [k_2019]=Integer.parseInt(parts[k_2019].trim());
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this,  "Masukkan hanya angka yang dipisahkan"+ "dengan koma!","error", JOptionPane.ERROR_MESSAGE);
			return;
			}
		i_2019=0;
		j_2019=0;
		stepCount_2019=1;
		sorting_2019=true;
		stepButton_2019.setEnabled(true);
		stepArea_2019.setText("");
		panelArray_2019.removeAll();
		labelArray_2019=new JLabel[array_2019.length];
		for (int k_2019=0; k_2019<array_2019.length;k_2019++) {
			labelArray_2019[k_2019]=new JLabel (String.valueOf(array_2019[k_2019]));
			labelArray_2019[k_2019].setFont(new Font ("Arial", Font.BOLD,24));
			labelArray_2019[k_2019].setOpaque(true);
			labelArray_2019[k_2019].setBackground(Color.WHITE);
			labelArray_2019[k_2019].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2019[k_2019].setPreferredSize (new Dimension(50,50));
			labelArray_2019[k_2019].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2019.add(labelArray_2019[k_2019]);
		}
		panelArray_2019.revalidate();
		panelArray_2019.repaint();
	}
	
	private void performStep() {
		if (!sorting_2019||i_2019>=array_2019.length-1) {
			sorting_2019 = false;
			stepButton_2019.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
			return;}
		resetHighlights_2019();
		StringBuilder stepLog_2019=new StringBuilder();
		labelArray_2019[j_2019].setBackground(Color.CYAN);
		labelArray_2019[j_2019+1].setBackground(Color.CYAN);
		if(array_2019[j_2019]>array_2019[j_2019+1]) {
			//swap
			int temp_2019=array_2019[j_2019];
			array_2019[j_2019]=array_2019[j_2019+1];
			array_2019[j_2019+1]=temp_2019;
			labelArray_2019[j_2019].setBackground(Color.RED);
			labelArray_2019[j_2019+1].setBackground(Color.RED);
			stepLog_2019.append("Langkah ").append (stepCount_2019).append(": Menukar elemen ke-")
						.append(j_2019).append("(").append(array_2019[j_2019+1]).append(") dengan ke-")
						.append(j_2019+1).append("(").append (array_2019[j_2019]).append(")\n");
		}else {
			stepLog_2019.append("Langkah").append (stepCount_2019).append(": Tidak ada pertukaran antara ke-")
				   .append(j_2019).append("dan ke-").append(j_2019+1).append("\n");
			stepLog_2019.append ("Hasil: ").append(arrayToString(array_2019)).append("\n\n");
			stepArea_2019.append(stepLog_2019.toString());
			updateLabels();
			j_2019++;
			if(j_2019>=array_2019.length-i_2019-1) {
				j_2019=0;
				i_2019++;}
			stepCount_2019++;
			if(i_2019>=array_2019.length-1) {
				sorting_2019=false;
				stepButton_2019.setEnabled(false);
				JOptionPane.showMessageDialog(this,  "Sorting selesai !");
			}
		}
	}
	private void updateLabels() {
		for (int k_2019=0; k_2019< array_2019.length; k_2019++) {
			labelArray_2019[k_2019].setText(String.valueOf(array_2019[k_2019]));
		}
	}
	private void resetHighlights_2019() {
		for(JLabel label : labelArray_2019) {
			label.setBackground(Color.WHITE);
		}
	}
	private void reset () {
		inputField_2019.setText("");
		panelArray_2019.removeAll();
		panelArray_2019.revalidate();
		panelArray_2019.repaint();
		stepArea_2019.setText("");
		stepButton_2019.setEnabled(false);
		sorting_2019=false;
		i_2019=0;
		j_2019=0;
		stepCount_2019=1;
	}
	
	private String arrayToString(int[] arr) {
		StringBuilder sb_2019= new StringBuilder();
		for (int k_2019=0; k_2019<arr.length;k_2019++) {
			sb_2019.append (arr[k_2019]);
			if (k_2019<arr.length-1) sb_2019.append(", ");
		}
		return sb_2019.toString();
	}
	public static void main (String[] args) {
		SwingUtilities.invokeLater(()->{
			BubbleSortGUI_2511532019 gui=new BubbleSortGUI_2511532019();
			gui.setVisible(true);
		});
	}
}
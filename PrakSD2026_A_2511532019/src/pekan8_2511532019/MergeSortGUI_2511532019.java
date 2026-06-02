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
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Queue;
import java.util.LinkedList;

public class MergeSortGUI_2511532019 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int [] array_2019;
	private JLabel[] labelArray_2019;
	private JButton stepButton_2019, resetButton_2019, setButton_2019;
	private JTextField inputField_2019;
	private JPanel panelArray_2019;
	private JTextArea stepArea_2019;
	private int i_2019=1, j_2019;
	private int stepCount_2019=1;
	private Queue<int[]> mergeQueue_2019 = new LinkedList<>();
	private boolean isMerging_2019;
	private boolean copying_2019;
	private int left_2019;
	private int mid_2019;
	private int right_2019;
	private int[] temp_2019;
	private int k_2019;

	/**
	 * Create the frame.
	 */
	public MergeSortGUI_2511532019() {
		setTitle("Merge Sort Langkah per Langkah");
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
		setButton_2019.addActionListener(e-> setArrayFromInput_2019());
		
		//event langkah selanjutnya
		stepButton_2019.addActionListener(e->performStep_2019());
		
		//event Reset
		resetButton_2019.addActionListener(e->reset_2019());
	}
	private void setArrayFromInput_2019() {
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
	
		labelArray_2019=new JLabel[array_2019.length];
		panelArray_2019.removeAll();
		for (int i_2019=0; i_2019<array_2019.length;i_2019++) {
			labelArray_2019[i_2019]=new JLabel (String.valueOf(array_2019[i_2019]));
			labelArray_2019[i_2019].setFont(new Font ("Arial", Font.BOLD,24));
			labelArray_2019[i_2019].setOpaque(true);
			labelArray_2019[i_2019].setBackground(Color.WHITE);
			labelArray_2019[i_2019].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2019[i_2019].setPreferredSize (new Dimension(50,50));
			labelArray_2019[i_2019].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2019.add(labelArray_2019[i_2019]);
		}
		mergeQueue_2019.clear();
		generateMergeSteps(0,array_2019.length-1);
		stepButton_2019.setEnabled(true);
		stepArea_2019.setText("");
		stepCount_2019=1;
		isMerging_2019=false;
		panelArray_2019.revalidate();
		panelArray_2019.repaint();
	}
	private void generateMergeSteps(int left_2019, int right_2019) {

	    if (left_2019 >= right_2019) {
	        return;
	    }

	    int mid_2019 = (left_2019 + right_2019) / 2;

	    generateMergeSteps(left_2019, mid_2019);
	    generateMergeSteps(mid_2019 + 1, right_2019);

	    mergeQueue_2019.add(
	        new int[] {left_2019, mid_2019, right_2019}
	    );
	}
	
	private void performStep_2019() {
		resetHighlights_2019();
		
		if (!isMerging_2019 && !mergeQueue_2019.isEmpty()) {
			int[] range_2019 = mergeQueue_2019.poll();
			left_2019=range_2019[0];
			mid_2019=range_2019[1];
			right_2019=range_2019[2];
			temp_2019=new int [right_2019-left_2019+1];
			i_2019=left_2019;
			j_2019=mid_2019+1;
			k_2019=0;
			copying_2019=false;
			isMerging_2019=true;
			stepArea_2019.append("Langkah "+stepCount_2019++ +": Mulai merge dari "+left_2019+" ke "+right_2019+ "\n");
			return;
		}
		if (isMerging_2019&&!copying_2019) {
			if (i_2019<= mid_2019 && j_2019<=right_2019) {
				labelArray_2019[i_2019].setBackground(Color.CYAN);
				labelArray_2019[j_2019].setBackground(Color.CYAN);
				if (array_2019[i_2019]<= array_2019[j_2019]) {
					temp_2019[k_2019++]=array_2019[i_2019++];
				}else {
					temp_2019[k_2019++]=array_2019[j_2019++];
				}
				stepArea_2019.append("Langkah "+stepCount_2019++ + ": Bandingkan dan salin elemen \n");
				return;
			}else if (i_2019<=mid_2019) {
				temp_2019[k_2019++]=array_2019[i_2019++];
				stepArea_2019.append("Langkah "+stepCount_2019++ +": Salin sisa kiri\n");
				return;
			}else if(j_2019<=right_2019) {
				temp_2019 [k_2019++]=array_2019[j_2019++];
				stepArea_2019.append("Langkah "+stepCount_2019++ + ": Salin sisa kanan \n");
				return;
			}else {
				copying_2019=true;
				k_2019=0;
				return;
			}
		}
		if(copying_2019 && k_2019<temp_2019.length) {
			array_2019[left_2019+k_2019]=temp_2019[k_2019];
			labelArray_2019[left_2019+k_2019].setText(String.valueOf(temp_2019[k_2019]));
			labelArray_2019[left_2019+k_2019].setBackground(Color.GREEN);
			k_2019++;
			stepArea_2019.append("Langkah "+ stepCount_2019++ + ": Tempelkan ke array utama \n");
			return;
		}
		if (copying_2019 && k_2019==temp_2019.length) {
			isMerging_2019=false;
			copying_2019=false;
		}
		if (mergeQueue_2019.isEmpty()&&!isMerging_2019) {
			stepArea_2019.append("Selesai.\n");
			stepButton_2019.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}
	private void resetHighlights_2019() {
		if (labelArray_2019==null)return;
		for (JLabel label : labelArray_2019) {
			label.setBackground(Color.WHITE);
		}
	}
	private void reset_2019() {
		inputField_2019.setText("");
		panelArray_2019.removeAll();
		panelArray_2019.revalidate();
		panelArray_2019.repaint();
		stepArea_2019.setText("");
		stepButton_2019.setEnabled(false);
		mergeQueue_2019.clear();
		isMerging_2019=false;
		stepCount_2019=1;
		}
	public static void main (String[] args) {
		SwingUtilities.invokeLater(()->{
			MergeSortGUI_2511532019 gui=new MergeSortGUI_2511532019();
			gui.setVisible(true);
		});
	}
}
	
		
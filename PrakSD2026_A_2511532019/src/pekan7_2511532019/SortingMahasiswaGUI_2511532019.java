package pekan7_2511532019;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SortingMahasiswaGUI_2511532019 extends JFrame {

	private static final long serialVersionUID = 1L;

	ArrayList<Mahasiswa_2511532019> listMahasiswa_2019 =
			new ArrayList<Mahasiswa_2511532019>();

	private JTextField namaField_2019;
	private JTextField nimField_2019;
	private JTextField prodiField_2019;
	private JButton tambahButton_2019;
	private JButton urutButton_2019;
	private JButton langkahButton_2019;
	private JButton resetButton_2019;
	private JComboBox<String> comboSort_2019;
	private JTextArea dataArea_2019;
	private JTextArea langkahArea_2019;
	private ArrayList<String> langkahList_2019 =
			new ArrayList<String>();
	private int indexLangkah_2019=0;

	public SortingMahasiswaGUI_2511532019() {

		setTitle("GUI Sorting Mahasiswa 2511532019");
		setSize(900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		JPanel inputPanel_2019=new JPanel(new FlowLayout());

		namaField_2019=new JTextField(10);
		nimField_2019=new JTextField(10);
		prodiField_2019=new JTextField(10);
		tambahButton_2019=new JButton("Tambah Data");

		inputPanel_2019.add(new JLabel("Nama"));
		inputPanel_2019.add(namaField_2019);
		inputPanel_2019.add(new JLabel("NIM"));
		inputPanel_2019.add(nimField_2019);
		inputPanel_2019.add(new JLabel("Prodi"));
		inputPanel_2019.add(prodiField_2019);
		inputPanel_2019.add(tambahButton_2019);

		JPanel sortPanel_2019=new JPanel(new FlowLayout());

		String pilihanSort_2019[]= {
				"Insertion Sort",
				"Selection Sort",
				"Bubble Sort"
		};

		comboSort_2019=new JComboBox<String>(pilihanSort_2019);

		urutButton_2019=new JButton("Mulai Sorting");

		langkahButton_2019=
				new JButton("Langkah Berikutnya");

		resetButton_2019=
				new JButton("Reset");

		langkahButton_2019.setEnabled(false);

		sortPanel_2019.add(new JLabel("Pilih Sorting"));
		sortPanel_2019.add(comboSort_2019);
		sortPanel_2019.add(urutButton_2019);
		sortPanel_2019.add(langkahButton_2019);
		sortPanel_2019.add(resetButton_2019);

		dataArea_2019=new JTextArea();

		dataArea_2019.setEditable(false);

		dataArea_2019.setFont(
				new Font("Monospaced",
						Font.PLAIN,
						14));

		dataArea_2019.setBorder(
				BorderFactory.createTitledBorder(
						"Data Mahasiswa"));

		JScrollPane scrollData_2019=
				new JScrollPane(dataArea_2019);

		scrollData_2019.setPreferredSize(
				new Dimension(400,220));

		langkahArea_2019=new JTextArea();

		langkahArea_2019.setEditable(false);

		langkahArea_2019.setFont(
				new Font("Monospaced",
						Font.BOLD,
						16));

		langkahArea_2019.setBorder(
				BorderFactory.createTitledBorder(
						"Langkah Sorting"));

		JScrollPane scrollLangkah_2019=
				new JScrollPane(langkahArea_2019);

		scrollLangkah_2019.setPreferredSize(
				new Dimension(450,350));

		JPanel centerPanel_2019=
				new JPanel(new FlowLayout());

		centerPanel_2019.add(scrollData_2019);
		centerPanel_2019.add(scrollLangkah_2019);

		add(inputPanel_2019,BorderLayout.NORTH);
		add(sortPanel_2019,BorderLayout.CENTER);
		add(centerPanel_2019,BorderLayout.SOUTH);

		tambahButton_2019
		.addActionListener(e->tambahData_2019());

		urutButton_2019
		.addActionListener(e->mulaiSorting_2019());

		langkahButton_2019
		.addActionListener(e->tampilLangkah_2019());

		resetButton_2019
		.addActionListener(e->reset_2019());
	}

	//fungsi tambah data
	public void tambahData_2019() {
		String nama_2019=
				namaField_2019.getText();
		String nim_2019=
				nimField_2019.getText();
		String prodi_2019=
				prodiField_2019.getText();

		if(nama_2019.isEmpty() ||
		   nim_2019.isEmpty() ||
		   prodi_2019.isEmpty()) {

			JOptionPane.showMessageDialog(
					this,
					"Data tidak boleh kosong");
			return;
		}
		Mahasiswa_2511532019 mhs_2019=
				new Mahasiswa_2511532019(
						nama_2019,
						nim_2019,
						prodi_2019);
		listMahasiswa_2019.add(mhs_2019);

		tampilData_2019();

		namaField_2019.setText("");
		nimField_2019.setText("");
		prodiField_2019.setText("");
	}

	//fungsi tampil data
	public void tampilData_2019() {

		dataArea_2019.setText("");

		for(int i_2019=0;
				i_2019<listMahasiswa_2019.size();
				i_2019++) {

			Mahasiswa_2511532019 mhs_2019=
					listMahasiswa_2019.get(i_2019);

			dataArea_2019.append(
					(i_2019+1)+". "+
					mhs_2019.getNama_2019()+
					" - "+
					mhs_2019.getNim_2019()+
					" - "+
					mhs_2019.getProdi_2019()+
					"\n");
		}
	}

	//fungsi mulai sorting
	public void mulaiSorting_2019() {

		langkahArea_2019.setText("");

		langkahList_2019.clear();

		indexLangkah_2019=0;

		String metode_2019=
				comboSort_2019
				.getSelectedItem()
				.toString();

		ArrayList<Mahasiswa_2511532019> temp_2019=
				new ArrayList<Mahasiswa_2511532019>();

		for(Mahasiswa_2511532019 mhs_2019
				: listMahasiswa_2019) {

			temp_2019.add(
					new Mahasiswa_2511532019(
							mhs_2019.getNama_2019(),
							mhs_2019.getNim_2019(),
							mhs_2019.getProdi_2019()));
		}

		if(metode_2019.equals("Insertion Sort")) {
			insertionSort_2019(temp_2019);
		}

		else if(metode_2019.equals("Selection Sort")) {
			selectionSort_2019(temp_2019);
		}

		else if(metode_2019.equals("Bubble Sort")) {
			bubbleSort_2019(temp_2019);
		}

		langkahButton_2019.setEnabled(true);
	}

	//Insertion Sort
	public void insertionSort_2019(
			ArrayList<Mahasiswa_2511532019> arr_2019) {

		for(int i_2019=1;
				i_2019<arr_2019.size();
				i_2019++) {

			Mahasiswa_2511532019 key_2019=
					arr_2019.get(i_2019);

			int j_2019=i_2019-1;

			while(j_2019>=0 &&
					arr_2019.get(j_2019)
					.getNama_2019()
					.compareToIgnoreCase(
							key_2019.getNama_2019())>0) {

				arr_2019.set(
						j_2019+1,
						arr_2019.get(j_2019));

				j_2019--;
			}

			arr_2019.set(j_2019+1,key_2019);

			simpanLangkah_2019(arr_2019);
		}
	}

	//Selection Sort
	public void selectionSort_2019(
			ArrayList<Mahasiswa_2511532019> arr_2019) {

		for(int i_2019=0;
				i_2019<arr_2019.size()-1;
				i_2019++) {

			int minIndex_2019=i_2019;

			for(int j_2019=i_2019+1;
					j_2019<arr_2019.size();
					j_2019++) {

				if(arr_2019.get(j_2019)
						.getNama_2019()
						.compareToIgnoreCase(
								arr_2019.get(minIndex_2019)
								.getNama_2019())<0) {

					minIndex_2019=j_2019;
				}
			}

			Mahasiswa_2511532019 temp_2019=
					arr_2019.get(i_2019);

			arr_2019.set(
					i_2019,
					arr_2019.get(minIndex_2019));

			arr_2019.set(minIndex_2019,temp_2019);

			simpanLangkah_2019(arr_2019);
		}
	}

	//Bubble Sort
	public void bubbleSort_2019(
			ArrayList<Mahasiswa_2511532019> arr_2019) {

		for(int i_2019=0;
				i_2019<arr_2019.size()-1;
				i_2019++) {

			for(int j_2019=0;
					j_2019<arr_2019.size()-i_2019-1;
					j_2019++) {

				if(arr_2019.get(j_2019)
						.getNama_2019()
						.compareToIgnoreCase(
								arr_2019.get(j_2019+1)
								.getNama_2019())>0) {

					Mahasiswa_2511532019 temp_2019=
							arr_2019.get(j_2019);

					arr_2019.set(
							j_2019,
							arr_2019.get(j_2019+1));

					arr_2019.set(j_2019+1,temp_2019);
				}
			}

			simpanLangkah_2019(arr_2019);
		}
	}

	//fungsi simpan langkah
	public void simpanLangkah_2019(
			ArrayList<Mahasiswa_2511532019> arr_2019) {

		String hasil_2019="[";

		for(int i_2019=0;
				i_2019<arr_2019.size();
				i_2019++) {

			hasil_2019 +=
					arr_2019.get(i_2019)
					.getNama_2019();

			if(i_2019<arr_2019.size()-1) {
				hasil_2019 += ", ";
			}
		}

		hasil_2019 += "]";

		langkahList_2019.add(hasil_2019);
	}

	//fungsi tampil langkah
	public void tampilLangkah_2019() {

		if(indexLangkah_2019<
				langkahList_2019.size()) {

			langkahArea_2019.append(
					"Langkah "+
					(indexLangkah_2019+1)+
					":\n"+
					langkahList_2019
					.get(indexLangkah_2019)+
					"\n\n");

			indexLangkah_2019++;
		}
		else {

			JOptionPane.showMessageDialog(
					this,
					"Sorting selesai");

			langkahButton_2019.setEnabled(false);
		}
	}

	//fungsi reset
	public void reset_2019() {

		namaField_2019.setText("");
		nimField_2019.setText("");
		prodiField_2019.setText("");

		dataArea_2019.setText("");
		langkahArea_2019.setText("");

		listMahasiswa_2019.clear();
		langkahList_2019.clear();

		indexLangkah_2019=0;

		langkahButton_2019.setEnabled(false);

		JOptionPane.showMessageDialog(
				this,
				"Data berhasil direset");
	}

	public static void main(String[] args) {

		new SortingMahasiswaGUI_2511532019()
		.setVisible(true);
	}
}
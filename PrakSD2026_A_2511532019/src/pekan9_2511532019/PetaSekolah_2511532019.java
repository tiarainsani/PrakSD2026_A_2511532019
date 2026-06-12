package pekan9_2511532019;

import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Set;

public class PetaSekolah_2511532019 extends JFrame {

    private JComboBox<String> awal_2019;
    private JComboBox<String> tujuan_2019;
    private JButton bfs_2019;
    private JButton dfs_2019;
    private JButton reset_2019;
    private JTextArea graphArea_2019;
    private JTextArea jalur_2019;
    private JTextArea nodeDikunjungi_2019;
    private JLabel jumlahNode_2019;
    private Map<String, List<String>> graphData_2019 = new HashMap<>();
    private String petaTeks_2019;

    private void addEdge_2019(String node1_2019, String node2_2019) {
        graphData_2019.putIfAbsent(node1_2019, new ArrayList<>());
        graphData_2019.putIfAbsent(node2_2019, new ArrayList<>());

        graphData_2019.get(node1_2019).add(node2_2019);
        graphData_2019.get(node2_2019).add(node1_2019);
    }

    private void buatGraph_2019() {
        addEdge_2019("Lapangan_Voli", "L._Basket");
        addEdge_2019("Lapangan_Voli", "Tata_Busana");
        addEdge_2019("L._Basket", "Lap._Takraw");
        addEdge_2019("L._Basket", "Ruang_Guru");
        addEdge_2019("Lap._Takraw", "Uks"); 
        addEdge_2019("Tata_Busana", "Ptsp");
        addEdge_2019("Tata_Busana", "Kantin"); 
        addEdge_2019("Ptsp", "Ruang_Guru");
        addEdge_2019("Ruang_Guru", "Koperasi");
        addEdge_2019("Ruang_Guru", "Aula");
        addEdge_2019("Ruang_Guru", "Kantin");
        addEdge_2019("Koperasi", "Aula");
        addEdge_2019("Koperasi", "Mesjid"); 
        addEdge_2019("Aula", "Uks");
        addEdge_2019("Aula", "Kantin");
        addEdge_2019("Kantin", "Mesjid"); 
        addEdge_2019("Uks", "Hall");
        addEdge_2019("Uks", "Mesjid");
        addEdge_2019("Hall", "Mesjid");
    }

    private void displayGraph_2019(List<String> urutan_2019) {
        Highlighter h_2019 = graphArea_2019.getHighlighter();
        h_2019.removeAllHighlights();

        Highlighter.HighlightPainter painter_2019 = new DefaultHighlighter.DefaultHighlightPainter(new Color(255, 150, 150));
        String teksPeta_2019 = graphArea_2019.getText();

        for (String node_2019 : urutan_2019) {
            int index_2019 = teksPeta_2019.indexOf(node_2019);
            while (index_2019 >= 0) {
                try {
                    h_2019.addHighlight(index_2019, index_2019 + node_2019.length(), painter_2019);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                index_2019 = teksPeta_2019.indexOf(node_2019, index_2019 + 1);
            }
        }
    }

    private void displayPath_2019(ArrayList<String> path_2019, ArrayList<String> urutan_2019, String tipe_2019) {
        jalur_2019.setText("Jalur " + tipe_2019 + " : " + (path_2019.isEmpty() ? "Tidak ditemukan" : String.join(" -> ", path_2019)));
        nodeDikunjungi_2019.setText("Node Dikunjungi : " + String.join(" -> ", urutan_2019));
        jumlahNode_2019.setText("Jumlah Node Dikunjungi / Dieksplorasi : " + urutan_2019.size());
    }

    private void resetGraph_2019() {
        graphArea_2019.getHighlighter().removeAllHighlights();
        jalur_2019.setText("Jalur : ");
        nodeDikunjungi_2019.setText("Node Dikunjungi : ");
        jumlahNode_2019.setText("Jumlah Node Dikunjungi / Dieksplorasi : 0");
    }

    // Method Wajib: BFS
    private void bfs_2019() {
        ArrayList<String> urutan_2019 = new ArrayList<>();
        String start_2019 = awal_2019.getSelectedItem().toString();
        String tujuan_2019Str = tujuan_2019.getSelectedItem().toString();

        Queue<String> queue_2019 = new LinkedList<>();
        Set<String> visited_2019 = new HashSet<>();
        Map<String, String> parent_2019 = new HashMap<>();

        queue_2019.add(start_2019);
        visited_2019.add(start_2019);
        parent_2019.put(start_2019, null);

        boolean found = false;

        while (!queue_2019.isEmpty()) {
            String current_2019 = queue_2019.poll();
            urutan_2019.add(current_2019);

            if (current_2019.equals(tujuan_2019Str)) {
                found = true;
                break;
            }

            List<String> neighbors = graphData_2019.getOrDefault(current_2019, new ArrayList<>());
            for (String neighbor_2019 : neighbors) {
                if (!visited_2019.contains(neighbor_2019)) {
                    visited_2019.add(neighbor_2019);
                    parent_2019.put(neighbor_2019, current_2019);
                    queue_2019.add(neighbor_2019);
                }
            }
        }

        ArrayList<String> path_2019 = new ArrayList<>();
        if (found) {
            String current_2019 = tujuan_2019Str;
            while (current_2019 != null) {
                path_2019.add(0, current_2019);
                current_2019 = parent_2019.get(current_2019);
            }
        }

        displayPath_2019(path_2019, urutan_2019, "BFS");
        displayGraph_2019(urutan_2019);
    }

    // Method Wajib: DFS
    private void dfs_2019() {
        ArrayList<String> urutan_2019 = new ArrayList<>(); 
        String start_2019 = awal_2019.getSelectedItem().toString();
        String tujuan_2019Str = tujuan_2019.getSelectedItem().toString();

        Stack<String> stack_2019 = new Stack<>();
        Set<String> visited_2019 = new HashSet<>();
        Map<String, String> parent_2019 = new HashMap<>();

        stack_2019.push(start_2019);
        parent_2019.put(start_2019, null);

        boolean found = false;

        while (!stack_2019.isEmpty()) {
            String current_2019 = stack_2019.pop();

            if (!visited_2019.contains(current_2019)) {
                visited_2019.add(current_2019);
                urutan_2019.add(current_2019);

                if (current_2019.equals(tujuan_2019Str)) {
                    found = true;
                    break;
                }

                List<String> neighbors_2019 = graphData_2019.getOrDefault(current_2019, new ArrayList<>());
                for (int i = neighbors_2019.size() - 1; i >= 0; i--) {
                    String next_2019 = neighbors_2019.get(i);
                    if (!visited_2019.contains(next_2019)) {
                        parent_2019.put(next_2019, current_2019); 
                        stack_2019.push(next_2019);
                    }
                }
            }
        }

        ArrayList<String> path_2019 = new ArrayList<>();
        if (found) {
            String current_2019 = tujuan_2019Str;
            while (current_2019 != null) {
                path_2019.add(0, current_2019);
                current_2019 = parent_2019.get(current_2019);
            }
        }

        displayPath_2019(path_2019, urutan_2019, "DFS");
        displayGraph_2019(urutan_2019);
    }

    public PetaSekolah_2511532019() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(850, 720); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        buatGraph_2019();

        JLabel lblAwal_2019 = new JLabel("Lokasi Awal :");
        lblAwal_2019.setBounds(20, 20, 100, 25);
        add(lblAwal_2019);

        String[] lokasi_2019 = {
                "Lapangan_Voli", "L._Basket", "Lap._Takraw",
                "Tata_Busana", "Ptsp", "Ruang_Guru", "Koperasi", 
                "Aula", "Kantin", "Uks", "Hall", "Mesjid"
        };

        awal_2019 = new JComboBox<>(lokasi_2019);
        awal_2019.setBounds(120, 20, 150, 25);
        add(awal_2019);

        JLabel lblTujuan_2019 = new JLabel("Lokasi Tujuan :");
        lblTujuan_2019.setBounds(20, 55, 100, 25);
        add(lblTujuan_2019);

        tujuan_2019 = new JComboBox<>(lokasi_2019);
        tujuan_2019.setSelectedItem("Mesjid");
        tujuan_2019.setBounds(120, 55, 150, 25);
        add(tujuan_2019);

        bfs_2019 = new JButton("BFS");
        bfs_2019.setBounds(450, 25, 80, 35);
        add(bfs_2019);

        dfs_2019 = new JButton("DFS");
        dfs_2019.setBounds(540, 25, 80, 35);
        add(dfs_2019);

        reset_2019 = new JButton("RESET");
        reset_2019.setBounds(630, 25, 100, 35);
        add(reset_2019);

        JPanel panelGraph_2019 = new JPanel();
        panelGraph_2019.setLayout(new BorderLayout());
        panelGraph_2019.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH (WARNA DINAMIS)"));
        panelGraph_2019.setBounds(20, 100, 790, 310);

        graphArea_2019 = new JTextArea();
        graphArea_2019.setEditable(false);
        graphArea_2019.setFont(new Font("Monospaced", Font.PLAIN, 13));

        petaTeks_2019 =
"""
                     [Lapangan_Voli]------------------[Tata_Busana]
                       /          \\                       /      \\
                      /            \\                     /        \\
               [L._Basket]----------[Ruang_Guru]-------[Ptsp]      |
               /    |               /    |    \\                    |
              /     |              /     |     \\                   |
     [Lap._Takraw]  |       [Koperasi]--[Aula]--[Kantin] <---------+
          |         |           |        |        |
          |         |           |        |        |
          |         |           |      [Uks]      |
          |         \\           |      /   \\      |
          |          +----------|-----+     |     |
          |                     |          [Hall] |
          \\                     |            |    |
           +--------------------+--------- [Mesjid]
""";

        graphArea_2019.setText(petaTeks_2019);
        panelGraph_2019.add(new JScrollPane(graphArea_2019));
        add(panelGraph_2019);

        JLabel hasil_2019 = new JLabel("Hasil Pencarian :");
        hasil_2019.setBounds(20, 425, 200, 25);
        add(hasil_2019);

        jalur_2019 = new JTextArea("Jalur : ");
        jalur_2019.setBounds(20, 455, 790, 40);
        jalur_2019.setEditable(false);
        jalur_2019.setLineWrap(true);
        jalur_2019.setWrapStyleWord(true);
        jalur_2019.setBackground(getBackground());
        add(jalur_2019);

        nodeDikunjungi_2019 = new JTextArea("Node Dikunjungi : ");
        nodeDikunjungi_2019.setBounds(20, 505, 790, 50);
        nodeDikunjungi_2019.setEditable(false);
        nodeDikunjungi_2019.setLineWrap(true);
        nodeDikunjungi_2019.setWrapStyleWord(true);
        nodeDikunjungi_2019.setBackground(getBackground());
        add(nodeDikunjungi_2019);

        jumlahNode_2019 = new JLabel("Jumlah Node Dikunjungi / Dieksplorasi : 0");
        jumlahNode_2019.setBounds(20, 565, 400, 25);
        add(jumlahNode_2019);

        bfs_2019.addActionListener(e -> bfs_2019());
        dfs_2019.addActionListener(e -> dfs_2019());
        reset_2019.addActionListener(e -> resetGraph_2019());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaSekolah_2511532019().setVisible(true);
        });
    }
}
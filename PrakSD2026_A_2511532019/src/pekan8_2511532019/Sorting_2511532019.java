package pekan8_2511532019;

import java.util.Scanner;

class Lagu_2019 {

    String judul_2019;
    String penyanyi_2019;
    int durasi_2019;

    public Lagu_2019(
            String judul_2019,
            String penyanyi_2019,
            int durasi_2019) {

        this.judul_2019 = judul_2019;
        this.penyanyi_2019 = penyanyi_2019;
        this.durasi_2019 = durasi_2019;
    }
}

public class Sorting_2511532019 {

    Lagu_2019[] dataLagu_2019 =
            new Lagu_2019[20];

    int jumlahData_2019 = 7;

    public void inputData_2019() {

        dataLagu_2019[0] =
                new Lagu_2019(
                        "Monokrom",
                        "Tulus",
                        221);

        dataLagu_2019[1] =
                new Lagu_2019(
                        "Iqro",
                        "Hindia",
                        245);

        dataLagu_2019[2] =
                new Lagu_2019(
                        "Rabun Jauh",
                        "Hindia",
                        230);

        dataLagu_2019[3] =
                new Lagu_2019(
                        "Perahu Kertas",
                        "Maudy Ayunda",
                        215);

        dataLagu_2019[4] =
                new Lagu_2019(
                        "Runtuh",
                        "Feby Putri",
                        240);

        dataLagu_2019[5] =
                new Lagu_2019(
                        "Indahnya Dirimu",
                        "Naff",
                        225);

        dataLagu_2019[6] =
                new Lagu_2019(
                        "Lantas",
                        "Juicy Luicy",
                        255);
    }

    public void tampilData_2019() {

        for (int i_2019 = 0;
             i_2019 < jumlahData_2019;
             i_2019++) {

            System.out.println(
                    (i_2019 + 1) + ". "
                            + dataLagu_2019[i_2019].judul_2019
                            + " - "
                            + dataLagu_2019[i_2019].durasi_2019
                            + " detik");
        }
    }

    public Lagu_2019[] copyArray_2019() {

        Lagu_2019[] temp_2019 =
                new Lagu_2019[jumlahData_2019];

        for (int i_2019 = 0;
             i_2019 < jumlahData_2019;
             i_2019++) {

            temp_2019[i_2019] =
                    new Lagu_2019(
                            dataLagu_2019[i_2019].judul_2019,
                            dataLagu_2019[i_2019].penyanyi_2019,
                            dataLagu_2019[i_2019].durasi_2019);
        }

        return temp_2019;
    }

    // SHELL SORT (JUDUL)

    public void shellSort_2019(
            Lagu_2019[] arr_2019) {

        int n_2019 = arr_2019.length;

        for (int gap_2019 = n_2019 / 2;
             gap_2019 > 0;
             gap_2019 /= 2) {

        	for (int i_2019 = gap_2019;
                 i_2019 < n_2019;
                 i_2019++) {

                Lagu_2019 temp_2019 =
                        arr_2019[i_2019];

                int j_2019;

                for (j_2019 = i_2019;
                     j_2019 >= gap_2019
                     &&
                     arr_2019[j_2019-gap_2019]
                             .judul_2019
                             .compareToIgnoreCase(
                                     temp_2019.judul_2019)
                             > 0;
                     j_2019 -= gap_2019) {

                    arr_2019[j_2019] =
                            arr_2019[j_2019-gap_2019];
                }

                arr_2019[j_2019] =
                        temp_2019;
            }
        }
    }

    // QUICK SORT (DURASI)

    public int partition_2019(
            Lagu_2019[] arr_2019,
            int low_2019,
            int high_2019) {

        int pivot_2019 =
                arr_2019[high_2019].durasi_2019;

        int i_2019 =
                low_2019 - 1;

        for (int j_2019 = low_2019;
             j_2019 < high_2019;
             j_2019++) {

            if (arr_2019[j_2019]
                    .durasi_2019
                    <= pivot_2019) {

                i_2019++;

                Lagu_2019 temp_2019 =
                        arr_2019[i_2019];

                arr_2019[i_2019] =
                        arr_2019[j_2019];

                arr_2019[j_2019] =
                        temp_2019;
            }
        }

        Lagu_2019 temp_2019 =
                arr_2019[i_2019 + 1];

        arr_2019[i_2019 + 1] =
                arr_2019[high_2019];

        arr_2019[high_2019] =
                temp_2019;

        return i_2019 + 1;
    }

    public void quickSort_2019(
            Lagu_2019[] arr_2019,
            int low_2019,
            int high_2019) {

        if (low_2019 < high_2019) {

            int pi_2019 =
                    partition_2019(
                            arr_2019,
                            low_2019,
                            high_2019);

            quickSort_2019(
                    arr_2019,
                    low_2019,
                    pi_2019 - 1);

            quickSort_2019(
                    arr_2019,
                    pi_2019 + 1,
                    high_2019);
        }
    }

    // MERGE SORT (JUDUL)

    public void merge_2019(
            Lagu_2019[] arr_2019,
            int left_2019,
            int mid_2019,
            int right_2019) {

        int n1_2019 =
                mid_2019 - left_2019 + 1;

        int n2_2019 =
                right_2019 - mid_2019;

        Lagu_2019[] L_2019 =
                new Lagu_2019[n1_2019];

        Lagu_2019[] R_2019 =
                new Lagu_2019[n2_2019];

        for (int i_2019 = 0;
             i_2019 < n1_2019;
             i_2019++) {

            L_2019[i_2019] =
                    arr_2019[left_2019+i_2019];
        }

        for (int j_2019 = 0;
             j_2019 < n2_2019;
             j_2019++) {

            R_2019[j_2019] =
                    arr_2019[mid_2019+1+j_2019];
        }

        int i_2019 = 0;
        int j_2019 = 0;
        int k_2019 = left_2019;

        while (i_2019 < n1_2019
                && j_2019 < n2_2019) {

            if (L_2019[i_2019]
                    .judul_2019
                    .compareToIgnoreCase(
                            R_2019[j_2019]
                                    .judul_2019)
                    <= 0) {

                arr_2019[k_2019++] =
                        L_2019[i_2019++];
            }

            else {

                arr_2019[k_2019++] =
                        R_2019[j_2019++];
            }
        }

        while (i_2019 < n1_2019) {
            arr_2019[k_2019++] =
                    L_2019[i_2019++];
        }

        while (j_2019 < n2_2019) {
            arr_2019[k_2019++] =
                    R_2019[j_2019++];
        }
    }

    public void mergeSort_2019(
            Lagu_2019[] arr_2019,
            int left_2019,
            int right_2019) {

        if (left_2019 < right_2019) {

            int mid_2019 =
                    (left_2019 + right_2019) / 2;

            mergeSort_2019(
                    arr_2019,
                    left_2019,
                    mid_2019);

            mergeSort_2019(
                    arr_2019,
                    mid_2019 + 1,
                    right_2019);

            merge_2019(
                    arr_2019,
                    left_2019,
                    mid_2019,
                    right_2019);
        }
    }

    public static void main(String[] args) {

        Scanner input_2019 =
                new Scanner(System.in);

        Sorting_2511532019 obj_2019 =
                new Sorting_2511532019();

        obj_2019.inputData_2019();

        int pilih_2019;

        do {

            System.out.println();
            System.out.println(
                    "=== Sorting Playlist NIM: 2511532019 ===");
            System.out.print(
                    "(1= Shell Sort, ");
            System.out.print(
                    "2= Quick Sort, ");
            System.out.print(
                    "3= Merge Sort, ");
            System.out.println(
                    "0= Keluar)");

            System.out.println(
                    "Pilih Algoritma : ");

            pilih_2019 =
                    input_2019.nextInt();

            Lagu_2019[] temp_2019 =
                    obj_2019.copyArray_2019();

            if (pilih_2019 == 1) {

                System.out.println(
                        "\nData Sebelum Sorting:");
                obj_2019.tampilData_2019();

                obj_2019.shellSort_2019(
                        temp_2019);

                System.out.println(
                        "\nData Setelah Shell Sort:");

                for (int i_2019=0;
                     i_2019<temp_2019.length;
                     i_2019++) {

                    System.out.println(
                            (i_2019+1)+". "
                                    +temp_2019[i_2019]
                                    .judul_2019
                                    +" - "
                                    +temp_2019[i_2019]
                                    .durasi_2019
                                    +" detik");
                }
            }

            else if (pilih_2019 == 2) {

                System.out.println(
                        "\nData Sebelum Sorting:");
                obj_2019.tampilData_2019();

                obj_2019.quickSort_2019(
                        temp_2019,
                        0,
                        temp_2019.length-1);

                System.out.println(
                        "\nData Setelah Quick Sort (Durasi Asc):");

                for (int i_2019=0;
                     i_2019<temp_2019.length;
                     i_2019++) {

                    System.out.println(
                            (i_2019+1)+". "
                                    +temp_2019[i_2019]
                                    .judul_2019
                                    +" - "
                                    +temp_2019[i_2019]
                                    .durasi_2019
                                    +" detik");
                }
            }

            else if (pilih_2019 == 3) {

                System.out.println(
                        "\nData Sebelum Sorting:");
                obj_2019.tampilData_2019();

                obj_2019.mergeSort_2019(
                        temp_2019,
                        0,
                        temp_2019.length-1);

                System.out.println(
                        "\nData Setelah Merge Sort:");

                for (int i_2019=0;
                     i_2019<temp_2019.length;
                     i_2019++) {

                    System.out.println(
                            (i_2019+1)+". "
                                    +temp_2019[i_2019]
                                    .judul_2019
                                    +" - "
                                    +temp_2019[i_2019]
                                    .durasi_2019
                                    +" detik");
                }
            }

        } while (pilih_2019 != 0);

        System.out.println(
                "\nProgram selesai.");

        input_2019.close();
    }
}

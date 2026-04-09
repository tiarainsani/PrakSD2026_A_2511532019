package Pekan3_2511532019;

import java.util.ArrayList;
class Siswa_2019{
	String nama_2019;
	int nim_2019;
	
	public Siswa_2019 (String nama_2019, int nim_2019) {
		this.nama_2019=nama_2019;
		this.nim_2019=nim_2019;
	}
	@Override
	public String toString() {
		return "Nim : "+nim_2019+", nama: " +nama_2019;
	}
}

public class SiswaStack_2511532019 {
	private ArrayList<Siswa_2019>stack_2019;
	public SiswaStack_2511532019() {
		stack_2019 = new ArrayList<>();
	}
	public void push_2019 (Siswa_2019 mhs) {
		stack_2019.add(mhs);
	}
	
	public Siswa_2019 pop_2019() {
		if (!isEmpty()) {
			return stack_2019.remove(stack_2019.size()-1);
		}
		return null;
	}
	
	public Siswa_2019 peek_2019() {
		if(!isEmpty()) {
			return stack_2019.get(stack_2019.size()-1);
		}
		return null;
	}
	public boolean isEmpty() {
		return stack_2019.isEmpty();
	}
	public void tampilkanSiswa() {
		for (int i=stack_2019.size()-1;i>=0;i--) {
			System.out.println(stack_2019.get (i));
		}
	}
	public static void main (String[] args) {
		SiswaStack_2511532019 studentStack_2019=new SiswaStack_2511532019();
		Siswa_2019 mhs1=new Siswa_2019 ("Ali", 1);
		Siswa_2019 mhs2=new Siswa_2019 ("Boby",2);
		Siswa_2019 mhs3=new Siswa_2019 ("Charles",3);
		studentStack_2019.push_2019 (mhs1);
		studentStack_2019.push_2019(mhs2);
		studentStack_2019.push_2019(mhs3);
		System.out.println("Siswa di dalam stack:");
		studentStack_2019.tampilkanSiswa();
		System.out.println("siswa teratas "+studentStack_2019.peek_2019());
		System.out.println("mengeluarkan siswa teratas dari stack: "+studentStack_2019.pop_2019());
		System.out.println("daftar siswa setelah di pop :");
		studentStack_2019.tampilkanSiswa();
	}

}


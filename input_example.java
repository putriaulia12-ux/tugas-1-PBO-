package tugas.sesi.pkg1.java;

import java.util.Scanner;

public class input_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Membuat Objek dari Class Scanner
        String nama; //Variabel String, Untuk Menyimpan Input dari User
        System.out.print("belajar java : ");
        nama = input.nextLine(); //Mendapatkan Input dari User
        System.out.println("belajar java "); //Mencetak Output
    }
}
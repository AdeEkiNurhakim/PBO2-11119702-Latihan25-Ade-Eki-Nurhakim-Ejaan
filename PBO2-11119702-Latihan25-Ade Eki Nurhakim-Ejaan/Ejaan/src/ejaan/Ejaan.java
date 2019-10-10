/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaan;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class Ejaan {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int i;
        char word[];
       Scanner input = new Scanner(System.in);
       String nama;
       System.out.print("Masukkan Nama depan anda untuk di eja : ");
       nama = input.nextLine();
       for(i=0; i<word.length(); i++);
        System.out.println("Ejaan Untuk : "+ nama.substring(i, i+1));
       }
    }
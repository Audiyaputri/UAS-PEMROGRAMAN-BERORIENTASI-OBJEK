 * @author NICHOLA, RINI, AUDIYA
 */

package pajak;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       try(Scanner input = new Scanner(System.in)){
           System.out.println("Masukkan Vendor: " );
           String vendor = input.nextLine();
           
           System.out.println("Masukkan Type: "); {
           String tipe = input.nextLine();
           
           System.out.println("Masukkan Harga: "); {
           double harga = input.nextDouble();
           
           Pajak barang = new Pajak(vendor, tipe, harga);
           barang.tampilkanInfo();       
           
        }
    }
    }
    }
}

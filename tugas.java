
package pertemuan3;

/**
 *
 * @author Ririn
 * tgl = 2024-04-01
 */
import java.util.Scanner;
public class tugas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nilai alas segitiga: ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        
                double luas = (alas * tinggi) / 2;
                
                System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
                
        scanner.close();
    }
    
}

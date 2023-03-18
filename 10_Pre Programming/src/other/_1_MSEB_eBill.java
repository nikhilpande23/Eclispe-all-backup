package other;
import java.util.Scanner;

public class _1_MSEB_eBill {
	
	public static void main(String[] args) {
		
	
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit to see eBill");
		int units=sc.nextInt();
		int Sthir_aakar=105;
		double Veej_aakar = 0.0;
		double Vahan_aakar = 1.35 * units;
		double E_S_aakar = 0;
		
		
		if (units>100) {
			//va2 caln
			int above100unit = units-100;
			double rateofabove100unit = 7.34 * above100unit;
			double fisrt100units = units - above100unit;
			double rateofFisrt100units=3.36 * 100;
			
			//esa4 caln
			int above100unitesa4 = units-100;
			double rateofabove100unitesa4 = 1.450 * above100unit;
			double fisrt100unitsesa4 = units - above100unitesa4;
			double rateofFisrt100unitsesa4=0.650 * 100;
			
			double withoutTaxBill=Sthir_aakar+rateofabove100unit+rateofFisrt100units+Vahan_aakar+rateofabove100unitesa4+rateofFisrt100unitsesa4;
			double tax=withoutTaxBill * 16/100;
			double FinalBill=withoutTaxBill + tax;
			
			
			System.out.println("Sthir_aakar= "+Sthir_aakar);
			System.out.println("Veej_aakar= "+(rateofabove100unit+rateofFisrt100units));
			System.out.println("Vahan_aakar= @1.35 Rs/u "+Vahan_aakar);
			System.out.println("E_S_aakar= "+(rateofabove100unitesa4+rateofFisrt100unitsesa4));
			System.out.println("Veej shulk 16%= "+tax);
			System.out.println("------------------------------------------");
			System.out.println("Total Bill Rs = "+FinalBill);
			System.out.println("------------------------------------------");
		
		}
		else if (units <= 100) {
			//va2 caln
			Veej_aakar = units * 3.36;
			E_S_aakar = units * 0.650;
			
			double semifinalbill=Sthir_aakar+Veej_aakar+Vahan_aakar+E_S_aakar;
			double tax=semifinalbill * 16/100;
			double FinalBill=semifinalbill + tax;
			
			System.out.println("Sthir_aakar= "+Sthir_aakar);
			System.out.println("Veej_aakar= "+Veej_aakar);
			System.out.println("Vahan_aakar= @1.35 Rs/u "+Vahan_aakar);
			System.out.println("E_S_aakar= "+E_S_aakar);
			System.out.println("Veej shulk 16%= "+tax);
			System.out.println("------------------------------------------");
			System.out.println("Total Bill Rs = "+FinalBill);
			System.out.println("------------------------------------------");
			
			
		}
	
	}

}

package other;
import java.util.Scanner;

public class E_Bill {
	public void eBill() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit to see eBill");
		int units=sc.nextInt();
		int sa1=105;
		double va2 = 0.0;
		double va3 = 1.35 * units;
		double esa4 = 0;
		
		
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
			
			double withoutTaxBill=sa1+rateofabove100unit+rateofFisrt100units+va3+rateofabove100unitesa4+rateofFisrt100unitsesa4;
			double FinalBill=withoutTaxBill * 16/100;
			
			System.out.println("Units :"+units+" "+"Bill amount "+" "+FinalBill);
		
		}
		else if (units <= 100) {
			//va2 caln
			va2 = units * 3.36;
			esa4 = units * 0.650;
		}
	}


}

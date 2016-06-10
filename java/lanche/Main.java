import java.util.Scanner;
public class Main{
	public static final double CQ = 4.00;
	public static final double XS = 4.50;
	public static final double XB = 5.00;
	public static final double TS = 2.00;
	public static final double REF = 1.50;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double total=0;
		cod = scan.nextInt();
		qtd = scan.nextInt();

		if(cod==1){
			total = CQ*qtd;
		}
		else if(cod==2)	{
			total = XS*qtd;
		}
		else if(cod==3){
			total = XB*qtd;
		}
		else if(cod==4){
			total = TS*qtd;
		}
		else if(cod==5){
			total = REF*qtd;
		}

		System.out.printf("Total: R$ %.2f\n",total);

	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		int nota100 = 0, nota50=0, nota20=0, nota10=0, nota5=0, nota2=0, moeda1=0; 
		double moeda50=0, moeda25=0, moeda10=0,moeda5=0, moeda01=0;
		valor = scan.nextDouble();
		nota100 = (int)valor/100;
		nota50 = ((int)valor-nota100*100)/50;
		nota20 = ((int)valor-(nota100*100)-(nota50*50))/20;
		nota10 = ((int)valor-(nota100*100)-(nota50*50)-(nota20*20))/10;
		nota5 = ((int)valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10))/5;
		nota2 = ((int)valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5))/2;

		//calculo das moedas

		moeda1 = ((int)valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5)-(nota2*2));
		moeda50 = (valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5)-(nota2*2)-(moeda1));
		moeda25 = (valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5)-(nota2*2)-(moeda1)-(moeda50*0.50))/0.25;
		moeda10 = (valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5)-(nota2*2)-(moeda1)-(moeda50*0.50)-(moeda25*0.25))/0.10;
		


		System.out.printf("%d\n",nota100);
		System.out.printf("%d\n",nota50);
		System.out.printf("%d\n",nota20);
		System.out.printf("%d\n",nota10);
		System.out.printf("%d\n",nota5);
		System.out.printf("%d\n",nota2);
		System.out.printf("%d\n",moeda1);
		System.out.printf("%.0f\n",moeda50);
		System.out.printf("%f\n",moeda25);
		System.out.printf("%f\n",moeda10);


	}
}
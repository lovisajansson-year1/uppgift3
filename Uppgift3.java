package uppgift3;
import java.util.Scanner;
public class Uppgift3 {

	
	public static void main(String[] args) {
		
		Scanner upg3 = new Scanner(System.in);
		int tal;
		int [] lista = new int [5]; // skapar array med 5 index
		int i;
		int sum=0;
		int max=0; //initialiserar för att kunna använda
		
		for(i = 0; i < lista.length;i++) {
			System.out.println("skriv in tal " + (i+1) );
			tal = upg3.nextInt();
			lista[i] = tal; // tal läggs i array, index 0 till 4
			
				if (tal > max) {
					max=tal; //anger nytt värde på max, uppstår ett högre värde än föregående max ersätts det
				}
				
		}
		
		for(i=0; i< lista.length; i++) { 
			sum = sum + lista[i]; //adderar värden i array på varandra och skapar summa
		}	
		int average = (sum / lista.length); //beräknar medelvärde
		
		System.out.println("summan av talen är " + sum);
		System.out.println("medelvärdet av talen är " + average);
		System.out.println("största talet är " + max);
	}
	
}

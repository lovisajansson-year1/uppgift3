package uppgift3;
import java.util.Scanner;
public class Uppgift3 {

	
	public static void main(String[] args) {
		//läs in 5 tal, skriv ut summan, medelvärdet samt största talet
		Scanner upg3 = new Scanner(System.in);
		int nmbr;
		int [] array = new int [5]; // skapar array med 5 index
		int i;
		int sum=0;
		int max=0; //initialiserar för att kunna använda i loopen
		
		for(i = 0; i < array.length;i++) { //upprepas för hur många index som finns i array
			System.out.println("skriv in tal " + (i+1) );
			nmbr = upg3.nextInt();
			array[i] = nmbr; // nmbr läggs i array, index 0 till 4
			
				if (nmbr > max) {
					max=nmbr; //anger nytt värde på max om nmbr är större än max
				}
				
		}
		
		for(i=0; i< array.length; i++) { 
			sum += array[i]; //adderar värden i array på varandra och skapar summa
		}
		
		int average = (sum / array.length); //beräknar medelvärde
		
		System.out.println("summan av talen är " + sum);
		System.out.println("medelvärdet av talen är " + average);
		System.out.println("största talet är " + max);
		
		upg3.close();
	}
	
}

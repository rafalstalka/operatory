
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);//najpierw dodajemy 1 do a co daje od razu wyświetlenie 2
		System.out.println(a++);//wyświetli się liczba 2, po wykonaniu kodu zwiekszy się o 1
		System.out.println(a);// z poprzedniej lini wyświetli się liczba 3 jako aktualna
		b=a++;
		System.out.println(b);//wyświetli się liczba 3
		b=++a;
		System.out.println(++a);//wyświetli się liczba 6
	}

}

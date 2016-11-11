package laur.Emil;

public class Main {
	public static void main(String[] args){
		String[] nume = new String[]{"Emil", "Ion", "Gheorghe", "Catalin"};
		
		for(int i = 0; i < nume.length; i++){
			System.out.println(nume[i]);
		}
		
		String aux;
		aux = nume[0];
		nume[0] = nume[1];
		nume[1] = aux;
		
		System.out.println("-----");
		
		for(int i = 0; i < nume.length; i++){
			System.out.println(nume[i]);
		}
	}
}

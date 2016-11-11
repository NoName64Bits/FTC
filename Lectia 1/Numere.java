package laur.Emil;

public class Numere {
	public static void main(String[] args){
		int[] numere = new int[]{7, 14, 21, 35, 2, 8, 12, 0, 9, 4};
		//afisare(numere);
		sortare(numere);
	}
	
	public static void afisare(int[] num){
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println("");		
	}
	
	public static void sortare(int[] num){
		for(int i = 0; i < num.length - 1; i ++){
			for(int j = i + 1; j < num.length; j++){
				if(num[i] > num[j]){
					int aux  = num[i];
					num[i] = num[j];
					num[j] = aux;
				}
			}
			afisare(num);
		}
	}
}

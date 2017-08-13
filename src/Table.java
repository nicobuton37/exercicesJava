
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		while(number <= 10){
			System.out.println("Table " + number + " : ");
			for (int i = 1; i <= 10; ++i){
				System.out.println(i + " * " + number + " = " + i * number);
			}
			
			++number;
			System.out.println("");
		}
		
		
	

	}

}

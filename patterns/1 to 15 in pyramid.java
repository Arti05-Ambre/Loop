package loop;

public class abc {

	public static void main(String[] args) {
		int n =5;
		int number=1;
		
	
		for (int i=1; i<=n; i++){
			for (int j=1; j<=i; j++){
					
					System.out.print(number);
					number++;
				}
			System.out.println();
		}

	}

}


output
  1
  23
  456
  78910
  1112131415


public class patteren_3 {

	public static void main(String[] args) {
		for(int i=8;i>=4;i--){
			
			for(int j=8;j>=i;j--){
				
				System.out.print(" ");
			}
			
			for(int k=i-1;k>=4;k--){
				
			System.out.print(k);
				
			}
			
			
			for (int l=1;l<=4;l++){
				for (int m=4;m>=l;m--){
					System.out.print(m);
				}
				
			}
				
			
			System.out.println();
	}

	}
	
}


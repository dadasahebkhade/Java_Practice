
public class highest2 {
	
public static void main(String[] args){
		
		
	
	int a [] ={100,55};
	int largest,smallest;
	
	
	
	if (a[0]>a[1]) {
		largest=a[0];
		smallest=a[1];
	}
	else {
		smallest=a[0];
		largest=a[1];
	}
	
	for (int i=2;i<a.length;i++){
		if(a[i]>largest ){
			largest=a[i];
		}
		else{
			if(a[i]<smallest){ 
			smallest=a[0];
			}
		}
	}
		
	System.out.println("largest no is--> "+largest);
	
	System.out.println("smallest no is --> "+smallest);
	
	

}
}

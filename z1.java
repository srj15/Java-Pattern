
public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdfghj";int k=0,m=s.length()-1;
		for(int i=0;i<s.length()/2+1;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			System.out.print(s.charAt(i));
			/*for(k=i;k<s.length();k++){
				System.out.print(" ");
			}*/
			for(int l=i;l<m;l++){
				System.out.print(" ");
				m=m-i;
				
			}
		//	m=s.length()-1;
			if(i!=s.length()/2)
			System.out.println(s.charAt((s.length()-1)-i));
			//m=m--;
			
		}
		System.out.println();
		for(int i=s.length()/2-1;i>=0;i--){
			for(int j=i;j>=0;j--){
				if(j==0){}
				else
				System.out.print(" ");
			}
			System.out.print(s.charAt(i)+" ");
			/*for(k=i;k<s.length();k++){
				System.out.print(" ");
			}*/if(i==0){
				for(int l=m+2;l>=i;l--){
					System.out.print(" ");
					m=m+i;
					
				}
			}
			else{
			for(int l=m;l>=i;l--){
				System.out.print("  ");
				m=m+i;
			}
			}
		//	m=s.length()-1;
			//if(i!=s.length()/2)
			System.out.println(s.charAt((s.length()-1)-i));
			//m=m--;
			
		}
	}

}

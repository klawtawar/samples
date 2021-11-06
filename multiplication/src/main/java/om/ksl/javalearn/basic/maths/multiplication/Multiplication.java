package om.ksl.javalearn.basic.maths.multiplication;

public class Multiplication {
	
	public String display(long num, int totalStringLen) {
				
		String numString = Long.toString(num);

		int countSpace = (totalStringLen - numString.length())*2;

		String displayNum = "";

		long[] numStringArray = new long[numString.length()];
		String addSpace = "";

		for(int i=0; i<numString.length(); i++){
				
			numStringArray[i] = numString.charAt(i) - '0';
			addSpace = addSpace + numStringArray[i] + " ";	
		}

		for(int j=0; j<countSpace; j++){
			
			displayNum = displayNum + " ";
		}

		displayNum = displayNum + addSpace;
		return displayNum;
		
	}
	
	public String display(int rownum, int countnum1, int countnum2) {

		String addspace = "";
		String displayNum = " ";
		int odd = 1;
		if((countnum2+countnum2)%2==0){
			odd=2;
		}
		
		int countSpace=(countnum2-rownum-odd)*2;

		for(int i=1; i<=countSpace; i++){
			
			addspace = addspace + " ";	
		}
		for(int j=0; j<countnum1 + rownum; j++){
			
			displayNum = displayNum + " 0";
		}
		return addspace + displayNum;
		
	}

	public static void main(String[] args) {
		Multiplication mm = new Multiplication();
		long num1 = 12345008;	
		long num2 = 1234508;

		long total =  num1 * num2;
						
		String totalstring = Long.toString(total);
		String num1string = Integer.toString((int) num1);

		String num2string = Integer.toString((int) num2);
		
		int[] numarr2 = new int[num2string.length()];
		
		long[] rows = new long[num2string.length()];
			
		for(int i = num2string.length()-1; i >= 0;  --i) {
				
			  numarr2[i] = num2string.charAt(i) - '0';
			  
			  int count =  num2string.length() -1 - i ;
			  int tenMultiples = (int) Math.pow(10, count);

			  long product = num1 * numarr2[i] * tenMultiples;  
			  rows[count] = product;
			  
			}


		int totalrows = num2string.length() + 5;
		int totalStringLen = totalstring.length();
			
		for(int j=0; j<=totalrows; j++) {

	
			if(j==0)
				System.out.println(mm.display(num1,totalStringLen)); 
			
			if(j==1)
				System.out.println(mm.display(num2,totalStringLen)); 
				
			if(j==2)
				System.out.println("----------------------------------------------");
				
			if(j>2 && j<totalrows-2) {

				if(rows[j-3] == 0) {
					System.out.println(mm.display(j-3, num1string.length(), num2string.length())); 
				}
				
				if(rows[j-3] != 0)
			    System.out.println(mm.display(rows[j-3],totalStringLen)); 
			}
			
			if(j==totalrows-2 )
				System.out.println("---------------------------------------------");
			
			if(j==totalrows-1 )
				System.out.println(mm.display(total,totalStringLen)); 
		}	
		
		
		
	}

}

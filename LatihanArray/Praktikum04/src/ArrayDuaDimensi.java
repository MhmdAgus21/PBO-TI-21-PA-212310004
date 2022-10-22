public class ArrayDuaDimensi {

	public static void main(String[] args) { 
	
		int npm[][] = {
				{
				212310001,
				212310002,
				212310003,
				212310004,
				212310005
		},
		{
			212310001,
			212310002,
			212310003,
			212310004,
			212310005
		}
		
	};
	System.out.println(npm[0][4]);
	for(int i = 0; i < npm.length; i++) {
		System.out.println(npm[i][i]);
  }
 }
}
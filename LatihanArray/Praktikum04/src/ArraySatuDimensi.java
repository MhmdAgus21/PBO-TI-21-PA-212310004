public class ArraySatuDimensi {

	public static void main(String[]args) {
		int[] npm= {
				212310001,
				212310002,
				212310003,
				212310004,
				212310005
		};
		
		System.out.println(npm[1]);
		
		for(int i= 0; i< 5; i++) {
			System.out.println("Data ke-"+ i + " "+npm[i]);
		}
		String nama[] = {
				"Ayow",
				"Agus",
				"kent",
				"kons",
				"kins"
		};
		System.out.println("Nama pertama adalah"+ nama[0]);
		
		for (int i = 0; i < nama.length; i++) {
			System.out.println("Nama ke-"+ i +" adalah " + nama[i]);
			
		}
	}
}
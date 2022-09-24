public class Latihan07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama = "Muhamad Agus Setiawan";
		
		nama = nama.replaceAll("[a,i,u,e,o]", "X");
		
		System.out.println("Muhamad Agus Setiawan ==> " + nama);
	}

}
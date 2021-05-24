import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public Main(){
		int panjang = 0;
		int lebar = 0;
		System.out.println("Panjang : ");
		panjang = scan.nextInt();
//		super.getClass()
		System.out.println("Lebar : ");
		lebar = scan.nextInt();
		Properti p = new Properti();
		p.setPanjang((int) panjang);
		p.setLebar((int) lebar);
		System.out.println("Harga Jual Tanah " + p.getPanjang() + " * " + p.getLebar() + " Adalah " + p.getHargaJual());
		//p.displayData();
		System.out.println();
	}
	public static void main(String[] args) {
		new Main();
	}
		// TODO Auto-generated method stub
}

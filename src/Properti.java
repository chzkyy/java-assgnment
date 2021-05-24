public class Properti extends BidangTanah implements Transaksi{
	@Override
	public int getHargaJual() {
		 return (int) (harga_per_meter_persegi * getLuas());
	}
	@Override
	public Integer getLuas() {
		return (int)(getPanjang()*getLebar());
	}
	@Override
	public Integer getKeliling() {
		return 0;
	}
//	public void displayData(){
//		displayBidangTanah();
//		System.out.println("Harga Jual Tanah " + getPanjang() + " * " + getLebar() + " Adalah " + getHargaJual());
//	}
}
public abstract class BidangTanah{
	private Integer panjang;
	private Integer lebar;
	
	void setPanjang(Integer panjang){
		this.panjang = panjang;
	}
	Integer getPanjang(){
		return this.panjang;
	}
	void setLebar(Integer lebar){
		this.lebar = lebar;
	}
	Integer getLebar(){
		return this.lebar;
	}
	public void displayBidangTanah(){
		System.out.println("Panjang : " + getPanjang());
		System.out.println("Lebar   : " + getLebar());
	}
	abstract Integer getLuas();
	abstract Integer getKeliling();
}
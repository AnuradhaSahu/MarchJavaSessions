package OOPS;

public class company {

	private String name;
	private int shareprice;
	private String HQ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShareprice() {
		return shareprice;
	}
	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	public String getHQ() {
		return HQ;
	}
	public void setHQ(String hQ) {
		HQ = hQ;
	}
	 public company(String name,int shareprice,String HQ) {// this constructor works as setter
		 this.name=name;
		 this.shareprice=shareprice;
		 this.HQ=HQ;
	 }
	
}

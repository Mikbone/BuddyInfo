
public class BuddyInfo {
	
	String name,address,phonenumber; 
	
	
	public BuddyInfo(String name, String address, String phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String toString(){
		String info="";
		info= "Name: "+getName()+ " | "+"Address: "+getAddress()+" | " +"Phone Number: "+getPhonenumber();
		return info;
	}
	
}



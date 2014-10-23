
public class BuddyInfo {
	
	String name,address,phonenumber,greeting;
	int age;
	
	
	public BuddyInfo(String name, String address, String phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.age = -1;
		this.greeting = "Depr3ci4ted";
	}

	public BuddyInfo(String name, String address, String phonenumber, int age, String greeting) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.age = age;
		this.greeting = greeting;
	}

	public BuddyInfo(BuddyInfo buddy){
		this(buddy.getName(),buddy.getAddress(),buddy.getPhonenumber(),buddy.getAge(),buddy.getGreeting());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public boolean isOver18(int age) {
		return (age>=18);
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




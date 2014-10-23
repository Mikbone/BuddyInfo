import java.util.ArrayList;
public class AddressBook {
	private ArrayList<BuddyInfo> addressbook;
	String name;

	public AddressBook(String name){
		this.name=name;
		addressbook= new ArrayList<BuddyInfo>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addBuddy(BuddyInfo buddy){
		addressbook.add(buddy);
	}
	public void editBuddy(BuddyInfo buddy, String name, String address, String number)
	{
		buddy.setName(name);
		buddy.setAddress(address);
		buddy.setPhonenumber(number);
	}
	public void removeBuddy(BuddyInfo buddy){
		addressbook.remove(buddy);
	}
	
	public String toString(){
		String b= ("Address Book Name: " +name+"\r\nBuddies:\r\n");
		for(BuddyInfo buddy:addressbook){
			b+= buddy.toString() + "\r\n";
		}
		
		return b;
	}
	
	public int size(){
		return addressbook.size();
			
	}
	
	public void clear(){
		addressbook.clear();
	}
}

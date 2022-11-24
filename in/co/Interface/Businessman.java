package in.co.Interface;

public class Businessman implements Richman, SocialWorker {

	private String name;
	private String address;

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

	@Override
	public void helpToOther() {
		// TODO Auto-generated method stub

	}

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean donate() {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public void party() {
		// TODO Auto-generated method stub

	}
}

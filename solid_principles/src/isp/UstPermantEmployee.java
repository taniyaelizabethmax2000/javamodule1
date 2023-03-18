package isp;

public class UstPermantEmployee implements BasicDetails, PfDetails {

	@Override
	public void updateBasicDetails() {
		// TODO Auto-generated method stub
		System.out.println("Updated Basic Details");

	}
	@Override
	public void updatePfDetails() {
		System.out.println("Updated Pf Details");
	}

}

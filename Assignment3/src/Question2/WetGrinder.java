package Question2;

public  class WetGrinder extends Grinder{
	 public void WetGrinder()
	{
		System.out.println("Class WetGrinder");
	}
	public void grinding_tech()
	{
		System.out.println("Grinding Technology-WetGrinder");
	}


public static void main(String args[])
{
	WetGrinder wt=new WetGrinder();
	wt.deviceType();
	wt.grinding_tech();
}
@Override
void Grinder() {
	// TODO Auto-generated method stub
	
}
@Override
void category() {
	// TODO Auto-generated method stub
	
}
@Override
void Electronics() {
	// TODO Auto-generated method stub
	
}
@Override
void deviceType() {
	// TODO Auto-generated method stub
	
}
}

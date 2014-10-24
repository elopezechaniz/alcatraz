package org.rlanza.alcatraz;


public class Hallway extends Room{

	public Hallway(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void printRemovedInmate(Inmate inmate) {
		// TODO Auto-generated method stub
		System.out.println("inmate "+ inmate.getNumber()+" has been removed from hallway "+ getCode());
		
	}
	
	@Override
	protected void printAddedDoor(String code) {
		// TODO Auto-generated method stub
		System.out.println("Door "+ code 
				+" has been added to Hallway "+ getCode());
		
	}
	
	/*public ArrayList<Inmate> getInmateslala(){
		ArrayList<Inmate> temp = super.getInmates();  
		for (int i=0; i<3; i++)
			
	}*/
	

}

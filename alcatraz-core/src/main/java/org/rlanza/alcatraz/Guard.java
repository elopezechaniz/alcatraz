package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Guard {
	private Hallway _hallway;
	private ArrayList<Inmate> _inmates;
	private String _code;
	
	
	public Guard (String code){
		_code = code;
	}

	public Hallway getPlace() {
		return _hallway;
	}

	public void setPlace(Hallway hallway) {
		_hallway = hallway;
	}

	public void beginwatch() {
		// TODO Auto-generated method stub
		System.out.println("Guard " + getCode() + " began watch");
		_inmates = _hallway.getInmates();
		for (int i = 0; i < _inmates.size(); i++) {
			System.out.println("Inmate number " + _inmates.get(i).getNumber() + " has been shot");
			_inmates.get(i).getPlace().getDoors().get(i).setLock(true); //Show this works!!!
			if (_inmates.get(i).getPlace().getDoors().get(i).getStatus() == true){
				System.out.println("Cell door " + _inmates.get(i).getPlace().getDoors().get(i).hashCode() +  " has been locked");
			}
			if (_inmates.get(i).shoot() == true) {
				System.out.println("The Inmate number " + _inmates.get(i).getNumber() + " has been killed");
			}
				else{
					if (_inmates.get(i).shoot() == false){
					System.out.println("The inmate number " + _inmates.get(i).getNumber() + " survived");
					}
				}
			}

		
		

		
		//mainGate.setLock();
	 
		System.out.println("Cell doors and maingate closed");

	}

	public String getCode() {
		// TODO Auto-generated method stub
		return _code;
	}

}

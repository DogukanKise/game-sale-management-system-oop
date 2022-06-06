package Concrete;

import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" added to the system");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" deleted to the system");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" updated to the system");
		
	}

	@Override
	public boolean ifRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+"is a real person");
		return true;
	}

}

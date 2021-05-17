
public class SaleManager implements SaleService {
	
	@Override
	public void add(Gamer gamer, Game game, Company company) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLasttName() +" "+company.getCompanyName()+" sirketinden "+game.getName()+" aldi.");
	}
	
	
	
}

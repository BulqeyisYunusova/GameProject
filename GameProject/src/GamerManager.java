
public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLasttName() + " sisteme elave olundu.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLasttName() + " silindi.");
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLasttName() + " guncellendi.");
	}

}

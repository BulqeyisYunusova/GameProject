
public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer();
		gamer.setFirstName("Aynur");
		gamer.setBirthYear("1989");
		gamer.setLastName("Niftelifeva");
		gamer.setId(1);
		gamer.setNationalId("222333");
		Company company=new Company();
		company.setId(1);
		company.setCompanyName("Foxngame");
		Game game=new Game();
		game.setId(1);
		game.setName("Puzzle Combat");
		game.setUnitPrice(36.7);
		SaleService saleService=new SaleManager();
		saleService.add(gamer, game, company);
	}

}

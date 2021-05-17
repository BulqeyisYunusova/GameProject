
public class CompanyManager  implements CompanyService{
	@Override
	public void add(Company company) {
		System.out.println(company.getCompanyName()+" sisteme elave olundu.");
	}

	@Override
	public void delete(Company company) {
		System.out.println(company.getCompanyName()+" silindi.");
	}

	@Override
	public void update(Company company) {
		System.out.println(company.getCompanyName()+" guncellendi.");
	}

	


}

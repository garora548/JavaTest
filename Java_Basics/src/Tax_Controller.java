
public class Tax_Controller {

	public static void main(String[] args) {


		Tax tax =  new Tax();
		tax.SetSalary(-12000);
		float result = tax.taxCalculation();

		if(result<0)

			System.out.println("Salary must be in positive");

		else {
			System.out.println("Please pay this tax" +result);
		}

	}
}

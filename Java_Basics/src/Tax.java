
public class Tax {
	
	private int sal;
	
	public void SetSalary(int salary)
	{
		this.sal = salary;
	}
	

	float taxCalculation()
	{

		float tax = 0;

		if(sal>0) {


			if(sal<1000) {

				tax = sal/5;

			}

			else if(sal>=1000 && sal<3000) {
				tax = sal/10;
			}

			else if(sal>=3000 && sal<5000) {

				tax = sal/15;
			}

			else {

				tax = sal/30;

			}
		}

		else {

			tax = -1;

		}
		return tax;

	}

}




public class SBI extends Bank{


	int wamt;
	int deptamt;

 
	void calInt() {

		interest = bal*12*bal*.75f;


	}

	void addMoney(int amt) {

		if(amt > 5000) {

			System.out.println("Please provide PAN");

			bal = bal+amt;

		}
		else {
			bal = bal+amt;
		}

	}

	void withDraw(int wa) {

		if(bal >wa) {

			bal = bal-wa;
		}
		else {
			System.out.println("insufficient balance");
		}
	}
}

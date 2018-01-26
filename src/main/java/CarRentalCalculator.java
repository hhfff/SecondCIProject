
public class CarRentalCalculator {

	public static double carRental(String carModel, int duration, boolean firstTimer, boolean member){
		
		double rentalFees = 0.0;
				
		if (firstTimer){
			if (carModel.equals("Honda"))
				rentalFees = 65.0*duration*0.95;
			else
				rentalFees = 80.0*duration*0.95;
		}
		else {
			
			if (member){
				//handle member transactions
				// ...
				double afterDisc=0;
				if(duration<=3) afterDisc=0.9;
				else afterDisc=0.8;
				
				if(carModel.equals("Honda"))rentalFees = 65.0*duration*afterDisc;
				else rentalFees = 80.0*duration*afterDisc;
			}
			else { //non-member
				
				//handle non-member transactions
				//...
				if(carModel.equals("Honda"))rentalFees = 65.0*duration;
				else rentalFees = 80.0*duration;
				
			}
		}
		
		return rentalFees;
	}
	

}

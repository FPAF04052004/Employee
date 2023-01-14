package Entities;

public class OutsourceEmployee extends Employee {
	
    private Double aditionalCharge;
	
	public OutsourceEmployee(String name, Integer hour, Double valuePerHour,Double aditionalCharge) {
		super(name, hour, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}
	
	public Double getAaditionalCharge() {
		return aditionalCharge;
	}

	public void setAaditionalCharge(Double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}

    @Override
    public double Payment() {
		
		return super.Payment() + 1.1 * aditionalCharge;
	}
    
}

package com.sathya.Springex;

public class Car implements Vehicle
{
    private String FuelType;
    private int maxspeed;
	
	public String getFuelType() {
		return FuelType;
	}

    public void setFuelType(String fuelType) {
		this.FuelType = fuelType;
	}
    public int getMaxspeed() {
		return maxspeed;
	}

   public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

    @Override
	public void move() {
		System.out.println("your selected Car veicle");
		System.out.println("max speed...."+maxspeed);
		System.out.println("Fuel type...."+FuelType);
	}

}

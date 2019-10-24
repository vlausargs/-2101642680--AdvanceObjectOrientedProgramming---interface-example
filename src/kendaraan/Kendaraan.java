package kendaraan;

import mesin.Mesin;

public abstract class Kendaraan {
	protected float kecepatan;

	protected Mesin jenisMesin;
	
	public abstract void bergerak();
	
	public Kendaraan( float kecepatan, Mesin jenisMesin) {
		this.kecepatan = kecepatan;

		this.jenisMesin = jenisMesin;
	}


	
	
}

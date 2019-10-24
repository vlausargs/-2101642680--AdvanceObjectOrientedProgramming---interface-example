package kendaraan;

import mesin.*;

public class Mobil extends Kendaraan{
	
	protected int pintu;
	protected int roda ;

	public Mobil(int roda, float kecepatan) {
		super( kecepatan, new SilinderTunggal());
		this.roda = roda;
	}

	public int getPintu() {
		return pintu;
	}

	public void setPintu(int pintu) {
		this.pintu = pintu;
	}
	
	@Override
	public void bergerak() {
		System.out.println("mobil ini bergerak dengan " + kecepatan+" km/h");
	}
	
	
	
	
}

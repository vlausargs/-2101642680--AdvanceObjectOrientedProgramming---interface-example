package kendaraan;


public class MobilBalap extends Mobil implements RacerMove{

	public MobilBalap(int pintu,int roda, float kecepatan) {
		super(roda, kecepatan);
		this.pintu = pintu;
	}
	@Override
	public void specialMove() {
		System.out.println("Perfect Drift");
	}

}

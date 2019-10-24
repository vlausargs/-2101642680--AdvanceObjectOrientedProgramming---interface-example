package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import kendaraan.Kendaraan;
import kendaraan.Mobil;
import kendaraan.MobilBalap;

public class Main {
	Scanner scan = new Scanner(System.in);

	
	public Main() {
		List<Kendaraan> kendaraans = new ArrayList<>();
	
		while(true){
			initNewMobil(kendaraans);
			for (Kendaraan kendaraan : kendaraans) {
				kendaraan.bergerak();
				if(kendaraan.getClass().getName().contains("MobilBalap")){
					System.out.println("menggunakan gerakan special: ");
					((MobilBalap) kendaraan).specialMove();
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Main();
	}
	
	private void initNewMobil(List<Kendaraan> kendaraans){
		int roda=0,kecepatan=0, pintu=0;
		
		System.out.println("input Roda: ");
		try {
			roda = scan.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("input kecepatan: ");
		try {
			kecepatan = scan.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("input pintu: ");
		try {
			pintu = scan.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(roda != 0 && kecepatan != 0 && pintu != 0 ){
			Mobil mobil = new MobilBalap( pintu,roda, kecepatan);
			mobil.setPintu(pintu);
			kendaraans.add(mobil);
		}
	}
}

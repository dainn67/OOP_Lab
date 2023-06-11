package hust.soict.ict.test.disc;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
//		swap(jungleDVD, cinderellaDVD);
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
//		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		//test the coorect swap function
		DvdWrapper dw1 = new DvdWrapper(jungleDVD);
		DvdWrapper dw2 = new DvdWrapper(cinderellaDVD);
		correctSwap(dw1, dw2);
		
		System.out.println("\n\njungle dvd title: " + dw1.dvdRef.getTitle());
		System.out.println("cinderella dvd title: " + dw2.dvdRef.getTitle());
	}

	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
		
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void correctSwap(DvdWrapper dw1, DvdWrapper dw2) {
		DigitalVideoDisc tmpDvd = dw1.dvdRef;
		dw1.dvdRef = dw2.dvdRef;
		dw2.dvdRef = tmpDvd;
	}
}

class DvdWrapper{
	DigitalVideoDisc dvdRef;
	public DvdWrapper(DigitalVideoDisc dvd) {
		this.dvdRef = dvd;
	}
}

package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc[] discs = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("FULL");
			return;
		}
		discs[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
		if(qtyOrdered >= 17) System.out.println("The cart is almost full"); 
	}
	
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		for(int i=0; i<dvdList.length; i++) {
//			if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
//				System.out.println("FULL");
//				return;
//			}
//			discs[qtyOrdered] = dvdList[i];
//			qtyOrdered++;
//			System.out.println("A disc has been added");
//		}
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
		for(DigitalVideoDisc dvd: dvds) {
			if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
				System.out.println("FULL");
				return;
			}
			discs[qtyOrdered] = dvd;
			qtyOrdered++;
			System.out.println("A disc has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("FULL");
			return;
		} else if (qtyOrdered <= MAX_NUMBERS_ORDERED - 2) {
			discs[qtyOrdered++] = dvd1;
			discs[qtyOrdered] = dvd2;
			System.out.println("Added 2 dvds");
		} else {
			discs[qtyOrdered++] = dvd1;
			System.out.println("Can only add 1 dvd");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("No items to remove");
			return;
		}
		for(int i=0; i<qtyOrdered; i++) {
			if(discs[i].getTitle().equals(disc.getTitle())) {
				int j;
				for(j = i+1; j<qtyOrdered;j++) {
					discs[j-1] = discs[j];
				}
				discs[j] = null; 
				qtyOrdered--;
			}
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			sum += discs[i].getCost();
		}
		return sum;
	}
	
	public void  print() {
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(discs[i].toString());
		}
		System.out.println(totalCost());
	}
	
	public void searchById(int id) {
		if(id > qtyOrdered) System.out.println("Found no DVD with id = " + id);
		else {
			System.out.println("Found DVD with id: " + id);
			System.out.println(discs[id-1].toString());
		}
	}
	
	public void searchByTitle(String title) {
		for(DigitalVideoDisc disc: discs) {
			if(disc == null) continue;
			if(disc.isMatch(title)) {
				System.out.println("Found DVD with title: " + title);
				System.out.println(disc.toString());
				return;
			}
		}
		System.out.println("Found no DVD with title: " + title);
	}
}

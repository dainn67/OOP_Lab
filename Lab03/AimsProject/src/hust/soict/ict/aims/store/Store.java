package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Store {
	DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
	private static int quantity;
	
	public void addDVD(DigitalVideoDisc dvd) {
		if(quantity >= 100) {
			System.out.println("Store is full");
		}else {
			itemsInStore[quantity] = dvd;
			quantity++;
			System.out.println("Disc added to store");
		}
	}
	
	public void removeDVD(String title) {
		if(quantity <= 0) {
			System.out.println("There is no items in the store");
		}else {
			for(int i=0; i<quantity; i++) {
				if(itemsInStore[i].isMatch(title)) {
					itemsInStore[i] = null;
					for(int j = i+1; j<quantity; j++) {
						itemsInStore[j-1] = itemsInStore[j];
					}
					itemsInStore[quantity-1] = null;
					System.out.println("Removed disc");
					return;
				}
			}
			System.out.println("There is no disc named " + title);
		}
	}
	
	public void print() {
		for(int i=0; i<quantity; i++) {
			if(itemsInStore[i] != null) System.out.println(itemsInStore[i].getId() + ": " + itemsInStore[i].getTitle());
		}
	}
}

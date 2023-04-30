package main_package;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc[] discs = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED - 1) {
			System.out.println("FULL");
			return;
		}
		discs[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
		if(qtyOrdered >= 17) System.out.println("The cart is almost full"); 
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
	
	public void  prtOrder() {
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(discs[i].toString());
		}
	}
	
	
}

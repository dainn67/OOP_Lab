package hust.soict.ict.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<>();

	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("Media added");
		} else {
			System.out.println("Cart is full!");
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.isEmpty())
			System.out.println("Cart is empty!");
		else if (!itemsOrdered.contains(media))
			System.out.println("Media not found");
		else {
			itemsOrdered.remove(media);
			System.out.println("Media removed");
		}
	}

	public float totalCost() {

		// initialize cost
		float totalCost = .0f;

		for (Media media : itemsOrdered)
			totalCost += media.getCost();
		return totalCost;
	}

	public void searchById(int id) {
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				System.out.println(media.toString());
				return;
			}
		}
		System.out.println("Item not found");
	}

	public void searchByTitle(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				System.out.println(media.toString());
				return;
			}
		}
		System.out.println("Item not found");
	}

	public void print() {
		System.out.println("\nYOUR CART: ");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println((i + 1) + ") " + itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + this.totalCost() + "$\n");
	}

	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	public void makeEmpty() {
		itemsOrdered.clear();
	}

	public Media findByTitle(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title))
				return media;
		}
		return null;
	}
}

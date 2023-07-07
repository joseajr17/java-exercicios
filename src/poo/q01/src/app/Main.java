package poo.q01.src.app;

import java.util.Scanner;

import poo.q01.src.entities.Rectangle;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle r = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		r.setWidth(sc.nextDouble());
		r.setHeight(sc.nextDouble());

		System.out.println(r);
	}
}

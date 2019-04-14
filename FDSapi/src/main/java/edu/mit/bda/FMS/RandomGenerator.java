package edu.mit.bda.FMS;

import java.util.Random;

public class RandomGenerator {
public static void main(String []args) {
	Random rand = new Random();
	int i = rand.ints(0, 6).limit(1).findFirst().getAsInt();
	String transactionType[] = {"ATM","NEFT","RTGS","Online","UPI","Branch","Swiping Machine"};
	
	System.out.println(transactionType[i]);
	}
}

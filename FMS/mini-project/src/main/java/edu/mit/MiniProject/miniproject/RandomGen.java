package edu.mit.MiniProject.miniproject;

import java.util.Random;

public class RandomGen {

	public static void main(String[] x) {
		//transaction.get
		
		Random rand = new Random();
		
		String[] transType= {"RTGS","NEFT","UPI","Online Banking","Swiping Machine", "Branch","ATM","Card"};
		
		long userID = rand.longs(100, 150).limit(1).findFirst().getAsLong();
		int i = rand.ints(0, 8).limit(1).findFirst().getAsInt();
		long fromAccountNo = rand.longs(new Long("35874270601"), new Long("35874270700")).limit(1).findFirst().getAsLong();
		
		
		System.out.println(userID);
		System.out.println(transType[i]);
		System.out.println(fromAccountNo);
	}
}

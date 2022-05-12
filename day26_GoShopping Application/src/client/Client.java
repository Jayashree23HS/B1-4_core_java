package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"John",250,true);
		NormalAcc n=new GSNormalAcc(102,"Noah",300,10);
		System.out.println("Prime account: ");
		p.bookProduct(p.getCharge());
		System.out.println();
		System.out.println("Normal account: ");
		n.bookProduct(n.getCharges());
		System.out.println(s.getNewPrimeAcc(1, "Sathwik", 1236, true));
		System.out.println(s.getNewNormalAcc(800, "Darshan", 1000, 50));
		
		System.out.println(p);
		
		System.out.println(n);
		}
		

	}



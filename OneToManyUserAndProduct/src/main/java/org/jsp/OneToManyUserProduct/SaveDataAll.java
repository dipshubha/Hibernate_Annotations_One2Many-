package org.jsp.OneToManyUserProduct;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDataAll {

	public static void main(String[] args) {

		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		// one user multiple product...............

//		User u = new User();
//		u.setName("shubhadip");
//		u.setEmail("shubhadip@gmail.com");
//		u.setPhone(123456789);
//		u.setPassword("abc123");
//
//		Product p = new Product();
//		p.setUser(u);// ...............
//		p.setName("Realme Note 11");
//		p.setBrand("Realme");
//		p.setCategory("SmartPhone");
//		p.setCost(12000.00d);
//		p.setDesc("Good Phone  camera");
//
//		Product p1 = new Product();
//		p1.setUser(u); // ..................User to product
//		p1.setName("Mi Note 10");
//		p1.setBrand("MI");
//		p1.setCategory("SmartPhone");
//		p1.setCost(10000.00);
//		p1.setDesc("Good Phone");
//
//		List<Product> pro = new ArrayList<Product>();
//		pro.add(p);
//		pro.add(p1);
//
//		u.setPro(pro); // Assign product for user
//
//		manager.persist(u);
//		transaction.begin();
//		transaction.commit();

	}

}

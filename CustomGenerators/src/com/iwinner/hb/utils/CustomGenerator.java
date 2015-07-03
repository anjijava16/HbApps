package com.iwinner.hb.utils;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.iwinner.hb.dto.Product;

public class CustomGenerator implements IdentifierGenerator {
	public Serializable generate(SessionImplementor arg0, Object obj)
			throws HibernateException {

		Random ran = new Random();
		int value = ran.nextInt(10);// it contains 0-10 numbers line by line
									// seriabzle
		/*Product prd = (Product)obj;
		String str = prd.getProName();*/

	//	int len = str.length();
		Integer i = value * 5;

		return i;
	}
	public static void main(String[] args) {
		Random ran = new Random();
		int value = ran.nextInt(10);// it contains 0-10 numbers line by line
		
		System.out.println(value);
	}
}

package org.pro;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestP {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,5,6};
		int e=a.length+1;
		int sum=0;
		int n=0,s=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		n=(e*(e+1))/2;
		
		s=n-sum;
		System.out.println(s);
		System.out.println("");
		
	
	}

}

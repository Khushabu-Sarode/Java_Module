package Reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter class name");
		String name = br.readLine();
		
		try {
			Class c = Class.forName(name);
			
			System.out.println("Class : " + c.getName());
			System.out.println("Package : " + c.getPackageName());
			System.out.println("Super class : " + c.getSuperclass());
			
			System.out.println("\nInterface : ");
			Class[] in = c.getInterfaces();
			
			for(Class x : in) {
				System.out.println(x.getName());
			}
			int m = c.getModifiers();
			
			System.out.println("Final : " + Modifier.isFinal(m));
			System.out.println("Abstract :" + Modifier.isAbstract(m));
			
			System.out.println("\nConstrutor");
			Constructor[] con = c.getDeclaredConstructors();
			
			for(Constructor x : con) {
				System.out.println(x);
			}
			
			System.out.println("\nmethod");
			Method[] met = c.getDeclaredMethods();
			
			for(Method x : met) {
				System.out.println(x);
			}
			
		}catch(ClassNotFoundException e) {
				System.out.println("Invalid class name :");
			}
		

	}

}

package Dynamicallyinstance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter fully qualified name : ");
      String name = br.readLine();
      
      Class c = Class.forName(name);
      Constructor con = c.getConstructor(char[].class,int.class,int.class);      
      
      char[] chars = {'w','e','l','c','o','m','e'};
      Object obj = con.newInstance(chars,2,5);
      
      String str = (String)obj;
      System.out.println("Enter method name");
      System.out.println(str);
      String mname = br.readLine();
      Method m = c.getMethod(mname,null);
      System.out.println(m.invoke(obj, null));
      
	}

}

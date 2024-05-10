
package com.mycompany.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A
{
	int sid;
	String Name;
	String rollNo;
	String address;
	public A(int sid, String name, String rollNo, String address) 
        {
		this.sid = sid;
	    this.Name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
}

public class JAVAStream 
{ 

	public static void main(String[] args) 
        {
		List<A>studentList=new ArrayList<A>();
		studentList.add(new A(1,"ashish","RWI140","Rewa"));
		studentList.add(new A(2,"Sneha","RWI131","Anuppur"));
		studentList.add(new A(3,"Ankit","RWI132","Durg"));
		studentList.add(new A(4,"Sakshi","RWI127","Bhilai"));
		studentList.add(new A(5,"siddharth","RWI151","Durg"));
		
		List<Integer>statelist=studentList.stream()
                           .filter(p->p.sid>2)//Filering
                           .map(m->m.sid).//fetching
                           collect(Collectors.toList());
		System.out.println(statelist);
	}

}


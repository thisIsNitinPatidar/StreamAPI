
package com.mycompany.streamapi;

import java.util.*;
import java.util.stream.Collectors;
public class StreamAPI 
{
	public static void main(String args[])
	{
		List<String> list1=List.of("monika","kavita","Shweta","raghav","mayank"); 
		List<String> empname= list1.stream().filter(e->e.startsWith("m")).collect(Collectors.toList());//stsrtsWithMethod
		System.out.println(empname);//[monika, mayank]
                
                List<Integer> list2 = List.of(1,10,8,4,7,2,3);
                List<Integer> id = list2.stream().sorted().collect(Collectors.toList());//sorted method
                System.out.println(id);//[1, 2, 3, 4, 7, 8, 10]

                
                int num = list2.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
 
                 System.out.println("Sum of Even Number: "+num);//Even Number: 24
                 System.out.print("Square of list: ");//Square of list: 1 100 64 16 49 4 9 
                 list2.stream().map(x -> x * x).forEach(y -> System.out.print(y+" "));
                 System.out.println();
                Set<Integer> squareSet = list2.stream().map(x -> x * x).collect(Collectors.toSet());
                System.out.println(squareSet);//[64, 16, 1, 49, 100, 4, 9]
                
                
                List<String> show = list1.stream().sorted().collect(Collectors.toList());
                System.out.println(show);//[Shweta, kavita, mayank, monika, raghav]
        }
}



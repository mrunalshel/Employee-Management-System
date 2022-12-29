package com.emp;
import java.util.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import empdao.emp1;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started" );
        System.out.println( "press 1 for insert" );
        System.out.println( "press 2 for update" );
        System.out.println( "press 3 for delete" );
        System.out.println( "press 4 for get one employee information  " );
        System.out.println( "press 5 for get all employee's information " );
        System.out.println( "press 6 for exit" );

        Scanner sobj=new Scanner (System.in);
        System.out.println( "Enter number of button" );
        int ichoice =sobj.nextInt();
        int ino=ichoice;
        
       ApplicationContext ac=new ClassPathXmlApplicationContext("com/emp/NewFile.xml");
        JdbcTemplate temp=ac.getBean("jdt",JdbcTemplate.class);
        
        emp1 s1= ac.getBean("s1",emp1.class);
       
   switch(ino)
   {
   
   case 1:
        //for insert
employee obj=new employee();
System.out.println( "Hello... enter firstname" );
String name1=sobj.nextLine();
System.out.println( "Hello... enter lastname '\n'" );
String name2=sobj.nextLine();
System.out.println( "....enter city '\n'" );
String city1=sobj.nextLine();
System.out.println( "enter id '\n'" );
int id1=sobj.nextInt();
obj.setCity(city1);
obj.setId(id1);
obj.setFirstname(name1);
obj.setLastname(name2);
 int res=s1.insert(obj);
 System.out.println(+res);
 
 
    break;
    
   case 2:
// for update

	   System.out.println( "Hello... enter firstname '\n'" );
	   String name4=sobj.nextLine();
	   System.out.println( "Hello... enter lastname '\n'" );
	   String name5=sobj.nextLine();
	   System.out.println( "....enter city '\n'" );
	   String city6=sobj.nextLine();
	  System.out.println( "enter id '\n'" );
	   int id2=sobj.nextInt();
 employee obj1=new employee();
obj1.setId(id2);
obj1.setFirstname(name4);
obj1.setCity(city6);
obj1.setLastname(name5);
int result=s1.change(obj1);

break;


   case 3:
//for delete
	   
	   System.out.println( "enter id for delete'\n'" );
	   int id3=sobj.nextInt();  
int s=s1.delete(id3);

break;

   


   case 4:
//for get one student
	   
	   System.out.println( "enter id of the employee'\n'" );
	   int id5=sobj.nextInt();
employee es=s1.getemployee(id5);
System.out.println(es);
break;



   case 5:
//get all student
List<employee> em=s1.getallemployee();
for(employee e1:em)
{
	System.out.println(e1);
}

break;

  
   case 6:
	   System.out.println("Thank You For Using This Application"); 
	break;
   
default:
	  System.out.println("You have entered wrong input"); 
	break;
    }
 }

}

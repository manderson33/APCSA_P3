/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2_UsingObjects;

/**
 *
 * @author maanderson
 */
public class Person {
    
    String name;
    int age;
    String gender;
    String city;
    
    public Person(String n, int age, String gender, String city){       
        name = n;
        this.age = age;
        this.gender = gender;
        this.city = city;
              
    }
    
    public Person(String n, int age, String gender){        
        name = n;
        this.age = age;
        this.gender = gender;
        this.city = "Jakarta";
               
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.gender = "Female";
        this.city = "Jakarta";
    }
    
    public Person(){
        String name = "Juan";
    }
    
    
    
}


class testPerson{
    public static void main(String[] args) {
        
       Person student2 = new Person("Jennifer", 16, "Female");
        
       Person student = new Person("Ian", 15, "Male", "Jakarta");
        
       Person teacher = new Person("Ms. Tellez", 35, "Female", "Banten");
       
       Person p = new Person();
       
       String word = "Literal";
       
       Person p2 = student2;
       
       
    }
}

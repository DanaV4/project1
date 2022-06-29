
package testemployee;

public class Employee {
    
 private String fristName;
    private String lastName;
    private double salary;
    private int id;
       
      Employee(){
          
      }
      Employee(String fristName,String lastName,double salary,int id){
          this.fristName=fristName;
          this.lastName=lastName;
          this.salary=salary;
          this.id=id;
      }
      public void setFristName(String fristNmae){
          this.fristName=fristNmae;
          
      }
      public String getFristName(){
          return this.fristName;
      }
      public void setLastName(String lastName){
          this.lastName=lastName;
      }
      public String getLastName(){
          return this.lastName;
      }
      public void setsalary(double salary){
          if (salary >0)
          this.salary=salary;
      }
      public double getsalary(){
          return this.salary;
      }
      public void setid(int id){
          this.id=id;
      }
      public int getid(){
          return this.id;
      }

    @Override
    public String toString() {
        return   "fristName is : " + fristName + "\nlastName is : " + lastName + 
                "\nsalary for employee is : " + salary + "\nid is : " + id ;
    }
   
   
  
}


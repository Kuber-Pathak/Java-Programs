//Here in java there is a pre-existing fuction called toString().It returns the value given to it in string format.
//We ovrrode the toString() fucntion so that now it returns us the data of the class
class Employee
{
    String name,post;
    int salary,id;
    Employee(String n,String p,int s,int i){
        name=n;
        post=p;
        salary=s;
        id=i;
    }
    public String toString(){
        return "Name = "+name+"\nID = "+id+"\nPost = "+post+"\nSalary = "+salary;
    }
}
class Overriding_method{
    public static void main(String[] args){
        Employee e = new Employee("kuber","student",2000,1);
        System.out.println(e);
    }
}
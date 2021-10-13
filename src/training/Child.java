package training;

class Parent{

    protected final void showDetails()
    {
       System.out.println("Parent class"); 
    }
}

public class Child extends Parent
{
   protected final void showDeatails()
   {
       System.out.println("Child class");
   }
   public static void main(String[] args)
   {
       Parent obj = new Parent();
       obj.showDetails();
   }
}

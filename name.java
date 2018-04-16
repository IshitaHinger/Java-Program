class name 
{
  String name1;
   name() 
   {
    System.out.println("Here are the two names");
   }
   name(String s)
   {
    name1 = s;
   }
 public static void main(String[] args) 
 {
  name a  = new name();
  name r = new name("Raj");
 
    a.setName("Amit");
 
    a.getName();
    r.getName();
  }
 
  void setName(String s) 
  {
    name1 = s;
  }
 
  void getName() 
  {
    System.out.println(" Names: " + name1);
  }
}
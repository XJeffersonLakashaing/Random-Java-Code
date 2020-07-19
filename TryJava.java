//<>
public class TryJava{
  public static void main(String args[]){
    try{
      int div = 10/0; 
      System.out.println("10 divide by 0");
    }catch(ArithematicException e){
        System.out.println(e.getMessage()); 
    }
}
}

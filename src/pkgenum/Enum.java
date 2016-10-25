
package pkgenum;

public class Enum {

   
    public static void main(String[] args) {
        
        NewEnum number_one= NewEnum.one;
        NewEnum numer_two = NewEnum.two;
        System.out.println(number_one.compareTo(numer_two));
        System.out.println(number_one.name());
        System.out.println(number_one.ordinal());
         System.out.println(numer_two.ordinal());
      number_one.valu=76;
   for(
          NewEnum number 
           : NewEnum.values()){
       System.out.println(number.valu);
   }
      
   NewEnum ty=NewEnum.valueOf("one");
   
        
    }
    
}

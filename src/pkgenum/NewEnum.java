
package pkgenum;


public enum NewEnum {
    
    /*
    values, valuof is static methods bulit in in any enum
    
    
    
    */
    
    one(1),two(2),three(3),four(4);   //  public static objects  (nested objects)
    
    public int valu;
    
    private NewEnum(int c){
        
        valu=c;
        
    }
    
    static void move (){
        
        System.out.println("enim");
    }
            
    
    
}

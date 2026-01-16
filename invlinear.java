public class invlinear {
   static  int count= 1 ;

    static void  f(){
        if( count>=25 ){
          
        }
        else {
            count++ ;
            f() ;
            System.out.print(count+",");
           count-- ;
        }
    }

    public static void main (String args[]){
    f();





    } 
}

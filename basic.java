public class basic {
   static  int count= 1 ;
static int a=10;
    static void  f(){
        if( count>5 ){
          
        }
        else {
            System.out.println(a);
            count++ ;
            f() ;
        }
    }


    public static void main (String args[]){
       
        f();
    }
}

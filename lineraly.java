public class lineraly {
static  int count= 1 ;

    static void  f(){
        if( count>=25 ){
          
        }
        else {
            System.out.print(count+",");
            count++ ;
            f() ;
        }
    }

    public static void main (String args[]){
    f();





    }
}

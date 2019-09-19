
/**
 * The three types of loops
 *
 * @Jordan Ta
 * 9/17/19
 */
public class ForLoops
{
    public static void main( String[] args) {
        int cube;
        String x = "The quick brown fox jumped over the lazy dog";
        
        System.out.println();
        System.out.println("i\tInt i");
        for(int i =99; i >= 1; i = i - 2) {
            System.out.println(i);
        }
       
        System.out.println();
        System.out.println("i\tcube j");
        
        for(int j = 1; j<=10; j = j + 1){
            cube = j * j * j;
            System.out.println(j + "\t" + cube);
        }
        x.charAt(0);
        for(int m = 0; m<x.length(); m++){
            System.out.println(x.charAt(m));
        } 
    }  
}
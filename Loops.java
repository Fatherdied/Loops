
/**
 * The three types of loops
 *
 * @Jordan Ta
 * 9/17/19
 */
public class Loops
{
    public static void main( String[] args) {
        int Int,cube;
        String x = "The quick brown fox jumped over the lazy dog";
        
        System.out.println();
        System.out.println("i\tInt i");
        
        Int = 0;
        for(int i =99; i >= 1; i = i - 2) {
            Int = i - 2;
            System.out.println(i + "\t" + Int);
        }
        System.out.println("i\tcube i");
        for(int i = 1; i<=10; i = i + 1){
            cube = i * i * i;
            System.out.println(i + "\t" + cube);
        }
    } 
}  
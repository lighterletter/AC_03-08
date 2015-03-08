package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/8/15.
 * Logic Truth table
 */
public class TruthTable {
    public static void main(String[] args) {

        System.out.println("Truth table for 'or'");
        System.out.println();

        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));


        System.out.println();
        System.out.println("Truth Table for  'and'");
        System.out.println();

        System.out.println("true  && true  = " + (true && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println();
        System.out.println("Truth Table for  'xor'");
        System.out.println();


        System.out.println("true  ^ true  = " + (true ^ true));
        System.out.println("true  ^ false = " + (true ^ false));
        System.out.println("false ^ true  = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));

        System.out.println();
        //! = bang, Returns opposite value
        System.out.println(! true);
        System.out.println(! false);

        System.out.println();



    }
}

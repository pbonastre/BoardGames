import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BoardGame {

    private static final String INFILENAME = "C:\\workSpaceIJ\\input\\inputChallenge3.txt";
    private static String OUTFILENAME =  "C:\\workSpaceIJ\\input\\outputChallenge3.txt";
    private static Scanner in;
    private static PrintWriter out;

    public static void main(String[] args) throws FileNotFoundException {

        in = new Scanner(new FileReader(INFILENAME));
        out = new PrintWriter(OUTFILENAME);

        int cases = in.nextInt();

        for (int i = 1; i <=cases; i++){
            out.print("Case #" + i + ": ");
            optainCardsNeeded();
            out.println();
        }
        in.close();
        out.close();
    }

    private static void optainCardsNeeded() {
        DecimalFormat df = new DecimalFormat("##0");
        double P = in.nextDouble();
        out.print(df.format(Math.ceil(Math.log(P+1)/(Math.log(2)))));

    }

}

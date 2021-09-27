import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest{


    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest setPalindromeTester;
    private int runns;
    int[] zahlen;

    public NumberTester(String fileName ) {
        String dateiName = "fileName";
        File file = new File(dateiName);


        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(dateiName));
            String zeile = null;
            zahlen = new int[Integer.parseInt(zeile = in.readLine())];
            while ((zeile = in.readLine()) != null) {
                int i =0;

                zahlen[i] = Integer.parseInt(zeile);

                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
        runns = zahlen[0];

    }
    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester ;
    }
    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester ;
    }
    public void setPalindromeTester( NumberTest palindromeTester ) {
        this.setPalindromeTester = palindromeTester ;
    }

    public void testFile() {
        for (int i = 0; i < runns; i++) {
            if (zahlen[0] >=1 )
            {
                
            }
        }


    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}

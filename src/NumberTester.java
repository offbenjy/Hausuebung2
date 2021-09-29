import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class NumberTester implements NumberTest {


    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest setPalindromeTester;
    private int runns;
    int[] zahlen;
    public String[] numbers;

    public NumberTester(String fileName) {
        testFile(fileName);

    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.setPalindromeTester = palindromeTester;
    }

    public void testFile(String fileName) {

        String dateiName = fileName;
        File file = new File(dateiName);


        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(dateiName));
            String zeile = null;
            in.readLine();
            while ((zeile = in.readLine()) != null) {


                numbers = (zeile.split("\\s+"));
                int number1 = Integer.parseInt(numbers[0]);
                int number2 = Integer.parseInt(numbers[1]);


                    if (number1 == 1) {
                        System.out.println(number2);
                        setOddEvenTester();
                        oddTester.testNumber(number2);
                    } else if (number1 == 2) {
                        // setPalindromeTester();
                        System.out.println(number2);
                    } else if (number1== 3) {
                        System.out.println(number2);
                        setPrimeTester
                    }
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

        private static boolean isPrime(int number) {
            IntPredicate isDivisible = index -> number % index == 0;
            return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
        }

    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }

}

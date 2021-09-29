import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

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

                    setOddEvenTester((number) -> {
                        if (number %2 == 0) {
                            System.out.println("EVEN");
                        }else
                            System.out.println("ODD");
                        return false;
                            });
                    oddTester.testNumber(number2);
                } else if (number1 == 2) {
                    setPrimeTester((number) -> {
                        int isPrimeLimit = number + 1;
                        ArrayList<Integer> primes = new ArrayList<Integer>();
                        boolean[] isPrime = new boolean[isPrimeLimit];

                        for (int i = 0; i < isPrime.length; i++) {
                            isPrime[i] = true;
                        }
                        for (int i = 2; i < isPrime.length; i++) {
                            if (isPrime[i]) {
                                primes.add(i);
                                for (int j = i * i; j < isPrime.length; j += i) {
                                    isPrime[j] = false;
                                }
                            }

                        }
                        if (isPrime[number] == true) {
                            System.out.println("PRIME");
                        } else
                            System.out.println("NO PRIME");
                        return false;
                    });
                    primeTester.testNumber(number2);
                } else if (number1 == 3) {
                    setPalindromeTester((number) -> {

                        return false;
                    });
                    setPalindromeTester.testNumber(number2);

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


    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }

}

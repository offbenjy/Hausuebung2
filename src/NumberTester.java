import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< HEAD

public class NumberTester implements NumberTest {
=======
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberTester implements NumberTest {


>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest setPalindromeTester;
    private int runns;
    int[] zahlen;
    public String[] numbers;

    public NumberTester(String fileName) {
        testFile(fileName);
<<<<<<< HEAD
    }
=======

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
>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50

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
<<<<<<< HEAD
                numbers = (zeile.split("\\s+"));
                int number1 = Integer.parseInt(numbers[0]);
                int number2 = Integer.parseInt(numbers[1]);
                if (number1 == 1) {
                    setOddEvenTester((number) -> {
                        if (number % 2 == 0) {
                            System.out.println("EVEN");
                        } else
                            System.out.println("ODD");
                        return false;
                    });
=======

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
>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
                    oddTester.testNumber(number2);
                } else if (number1 == 2) {
                    setPrimeTester((number) -> {
                        int isPrimeLimit = number + 1;
                        ArrayList<Integer> primes = new ArrayList<Integer>();
                        boolean[] isPrime = new boolean[isPrimeLimit];
<<<<<<< HEAD
=======

>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
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
<<<<<<< HEAD
=======

>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
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
<<<<<<< HEAD
                        int len = (int) Math.ceil(Math.log10(number + 1));
                        for (int n = 0; n < len / 2; n++) {
                            if ((number / (int) Math.pow(10, n)) % 10 != (number / (int) Math.pow(10, len - n - 1)) % 10) {
                                System.out.println("NO PALINDROME");
                            } else
                                System.out.println("PALINDROME");
                            return false;
                        }
                        return false;
                    });
                    setPalindromeTester.testNumber(number2);
=======

                        return false;
                    });
                    setPalindromeTester.testNumber(number2);

>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
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
<<<<<<< HEAD
=======


>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50
    }
    @Override
    public boolean testNumber(int number) {
        return false;
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> 437d764d7e107a03e54276ea3cc248a382b3ba50

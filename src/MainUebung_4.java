import java.util.Scanner;

public class MainUebung_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AbstractCalculator rational = new RationalCalculator((x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();
            double neuZaehler = zaeler1 * nenner2 +  zaeler2 * nenner1;
            double neuNenner  = nenner1 * nenner2;
            double m = Math.abs(neuZaehler);
            double n = Math.abs( neuNenner);
            double r;
            do
            {
                r = m % n;
                m = n;
                n = r;
            } while( n != 0);

            if( m > 1)
            {
                neuZaehler /=  m;
                neuNenner /= m;
            }

            System.out.println("Addition der Brüche ergibt " + neuZaehler + "/" + neuNenner);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();

            double neuZaehler = zaeler1 * nenner2 -  zaeler2 * nenner1;
            double neuNenner  = nenner1 * nenner2;
            double m = Math.abs(neuZaehler);
            double n = Math.abs( neuNenner);
            double r;
            do
            {
                r = m % n;
                m = n;
                n = r;
            } while( n != 0);
            if( m > 1)
            {
                neuZaehler /=  m;
                neuNenner /= m;
            }
            System.out.println("Suptraktion der Brüche ergibt " + neuZaehler + "/" + neuNenner);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();

            double neuZaehler = zaeler1 *zaeler2;
            double neuNenner = nenner1 * nenner2;

            double m = Math.abs(neuZaehler);
            double n = Math.abs( neuNenner);
            double r;
            do
            {
                r = m % n;
                m = n;
                n = r;
            } while( n != 0);

            if( m > 1)
            {
                neuZaehler /=  m;
                neuNenner /= m;
            }

            System.out.println("Multiplikation der Brüche ergibt " + neuZaehler + "/" + neuNenner);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getB();
            double nenner2 = y.getA();

            double neuZaehler = zaeler1 *zaeler2;
            double neuNenner = nenner1 * nenner2;

            double m = Math.abs(neuZaehler);
            double n = Math.abs( neuNenner);
            double r;
            do
            {
                r = m % n;
                m = n;
                n = r;
            } while (n != 0);
            if (m > 1) {
                neuZaehler /= m;
                neuNenner /= m;
            }
            System.out.println("Division der Brüche ergibt " + neuZaehler + "/" + neuNenner);
            return x;
        });
        AbstractCalculator vector = new VectorCalculator((x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();

            double vektor1Erg = zaeler1 + zaeler2;
            double vektor2Erg = nenner1 + nenner2;
            double m = Math.abs(vektor1Erg);
            double n = Math.abs(vektor2Erg);
            double r;
            do {
                r = m % n;
                m = n;
                n = r;
            } while (n != 0);
            if (m > 1) {
                vektor1Erg /= m;
                vektor2Erg /= m;
            }

            System.out.println("Addition der Vektoren ergibt " + vektor1Erg + "/" + vektor2Erg);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();
            double vektor1Erg = zaeler1 - zaeler2;
            double vektor2Erg = nenner1 - nenner2;
            double m = Math.abs(vektor1Erg);
            double n = Math.abs(vektor2Erg);
            double r;
            do {
                r = m % n;
                m = n;
                n = r;
            } while (n != 0);
            if (m > 1) {
                vektor1Erg /= m;
                vektor2Erg /= m;
            }
            System.out.println("Subtraktion der Vektoren ergibt " + vektor1Erg + "/" + vektor2Erg);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();
            double vektor1Erg = (zaeler1 * zaeler2);
            double vektor2Erg = (nenner1 * nenner2);
            double m = Math.abs(vektor1Erg);
            double n = Math.abs(vektor2Erg);
            double r;
            do {
                r = m % n;
                m = n;
                n = r;
            } while (n != 0);
            if (m > 1) {
                vektor1Erg /= m;
                vektor2Erg /= m;
            }
            System.out.println("Multiplikation der Vektoren ergibt " + vektor1Erg + "/" + vektor2Erg);
            return x;
        }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();
            double vektor1Erg = (zaeler1 / zaeler2);
            double vektor2Erg = (nenner1 / nenner2);
            double m = Math.abs(vektor1Erg);
            double n = Math.abs(vektor2Erg);
            double r;
            do {
                r = m % n;
                m = n;
                n = r;
            } while (n != 0);
            if (m > 1) {
                vektor1Erg /= m;
                vektor2Erg /= m;
            }
            System.out.println("Division der Vektoren ergibt " + vektor1Erg + "/" + vektor2Erg);
            return x;
        });
        AbstractCalculator complex = new ComplexCalculator((x, y) -> {

            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();

            String z;
             double result1 =(zaeler1 + zaeler2);
             double result2 =(nenner1 + nenner2);
             if (result2 ==0)
             {
                 z =  ""+result1;
             }else{
                 z =  result1+ "+" + result2+"i";
             }


            System.out.println("Addition der Komplexenzahlen ergibt " + z);
        return x;
    }, (x, y) -> {
        return x;
    }, (x, y) -> {
            double zaeler1 = x.getA();
            double nenner1 = x.getB();
            double zaeler2 = y.getA();
            double nenner2 = y.getB();
            String z;  // Multiplikation zweier komplexer Zahlen
            z = (zaeler1 * nenner2 - zaeler1 * zaeler2) + "+" + (nenner1 * zaeler2 + nenner2 * zaeler1)+"i";

            System.out.println("Multiplikation der Komplexenzahlen ergibt " + z);

        return x;
    }, (x, y) -> {
        return x;
    });

        boolean running = true;
        while (running) {
            Scanner sint = new Scanner(System.in);
            System.out.println("Choose calculator: \n1 = Relationalcalculator \n2 = Vectorclculator \n3 = Complexcalculator \n4 = Exit program");
            int i = Integer.parseInt(s.nextLine());
            switch (i) {
                case 1:
                    Number bruch1 = new Number();
                    Number bruch2 = new Number();
                    System.out.println("Enter number x a> ");
                    bruch1.setA(sint.nextDouble());
                    System.out.println("Enter number x b>");
                    bruch1.setB(sint.nextDouble());
                    System.out.println("Enter number y a>");
                    bruch2.setA(sint.nextDouble());
                    System.out.println("Enter number y b>");
                    bruch2.setB(sint.nextDouble());

                    System.out.println("1 = add\n" +
                            "2 = subtract\n" +
                            "3 = multiply\n" +
                            "4 = divide\n" +
                            "5 = enter numbers again");
                    int j = Integer.parseInt(s.nextLine());
                    i = 0;
                    switch (j){
                        case 1:

                            System.out.println("________________________________\n");
                            rational.add(bruch1,bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 2:
                            System.out.println("________________________________\n");
                            rational.subtract(bruch1,bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 3:
                            System.out.println("________________________________\n");
                            rational.multiply(bruch1,bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 4:
                            System.out.println("________________________________\n");
                            rational.divide(bruch1,bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 5:
                            i = 1;
                        default:
                            System.out.println("Keine vorhande Zahl");
                            break;
                    }
                    break;
                case 2:
                    bruch1 = new Number();
                    bruch2 = new Number();
                    System.out.println("Enter number x a> ");
                    bruch1.setA(sint.nextDouble());
                    System.out.println("Enter number x b>");
                    bruch1.setB(sint.nextDouble());
                    System.out.println("Enter number y a>");
                    bruch2.setA(sint.nextDouble());
                    System.out.println("Enter number y b>");
                    bruch2.setB(sint.nextDouble());

                    System.out.println("1 = add\n" +
                            "2 = subtract\n" +
                            "3 = multiply\n" +
                            "4 = divide\n" +
                            "5 = enter numbers again");
                    int g = Integer.parseInt(s.nextLine());
                    i = 0;
                    switch (g) {
                        case 1:
                            System.out.println("________________________________\n");
                            vector.add(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 2:
                            System.out.println("________________________________\n");
                            vector.subtract(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 3:
                            System.out.println("________________________________\n");
                            vector.multiply(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 4:
                            System.out.println("________________________________\n");
                            vector.divide(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 5:
                            i = 1;
                        default:
                            System.out.println("Keine vorhande Zahl");
                            break;
                    }
                    break;
                case 3:

                    bruch1 = new Number();
                    bruch2 = new Number();
                    System.out.println("Enter number x a> ");
                    bruch1.setA(sint.nextDouble());
                    System.out.println("Enter number xi b>");
                    bruch1.setB(sint.nextDouble());
                    System.out.println("Enter number y a>");
                    bruch2.setA(sint.nextDouble());
                    System.out.println("Enter number yi b>");
                    bruch2.setB(sint.nextDouble());

                    System.out.println("1 = add\n" +
                            "2 = subtract\n" +
                            "3 = multiply\n" +
                            "4 = divide\n" +
                            "5 = enter numbers again");
                    int k = Integer.parseInt(s.nextLine());
                    i = 0;
                    switch (k) {
                        case 1:
                            System.out.println("________________________________\n");
                            complex.add(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 2:
                            System.out.println("________________________________\n");
                            complex.subtract(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 3:
                            System.out.println("________________________________\n");
                            complex.multiply(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 4:
                            System.out.println("________________________________\n");
                            complex.divide(bruch1, bruch2);
                            System.out.println("\n________________________________");
                            break;
                        case 5:
                            i = 1;
                        default:
                            System.out.println("Keine vorhande Zahl");
                            break;
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Keine vorhande Zahl");
                    break;
            }
        }
    }
}


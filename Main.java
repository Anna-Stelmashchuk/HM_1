public class Main {
    public static void main(String[] args) {
        // Операції з byte
        byte b1 = 10, b2 = 5;
        byte sumByte = (byte) (b1 + b2);
        byte diffByte = (byte) (b1 - b2);
        byte multByte = (byte) (b1 * b2);
        byte divByte = (byte) (b1 / b2);
        byte modByte = (byte) (b1 % b2);

        System.out.println("byte: ");
        System.out.println("Sum: " + sumByte);
        System.out.println("Difference: " + diffByte);
        System.out.println("Multiplication: " + multByte);
        System.out.println("Division: " + divByte);
        System.out.println("Modulo: " + modByte);

        // Операції з short
        short s1 = 100, s2 = 50;
        short sumShort = (short) (s1 + s2);
        short diffShort = (short) (s1 - s2);
        short multShort = (short) (s1 * s2);
        short divShort = (short) (s1 / s2);
        short modShort = (short) (s1 % s2);

        System.out.println("short: ");
        System.out.println("Sum: " + sumShort);
        System.out.println("Difference: " + diffShort);
        System.out.println("Multiplication: " + multShort);
        System.out.println("Division: " + divShort);
        System.out.println("Modulo: " + modShort);

        // Операції з long
        long l1 = 1000L, l2 = 500L;
        long sumLong = l1 + l2;
        long diffLong = l1 - l2;
        long multLong = l1 * l2;
        long divLong = l1 / l2;
        long modLong = l1 % l2;

        System.out.println("long: ");
        System.out.println("Sum: " + sumLong);
        System.out.println("Difference: " + diffLong);
        System.out.println("Multiplication: " + multLong);
        System.out.println("Division: " + divLong);
        System.out.println("Modulo: " + modLong);

        // Операції з double
        double d1 = 10.5, d2 = 2.5;
        double sumDouble = d1 + d2;
        double diffDouble = d1 - d2;
        double multDouble = d1 * d2;
        double divDouble = d1 / d2;

        System.out.println("double: ");
        System.out.println("Sum: " + sumDouble);
        System.out.println("Difference: " + diffDouble);
        System.out.println("Multiplication: " + multDouble);
        System.out.println("Division: " + divDouble);

        // Операції з float
        float f1 = 10.5f, f2 = 2.5f;
        float sumFloat = f1 + f2;
        float diffFloat = f1 - f2;
        float multFloat = f1 * f2;
        float divFloat = f1 / f2;

        System.out.println("float: ");
        System.out.println("Sum: " + sumFloat);
        System.out.println("Difference: " + diffFloat);
        System.out.println("Multiplication: " + multFloat);
        System.out.println("Division: " + divFloat);
    }
}


package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        /* pojedynczy znak np. ‘a’ – zapisywany w 16 bitach pamięci */
        char letter = 'a';
        System.out.println(letter);

        /* pojedynczy bajt – liczba całkowita z przedziału -128 do 127 – zapisywany w 8 bitach pamięci */
        byte smallNumber = 127;
        System.out.println(smallNumber);

        /* liczba całkowita z przedziału -32768 do 32767 – zapisywany w 16 bitach pamięci */
        short shortNumber = 32767;
        System.out.println(shortNumber);

        /* liczba całkowita w zakresie od -2147483648 do 2147483647 – zapisywany w 32 bitach pamięci */
        int intNumber = 2147483647;
        System.out.println(shortNumber);

        /* long – liczba całkowita w zakresie od -9223372036854775808 do 9223372036854775807 – zapisywany 64 bitach pamięci – zapisywany z przyrostkiem L (9223372036854775807L) */
        long bigInteger = 9223372036854775807L;
        System.out.println(bigInteger);

        /* liczba zmiennoprzecinkowa pojedynczej precyzji – zapisywany w 32 bitach pamięci – zapisywana z przyrostkiem f (54.91f) */
        float realNumber = 54.91f;
        System.out.println(realNumber);

        /* double – liczba zmiennoprzecinkowa pojedynczej precyzji – zapisywany w 64 bitach pamięci */
        double longRealNumber = 54.7976931313486231573;
        System.out.println(longRealNumber);

        /* typ logiczny – może przyjąć dwie wartości: true lub false */

        boolean itIsTrue = true;
        System.out.println(itIsTrue);



      }
    }

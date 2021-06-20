package pl.COI.pozostaleZadania;

public class Zad8 {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba"};

        System.out.println("Za pomocą iteratora:");
        for (int i = 0; i < drzewa.length; i++) {
            System.out.println(drzewa[i]);
        }

        System.out.println("\nZa pomocą generyków:");
        printArray(drzewa);
    }
}

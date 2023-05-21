package banjoMandolin;

public class BanjoMandolin {

    public String getOutput(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "BanjoMandolin";
        } else if (number % 3 == 0) {
            return "Banjo";
        } else if (number % 5 == 0) {
            return "Mandolin";
        } else {
            return String.valueOf(number);
        }
    }

    public void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getOutput(i));
        }
    }

    public static void main(String[] args) {
        BanjoMandolin bm = new BanjoMandolin();
        bm.printNumbers();
    }
}

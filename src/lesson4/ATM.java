package lesson4;

/**
 * Created by admin on 6/18/17.
 */
public class ATM {


    public static int twenty;
    public static int fifty;
    public static int hundred;

    public static int sumATM() {
        return 20 * twenty + 50 * fifty + 100 * hundred;
    }

    public ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public void fillMoney(int twenty, int fifty, int hundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(10, 10, 12);
        atm.withdraw(230);

    }

    public static void withdraw(int sum) {
        int[] quantityBanknotes = {0, 0, 0};
        int[] banknotes = {20, 50, 100};
        boolean isCorrect = false;

        if ((sum <= sumATM()) && ((sum % 20 == 0) || ((sum >= 50) && (sum % 10 == 0)))) {
            isCorrect = true;
        } else {
            isCorrect = false;
        }
        if (isCorrect) {
            int i = banknotes.length - 1;
            while (i >= 0) {

                if (banknotes[i] > sum) {
                    i--;
                } else if (sum == 110 || sum == 60 || sum == 130) {
                    i--;
                    quantityBanknotes[i]++;
                    sum -= banknotes[i];
                } else if (sum == 80) {
                    i--;
                    quantityBanknotes[i] += 2;
                    sum -= banknotes[i] * 2;
                } else {
                    quantityBanknotes[i]++;
                    sum -= banknotes[i];
                }
            }

            for (int k = banknotes.length - 1; k >= 0; k--) {
                System.out.println(banknotes[k] + " - " + quantityBanknotes[k]);
            }
        } else {
            System.out.println("Сумма не корректная");
        }

    }

}

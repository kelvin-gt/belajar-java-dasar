package kt;

public class BreakContinueReturn {
    public static void main(String[] args) {

        // break
        int i = 0;
        while (true) {
            i++;

            if (i == 10) {
                break; // langsung berhenti disini jika memenuhi kondisi
            } else if (i == 5) {
                continue; // akan langsung loncat keatas lagi jika memenuhi kondisi
            } else if (i == 7) {
                return;
            }

            System.out.println("Angka ke - " + i);
        }

        // continue

    }
}

package kt;

public class LoopBersarang {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
               if (i + j == 4) {
                   break;
               }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if (i + j == 8) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

       for (int i = 1; i <= 5; i++) {
           for (int j = 5; j > i; j--) {
               System.out.print("  ");
           }
           for (int k = 1; k <= i; k++){
               System.out.print("* ");
           }
           System.out.println();
       }

        System.out.println();

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 4; j >= i; j--)
            {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }

            for (int l = 1; l <= i-1; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}

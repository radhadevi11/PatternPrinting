import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

public class Pattern {
    public void printOddPyramid(int n) {
        /*Algorithm:
        Step 0:Create a variable called starCount and initialize it to 1,create another variable called spaceCount initialize it to n
        step 1:for each row from 1 to (n/2 + 1) do
                      i)print the spaces from 1 to half of the spaceCount
                      ii)print the star from 1 to star count
                      1v)increment the starCount by 2
                      v)decrement the spaceCount by 2
         */
        System.out.println("Printing Pyramid For Odd Numbers");
        if (n % 2 == 0) {
            System.out.println(n + " is an even number can't print pyramid");
        }
        else {
            int starCount = 1;
            int spaceCount = n;
            for (int i = 1; i <= (n / 2) + 1; i++) {
                for (int j = 1; j <= spaceCount / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= starCount; k++) {
                    System.out.print("*");
                }
                starCount += 2;
                spaceCount -= 2;
                System.out.println();
            }

        }
    }
    public void printEvenPyramid(int n) {
        /*Algorithm
        Step1:Declare a variable called starCount and initialize it to 2,
              Declare another variable called starCount initialize it to n.
        Step2:For each row from 1 to n/2 do
                i)print spaces (spaceCount/2)-1 times
                ii)print the stars starCount times
                iii)Increment the starCount by 2
                1V) decrement the SpaceCount by 2


         */
        System.out.println("Printing Pyramid for Even Numers");
        if (n % 2 != 0) {
            System.out.println(n + " is an odd number can't print pyramid");
        }
        else {
            int starCount = 2;
            int spaceCount = n;
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= (spaceCount / 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= starCount; k++) {
                    System.out.print("*");
                }
                spaceCount -= 2;
                starCount += 2;
                System.out.println();
            }
        }
    }

}

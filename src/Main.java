import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();

        EquationEvaluation equationEvaluation = new EquationEvaluation(str);
        for(int i=0;i<10;i++)
        {
            float x;
            x = scanner.nextFloat();
            float a = equationEvaluation.evaluate(x);
            System.out.println(a);

        }
    }
}

package romannumerals;
import java.util.Scanner;
public class Romacalc {
    public static void main(String[] args) throws Exception {

        Mathoperation MathChase = new Mathoperation();
        Convernum resultroma = new Convernum();
        Romanum chase = new Romanum();
        Scanner sc = new Scanner(System.in);
        String romanum = sc.nextLine();
        String num[] = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String r[] = romanum.split(" ");
        if(r.length > 3){
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else if(r.length < 3){
            throw new Exception("т.к. строка не является математической операцией");
        }
        boolean flag = false;
        boolean flag2 = false;
        for (int i = 0; i < num.length; i++) {
            if (r[0].equals(num[i])) {
                flag = true;

            }if (r[2].equals(num[i])){
                flag2 = true;
            }
        }
        if((flag == true && flag2 == false) || (flag == false && flag2 == true)) {
            throw new Exception("используются одновременно разные системы счисления");

        }
        if (!flag && !flag2) {
            if (Integer.parseInt(r[0]) > 10) {
                throw new IllegalArgumentException("Число должно быть меньше или равно 10");
            } else {
                if (Integer.parseInt(r[2]) > 10) {
                    throw new IllegalArgumentException("Число должно быть меньше или равно 10");
                }

            }
        }
        if (!flag && !flag2) {
            int result = MathChase.Znaki(r[1], Integer.parseInt(r[0]), Integer.parseInt(r[2]));
            System.out.println(result);
        } else {
            if (flag && flag2) {
                int result = MathChase.Znaki(r[1], chase.romachase(r[0]), chase.romachase(r[2]));

                if(result <= 0){
                    throw new Exception("т.к. в римской системе нет отрицательных чисел");

                }else System.out.println(resultroma.conver(result));
            }

        }

    }
}


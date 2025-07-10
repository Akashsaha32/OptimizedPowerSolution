//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int base = 3;
        int exp = 12;
        System.out.println(power(base, exp));
    }

    public static int power(int base, int exp){
        int cnt = 0;
        int rslt = base;
        while(exp > 1){
            if(exp % 2 == 1){
                rslt = ifOdd(rslt);
            }else{
                rslt = ifEven(rslt);
            }
            exp = exp/2;
            cnt++;
        }
        System.out.println("Total loop: " + cnt);
        return rslt;
    }

    public static int ifEven(int val){
        return (val * val);
    }
    public static int ifOdd(int val){
        return (val * val * val);
    }
}
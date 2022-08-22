package romannumerals;

public class Mathoperation {
    public int Znaki(String sign, int first,int second){
        int result = 0;
        switch (sign){
            case"+":result = first + second;break;
            case"-":result = first - second;break;
            case"*":result = first * second;break;
            case"/":result = first / second;break;
            default:
                break;
        }
        return result;
    }
}

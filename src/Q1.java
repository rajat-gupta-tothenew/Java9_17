interface Calculation{

    private static float div(float  a, float b){
        return a/b;
    }

    static void calc(float a,float b){
        System.out.println(div(a,b));

    }

}

public class Q1 {
    public static void main(String[] args) {
        Calculation.calc(12.0f,3.0f);
    }

}

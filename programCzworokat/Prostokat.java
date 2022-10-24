package pl.zadanko_czworokat;

public class Prostokat extends Czworokat{

    public Prostokat (double a, double b){
        super(a,b,a,b);
    }

    void wymiary(double w1, double w2){
        a=w1;
        b=w2;
        c=w1;
        d=w2;
    }

    double pole(){

        return a*b;
    }

}
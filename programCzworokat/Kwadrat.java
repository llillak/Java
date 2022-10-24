package pl.zadanko_czworokat;

public class Kwadrat extends Czworokat{

    public Kwadrat (double a){
super(a,a,a,a);
    }

    void wymiary(double w1){
        a=w1;
        c=w1;
        b=w1;
        d=w1;
    }

    double pole(){
        return a*a;
    }


}
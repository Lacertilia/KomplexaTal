public class Komplex {
    double r;
    double i;

    public Komplex(double r, double i){
        this.r = r;
        this.i = i;
    }

    public Komplex add(Komplex a){
        Komplex s = new Komplex(a.r + this.r, a.i + this.i);
        return s;
    }
    public Komplex multiply(Komplex a){
        Komplex p = new Komplex((a.r*this.r)-(a.i*this.i), (a.r*this.i)+(a.i*this.r));
        return p;
    }

    public double arg(){
        return Math.atan(this.i/this.r);
    }

    public boolean equals(Komplex a){
        if(this.r == a.r && this.i == a.i){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "z = " + this.r + " + " + this.i + "i";
    }

}

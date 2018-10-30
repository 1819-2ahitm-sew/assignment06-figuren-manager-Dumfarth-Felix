package figuresManager;
abstract class Figure {
    private int a;
    private int b;
    private int angle;
    abstract public double area();
    abstract public double circumference();
    abstract public String output();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}class Ellipse extends Figure{
    @Override
    public double area(){
        double flaeche = getA() * getB() * Math.PI;
        return Math.round(flaeche*1000)/1000.0;
    }public double circumference(){
        double lambda = ( getA() - getB()) / ( getA() + getB());
        double umfang = ( getA() + getB()) * Math.PI * (1 + ((3 * lambda * lambda)) / (10 + Math.sqrt(4 - 3 * lambda * lambda)));
        return Math.round(umfang*1000)/1000.0;
    }public String output() {
        return "Ellipse mit Hauptachse = "+getA()+" und Nebenachse = "+ getB() +": Fläche -> "+area()+", Umfang -> " + circumference();
    }
}
class Circle extends Figure{
    public double area() {
        double flaeche = Math.PI * getA() * getA();
        return Math.round(flaeche*1000)/1000.0;
    }
    public double circumference() {
        double umfang = 2* Math.PI* getA();
        return Math.round(umfang*1000)/1000.0;
    }
    public String output() {
        return "Kreis mit Radius = "+getA()+": Fläche -> "+ area()+", Umfang -> "+circumference();
    }
}
class Square extends Figure{
    @Override
    public double area(){
        return getA() * getA();
    }
    public double circumference() {
        return 4 * getA();
    }
    public String output() {
        return "Quadrat mit Seite = "+getA()+": Fläche -> "+ area()+", Umfang -> "+circumference();
    }
}class Rectangle extends Figure{
    @Override
    public double area(){
        return getA() * getB();
    }
    public double circumference() {
        return 2 *(getA() + getB());
    }
    public String output() {
        return "Rechteck mit Länge = "+getA()+" und Breite =  "+getB()+": Fläche -> "+ area()+", Umfang -> "+circumference();
    }
}class Triangle extends Figure{
    @Override
    public double area(){
        double gamma = getAngle() * Math.PI / 180;
        double flaeche = getA() * getB() * Math.sin(gamma) / 2;
        return Math.round(flaeche*1000)/1000.0;
    }
    public double circumference() {
        double gamma = getAngle() * Math.PI / 180;
        double c = Math.sqrt(getA()* getA() + getB() * getB() - 2 * getA() * getB() * Math.cos(gamma));
        return Math.round((getA() + getB()+ c)*1000)/1000.0;
    }
    public String output() {
        return "Dreieck mit Seite 1 = " +getA()+" und Seite 2 = "+ getB() + " und dem eingeschlossenen Winkel = "+getAngle()+": Fläche -> "+ area()+", Umfang -> "+circumference();
    }
}

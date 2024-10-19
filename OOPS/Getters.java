public class Getters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Green");
        System.out.println(p1.getColor());
        p1.setTip(13);
        System.out.println(p1.getTip());
    }
}

class Pen{
    String color;
    int tip;
    
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip=tip;
    }
}

public class Getters {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setTip(6);
        System.out.println(p.getTip());
    }
}

class Pen{
    String color;
    int tip;

    String getColor(){
        return  this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int newTip){
        this.tip=newTip;
    }
}

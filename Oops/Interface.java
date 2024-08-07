public class Interface {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.moves();
    }
    
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,dowmn,left,right,diagonal");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,dowmn,left,right");
    }
}

class KIng implements Chessplayer{
    public void moves(){
        System.out.println("up,dowmn,left,right,diagonal(in one step)");
    }
}


//multiple inheritance

interface Herbivore{

}

interface Carnivore{

}

class Animal implements Herbivore,Carnivore{

}
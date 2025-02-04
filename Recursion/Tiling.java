public class Tiling {

    public static int tilingProblem(int n){

        if(n==0 || n==1){
            return 1;
        }

        //verticle choices
        int verticleTiles=tilingProblem(n-1);
        //horizontal choices
        int horizontalTiles=tilingProblem(n-2);

        int totalWays=verticleTiles+horizontalTiles;

        return totalWays;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println("Number of ways to tile a "+n+"x2 grid: "+tilingProblem(n));
    }
}

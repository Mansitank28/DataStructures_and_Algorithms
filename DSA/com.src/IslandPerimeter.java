public class IslandPerimeter {
    public static void main(String[] args) {

        // Island Perimeter
        int[][]  grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        //brute force approch
        int perimeter =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //current cell
                if(grid[i][j] ==1){
                    perimeter += 4;

                    //shared edge neighbor
                    if(i >0 && grid[i-1][j]==1){
                        perimeter -= 2;
                    }
                    if(j>0 && grid[i][j-1] ==1){
                        perimeter -= 2;
                    }
                }
            }
        }
        System.out.println(perimeter);
    }
}

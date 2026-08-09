public class NestedLoopBasic{
    public static void main(String[] args){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=2; j++){
                System.out.println(i+ " " + j);

            }
        }
    }
}

// Time  = O(n × m)
//Space = O(1)
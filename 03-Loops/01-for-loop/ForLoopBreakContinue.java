public class ForLoopBreakContinue{
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
             if(i==3){
                 continue;
             }
             if(i==7){
                 break;
             }
             System.out.println(i);
        }
    }
}

//Time = O(1)
//Space = O(1)
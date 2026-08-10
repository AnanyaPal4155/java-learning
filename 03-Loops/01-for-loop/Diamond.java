public class Diamond {public static  void main(String[] args){int n = 5;

    // upper triangle*******************************
    for(int i =1; i<=n; i++){

        //print space
        for(int space = 1 ; space<=n-i; space++){
            System.out.print(" ");
        }
        // print star
        for(int j=1 ; j<=i*2-1;j++){

            System.out.print("*");
        }

        System.out.println();
    }

    // lower triangle****************************
    for(int i =n-1; i>=1; i--){

        //print space
        for(int space = 1 ; space<=n-i; space++){
            System.out.print(" ");
        }
        // print star
        for(int j=1 ; j<=i*2-1;j++){

            System.out.print("*");
        }

        System.out.println();
    }
}

}

//UPPER:
//i ↑
//1 2 3 4 5
//stars: 1 3 5 7 9
//
//LOWER:
//i ↓
//4 3 2 1
//stars: 7 5 3 1

//Time Complexity  = O(n²)
//Space Complexity = O(1)
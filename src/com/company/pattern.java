package com.company;

public class pattern {
    public static void main (String[] args){
//         for the pattern 1!!!
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }

//        for the pattern 2!!!

        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                if (i ==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }

        //        for the pattern 3!!!
        for (int i=1; i<=4;i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }

//        for the pattern 4!!!
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }



//        for the pattern 5!!!
        int n= 4;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }

//            for the pattern 6!!!
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }

//        for the pattern 7!!!
        for (int i=5; i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }

//         for the pattern 8!!!

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(n+++" ");
            }
            System.out.println( );
        }


//        for the pattern 9!!!
    for (int i=1;i<=5;i++){
        for (int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }

        }
        System.out.println( );
    }

//for the pattern 10!!!
        for (int i=5;i>=1;i--){
            for (int j=1;j<=(i-1);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println( );
        }

//        for the pattern 11!!!
                for (int i=1;i<=5;i++){
                    for (int j=5;j>=(i-1);j--){
                        System.out.print(" ");
                    }
                     for (int j=1;j<=i;j++){
                        System.out.print(i+" ");
                    }
                    System.out.println( );
                }

//  for the pattern 12!!!
    for (int i=1;i<=5;i++){
        for (int j=1;j<=(5-i);j++){
            System.out.print(" ");
        }
        for (int j=i;j>=1;j--){
            System.out.print(j);
        }
        for (int j=2;j <=i;j++){
            System.out.print(j);
        }
        System.out.println( );
    }

//  for the pattern 13!!!

        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
           int s= 2*(4-i);
            for (int j=1;j<=s;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println( );

        }
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            int s=2*(4-i);
            for (int j=1;j<=s;j++){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println( );
        }


//  for the pattern 15!!!
for (int i=5;i>=1;i--){
    for (int j=i;j>=1;j--){
        System.out.print(" ");
    }
    for (int j=1;j<=5;j++){
        System.out.print("*");
    }
    System.out.println( );
}

//  for the pattern 15!!!
for (int i =1;i<=4;i++){
    for (int j=1;j<=4-i;j++){
        System.out.print("  ");
    }
    int star= i*2-1;
    for (int j=1;j<=star;j++){
        System.out.print("* ");
    }
    System.out.println( );
}
for (int i=3;i>=1;i--){
    for (int j=1;j<=4-i;j++){
        System.out.print("  ");
    }
    int star= i*2-1;
    for (int j=1;j<=star;j++){
        System.out.print("* ");
    }
    System.out.println( );
}




//            for the pattern 16!!!

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j==1|| i==j ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                if (j==1|| i==j ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                if (j==5||i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=i;j<=5;j++){
                if (j==5||i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println( );
        }




 //  for the pattern 17!!!
        for (int i=1 ;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){
                if (i==1||i==5||j==1||j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }


for (int i=1; i<=5;i++){
    for (int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for (int j=i;j>=1;j--){
        System.out.print(j +" ");
    }
    System.out.println( );
}


    }
}

public class patterns {
    public static void main(String[] args) {
        pattern25(5);

    }

    static void pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        for(int i = 1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1;i<=n;i++){
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        //upper half

        for(int i = 1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half

        for(int i=1;i<n;i++){
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        // k pattern
//*****
//****
//***
//**
//*
//**
//***
//****
//*****
        //upper half
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=1;i<n;i++){
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
//******
//*    *
//*    *
//*    *
//*    *
//******
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0 || j==0 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
    static void pattern10(int n){
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        int num =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
//    *
//   **
//  ***
// ****
//*****
        for (int i = 1; i <=n ; i++) {
            // printing spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern12(int n){
//        *****
//         ****
//          ***
//           **
//            *

        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern13(int n){
//    *
//   ***
//  *****
// *******
//*********
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //print stars

            for (int j = 1; j <=2*i-1 ; j++) {
                    System.out.print("*");
            }

            System.out.println();

        }
    }

    static void pattern14(int n){
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+ " ");
            }

            System.out.println();

        }
    }

    static void pattern15(int n){
//        1 2 3 4 5
//         2 3 4 5
//          3 4 5
//           4 5
//            5
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = i; j <=n ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
//    *****
//   *****
//  *****
// *****
//*****
        // RHOMBUS
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern17(int n){
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5

        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }

            //print decreasing numbers
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }

            //print increasing numbers
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");

            }

            System.out.println();

        }
    }

    static void pattern18(int n){
        // DIAMOND PATTERN
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
        //upper half
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = 1; i <n ; i++) {
            //print spaces
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <=(n-i)*2-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern19(int n){
//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *
        // upper half
        for (int i = 1; i <=n; i++) {
            //print left stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //print spaces
            for (int j = 1; j <=(n-i)*2 ; j++) {
                System.out.print(" ");
            }
            //print right stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half
        for (int i = 1; i <=n ; i++) {
            //print left stars
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }

            //print spaces
            for (int j = 1; j <=(2*i)-2 ; j++) {
                System.out.print(" ");
            }

            //print right stars
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern20(int n){

//        1 2 3 4 5
//         2 3 4 5
//          3 4 5
//           4 5
//            5
//           4 5
//          3 4 5
//         2 3 4 5
//        1 2 3 4 5

        //upper half
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            //print nums
            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        //lower half
        for (int i = 1; i <n ; i++) {
            //print spaces
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }

            //print nums
            for (int j = n-i; j <=n ; j++) {
                System.out.print(j+" ");
            }

            System.out.println();

        }
    }

    static void pattern21(int n){
//    *
//   * *
//  *   *
// *     *
//*********
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //stars print and also spaces in between
            for (int j = 1; j <=2*i-1 ; j++) {
                if(i==n||j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){

//*********
// *     *
//  *   *
//   * *
//    *
        for (int i = 1; i <=n ; i++) {

            //print spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }

            //to print stars and hallow spaces
            for (int j = 1; j <=2*(n-i+1)-1 ; j++) {
                if(i==1 || j==1 || j==2*(n-i+1)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern23(int n){
//    *
//   * *
//  *   *
// *     *
//*       *
// *     *
//  *   *
//   * *
//    *
        //upper half
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j==1 || j== 2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower half
        for (int i = 1; i <n ; i++) {
            //print spaces
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            
            //print stars
            for (int j = 1; j <=(n-i)*2-1 ; j++) {
                if(j==1 || j==(n-i)*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    static void pattern24(int n) {
//* * * * *
// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *
//* * * * *
        //upper half
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=n-i+1 ; j++) {
                if(i==1 || j==1 || j==n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        //lower half
        for (int i = 1; i < n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <=i+1; j++) {
                if(i==n-1||j==1 || j==i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    static void pattern25(int n){
//*       *
// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *
//*       *

        // upper half
        for (int i = 1; i <=n ; i++) {
            //print spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <=2*(n-i)+1 ; j++) {
                if(j==1 || j==2*(n-i)+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower half
        for (int i = 1; i <n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            //print stars

            for (int j = 1; j <=2*i+1 ; j++) {
                if(j==1 || j== 2*i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}

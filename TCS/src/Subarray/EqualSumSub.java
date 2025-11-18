package Subarray;

public class EqualSumSub {
    public static void main(String[]args){
        int arr[]={-1,3,0,3};
        int left =0 , right=0 , mid =-1;
        for(int i=0;i<arr.length;i++)
        {
            left=left+arr[i];
            right=0;
            for(int j=i+1;j<arr.length;j++)
            {
                right+=arr[j];
            }
            if(left==right) {
                mid=i+1;
                break;
            }
        }
        if(mid!=-1) {
            for(int i=0;i<mid;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            for(int i=mid;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        }
        else
            System.out.print("Not Possible");

    }
}

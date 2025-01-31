package practise;
import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        insertionsort.sort(arr,n);
        System.out.print("after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[],int n)
    {
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    
}

package practise;
import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the  elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        bubblesort.sort(arr,n);
        System.out.println("after sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                }
            }
        }
    }
    
}

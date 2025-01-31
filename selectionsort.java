
package practise;
import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        selectionsort.sort(arr,n);
        System.out.print("After sorting:");
         for(int i=0;i<n;i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
    public static void sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<n-1;j++)
            {
               if(arr[j]<arr[mini]){
                mini=j;
               }
            }
            int temp=arr[mini];
               arr[mini]=arr[i];
               arr[i]=temp;
        }
    }
    
}

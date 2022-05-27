package arrays;
import java.util.Scanner;
public class arrange {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of books");
        n= sc.nextInt();
        String names[]=new String[n];
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter the names of book you want to arrange");
        for(int i=0;i<n;i++){
            names[i]=sc1.nextLine();

        }
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.print("books in Sorted Order:");
        for (int i = 0; i <=n - 1; i++)
        {
            System.out.print(names[i] + ", ");
        }

    }
}


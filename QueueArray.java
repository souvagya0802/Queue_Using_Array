package ExceptionHandling;
import java.util.Scanner;

public class QueueArray {
    static int i, count, front, rear, items, max = 10;
    static int[] a = new int[10];

    void QueueArr() {
        front = -1;
        rear = -1;
    }

    static void insert() {
        if (rear == max) {
            System.out.println("Queue is full.");
        } else {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Insert element: ");
                items = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
            a[++rear] = items;
        }
    }

    static void delete() {
        if (rear == -1) {
            System.out.println("Queue is empty");
        } else {
            front = front + 1;
            items = a[front];
            System.out.println("Deleted elements from queue is: " + items);
        }
    }

    static void display() {
        System.out.println("Elements in queue are/is: ");
        for (i = front + 1; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        while(true){
            try{
                System.out.println("Option 1.Insert, 2.Delete, 3.Display, 4.Exit");
                Scanner sc1 = new Scanner(System.in);
                count = sc1.nextInt();
            }catch (Exception e){
                System.out.println(e);
            }
            if(count == 4){
                break;
            }else{
                switch(count){
                    case 1:
                        insert();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                }
            }
        }
    }
}

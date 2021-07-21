public class Stack {
    final int MAX = 100;
    int[] Stack = new int[MAX];
    int topTracker;

    //once class is used, topTracker instantiated to -1
    Stack(){
        topTracker = -1;
    }

    boolean isEmpty(){
        return (topTracker < 0);
    }

    boolean push(int x){
        if(topTracker >= (MAX - 1)){
            System.out.println("Stack overflow");
            return false;
        }
        Stack[++topTracker] = x;
        System.out.println(x + " was pushed onto stack");
        return true;
    }

    int pop(){
        if(topTracker < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        return Stack[topTracker--];
    }

    int peek(){
        if(topTracker < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        return Stack[topTracker];
    }


}

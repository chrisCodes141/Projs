public class Queue {
    //MAX size for array, last will always be in position 0
    private final int MAX = 100, last = 0;
    //newQueue
    private boolean newQueue = true, avoidPop = false;
    public int first;

    int[] queue = new int[MAX];

    public Queue(){
        first = 0;
    }

    boolean isEmpty(){
        return (first < 1);
    }
    int peekFirst(){
        return queue[first];
    }
    int peekIndex(int x){
        return queue[x];
    }
    int peekLast(){
        return queue[last];
    }

    //push will move every number forward by 1 then put new number where last is
    boolean push(int x){
        //Avoid popping queue[0] if que was emptied and being reused
        avoidPop = false;
        //New Queue, SKIPS out of bound check, for loop, and incrementing first
        if(newQueue){
            newQueue = false;
            queue[first] = x;
            System.out.println(x + " has been pushed in first");
            return true;
        }
        //Avoid Out Of Bound
        if(first >= (MAX - 1)){
            System.out.println("Queue overflow, no push");
            return false;
        }
        // Shifts each element 1 index up to allow for new element to be pushed
        for(int i = first + 1; i != 0; i--) {
            queue[i] = queue[i - 1];
        }
        //there's a new first
        first++;
        //push x into beginning of queue
        queue[last] = x;
        System.out.println(x + " has been pushed");

        return true;
    }


    //pop will show number at first, then go back 1 index to new first
    int pop(){
        if(avoidPop){
            System.out.print("push or create new queue, no pop..");
            return -1;
        }
        //avoid out of bound
        if(first < 0){
            newQueue = avoidPop = true;
            first = 0;
            System.out.print("queue underflow, no pop..");
            return -1;
        }
        return queue[first--];
    }
}

public class main {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println(q.isEmpty());

        for(int i = 0; i < 103; i++){
            q.push(i);
        }
        System.out.println(q.isEmpty());
        for(int i = 0; i < 103; i++){
            System.out.println(q.pop());
        }
        System.out.println(q.isEmpty());
        for(int i = 0; i < 103; i++){
            q.push(i);
        }
        for(int i = 0; i < 103; i++){
            System.out.println(q.pop());
        }
    }
}

public class main {
    public static void main(String[] args) {
        Stack st = new Stack();

        System.out.println(st.isEmpty());

        for(int i = 0; i < 101; i++)
            st.push(i);

        for(int i = 0; i < 101; i++)
            System.out.println(st.pop());

        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
    }

}

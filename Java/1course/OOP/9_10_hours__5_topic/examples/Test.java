import java.util.*;


public class Test {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.pop();

        while(!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        
    }    
}

import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char A[][] = {
                {'0', '1', '1', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '0', '0'},
        };
        System.out.println(maximalRectangle(A));
    }

    public static int maximalRectangle(char[][] matrix) {

        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length;
        int ans = 0;
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = matrix[0][i] - '0';

        for (int i = 0; i < m; i++) {
            if (i == 0) {

                ans = Math.max(ans, maximumAreaInHistogram(a));
                continue;
            }

            for (int j = 0; j < n; j++) {
                a[j] += matrix[i][j] - '0';
                if (matrix[i][j] == '0')
                    a[j] = 0;
            }
            ans = Math.max(ans, maximumAreaInHistogram(a));
        }
        return ans;

    }


    static int maximumAreaInHistogram(int h[]) {

        int n = h.length;

        Stack<Integer> st = new Stack();

        int l[] = new int[n];
        int r[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                l[i] = -1;
                st.push(i);
                continue;
            }
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();

            }
            int p = st.isEmpty() ? -1 : st.peek();

            l[i] = p;
            st.push(i);

        }
        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                r[i] = n;
                st.push(i);
                continue;
            }

            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();

            }

            int p = st.isEmpty() ? n : st.peek();

            r[i] = p;
            st.push(i);

        }


        int m = 0;

        for (int i = 0; i < n; i++) {
            m = Math.max(m, h[i] * (r[i] - l[i] - 1));
        }


        return m;

    }

}

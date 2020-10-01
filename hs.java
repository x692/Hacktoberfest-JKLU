public class MaxSlidingWindow_ {
public static void push(final Queue<Integer> q, final ArrayDeque<Integer> dq, final int value) {
    q.add(value);f (dq.isEmpty()) {
     
    final i   dq.add(value);
    } else {
        while (dq.peekLast() < value) {
            dq.pollLast();
            if (dq.isEmpty())
                break;
        }
        dq.addLast(value);
    }
}

private static void add(int value) {
}

public static void pop(final Queue<Integer> q, final ArrayDeque<Integer> dq) {
    final int qval = q.remove();
    if (qval == dq.peekFirst()) {
        dq.remove();
    }
}

public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    scanner.nextLine();
    final int[] elements_stack = new int[n];
    for (int i = 0; i < n; i++) {
        final int temp = scanner.nextInt();
        elements_stack[i] = temp;
    }
    scanner.nextLine();
    final int m = scanner.nextInt();

    final Queue<Integer> q = new LinkedList<Integer>();
    final ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

    for (int i = 0; i < m; i++) {
        final int val = elements_stack[i];
        push(q, dq, val);
    }
    System.out.print(dq.peek());
    for (int i = m; i < n; i++) {
        final int val = elements_stack[i];
        pop(q, dq);
        push(q, dq, val);

        System.out.print(" " + dq.peek());
    }

}
}

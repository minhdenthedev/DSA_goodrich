package mycollections;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> list = new SinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        list.addFirst(10);
        list.add(1, 11);
        list.removeLast();
        list.removeFirst();
        list.remove(5);
        list.set(0, 10);
        list.add(1, 4);
        list.add(list.size(), 100);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

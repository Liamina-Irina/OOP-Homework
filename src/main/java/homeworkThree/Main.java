package homeworkThree;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.addFirst(10);
        list.addFirst(2);
        list.addLast(11);
        list.addLast(1);
        list.addByIndex(25, 4);
        list.forEach(System.out::println);
        System.out.println("---------------------------------------");

        list.removeFirst();
        list.removeLast();
        list.removeByAt(25);
        list.forEach(System.out::println);
    }
}
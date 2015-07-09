package lab6;

public class TestLinkedList {

    /**
     * Main method - DO NOT CHANGE THIS CODE!!!!
     */
    public static void main(String[] args) {

        // Create a list for strings
        MyLinkedList<String> list = new MyLinkedList<String>();

        // Add elements to the list
        list.add("America"); // Add it to the list
        System.out.println("(1) " + list);

        list.add(0, "Canada"); // Add it to the beginning of the list
        System.out.println("(2) " + list);

        list.add("Russia"); // Add it to the end of the list
        System.out.println("(3) " + list);

        list.addLast("France"); // Add it to the end of the list
        System.out.println("(4) " + list);

        list.add(2, "Germany"); // Add it to the list at index 2
        System.out.println("(5) " + list);

        list.add(5, "Norway"); // Add it to the list at index 5
        System.out.println("(6) " + list);

        list.add(0, "Poland"); // Same as list.addFirst("Poland")
        System.out.println("(7) " + list);

        // Remove elements from the list
        list.remove(0); // Same as list.remove("Australia") in this case
        System.out.println("(8) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(9) " + list);

        list.remove(list.size() - 1); // Remove the last element
        System.out.println("(10) " + list);

        /* Below is the code to test methods that should be implemented in Lab 8*/
        String s = "Germany";
        if (list.contains(s)) {
            System.out.println("(11) The list contains " + s);
        } else {
            System.out.println("(11) The list does not contain " + s);
        }

        int pos = 4;
        s = list.get(pos);
        if (s != null) {
            System.out.println("(12) The list element at position " + pos + " is " + s);
        } else {
            System.out.println("(12) Invalid position");
        }

        s = "France";
        pos = list.indexOf(s);
        if (pos != -1) {
            System.out.println("(13) The list element " + s + " is at position " + pos);
        } else {
            System.out.println("(13) The list does not contain " + s);
        }

        list.addFirst("India"); // Add it to the end of the list
        System.out.println("(14) " + list);

        list.add(6, "America"); // Add it to the end of the list
        System.out.println("(15) " + list);

        s = "America";
        pos = list.lastIndexOf(s);
        if (pos != -1) {
            System.out.println("(16) The list element " + s + " occurs last at " + pos);
        } else {
            System.out.println("(16) The list does not contain " + s);
        }

        list.set(3, "China");
        System.out.println("(17) " + list);

    }

}

/*
outputs: 

run:
(1) [America]
(2) [Canada, America]
(3) [Canada, America, Russia]
(4) [Canada, America, Russia, France]
(5) [Canada, America, Germany, Russia, France]
(6) [Canada, America, Germany, Russia, France, Norway]
(7) [Poland, Canada, America, Germany, Russia, France, Norway]
(8) [Canada, America, Germany, Russia, France, Norway]
(9) [Canada, America, Russia, France, Norway]
(10) [Canada, America, Russia, France]
(11) The list does not contain Germany
(12) Invalid position
(13) The list element France is at position 3
(14) [India, Canada, America, Russia, France]
(15) [India, Canada, America, Russia, France, America]
(16) The list element America occurs last at 5
(17) [India, Canada, America, Russia, France, China]
BUILD SUCCESSFUL (total time: 0 seconds)

*/

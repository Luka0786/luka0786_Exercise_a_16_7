package Kap16Exercise7;

public class Exercise7
{
    /*
    Write a method called deleteBack that deletes the last value
    the value at the back of the list) and returns the deleted value.
    If the list is empty, throw a NoSuchElementException.
    */

    public static void main(String[] args)
    {
        LinkedIntListExercise7 list = new LinkedIntListExercise7();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("List before: " + list);
        System.out.println("The deleted value: " + list.deleteBack());
        System.out.println("The list after call of deleteback: " + list);
    }
}

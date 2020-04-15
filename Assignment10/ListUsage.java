package Assignment10;



public class ListUsage {
    public static void main(String[] args) {
        SListIterator<String> list = new SListIterator<>();
        list.insert(new SList.Node<String>("Ferrari"));
        list.insert(new SList.Node<String>("Mercedes"));
        list.insert(new SList.Node<>("Mclaren"));

        list.ToString();
        list.remove();
        list.ToString();

    }

}

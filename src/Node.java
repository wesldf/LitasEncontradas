public class Node {

    private Contact contato;
    private Node next;

    public Node(Contact contact) {
        this.contato = contact;
        this.next = null;
    }

    public Contact getContact() {
        return contato;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
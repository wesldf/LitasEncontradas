public class ContactList {

    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Contact searchContact(String nameOrPhone) {
        Node current = head;
        while (current != null) {
            if (current.getContact().getName().equals(nameOrPhone) || current.getContact().getPhoneNumber().equals(nameOrPhone)) {
                return current.getContact();
            }
            current = current.getNext();
        }
        return null;
    }

    public void removeContact(String nameOrPhone) {
        if (head == null) return;

        if (head.getContact().getName().equals(nameOrPhone) || head.getContact().getPhoneNumber().equals(nameOrPhone)) {
            head = head.getNext();
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getContact().getName().equals(nameOrPhone) || current.getNext().getContact().getPhoneNumber().equals(nameOrPhone)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void listContacts() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getContact());
            current = current.getNext();
        }
    }
}
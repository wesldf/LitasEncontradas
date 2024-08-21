import java.util.Scanner;

public class ContactManager {


    private ContactList contactList;

    public ContactManager() {
        this.contactList = new ContactList();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Sair");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    searchContact(scanner);
                    break;
                case 3:
                    removeContact(scanner);
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void addContact(Scanner scanner) {
        System.out.println("Digite o nome do contato:");
        String name = scanner.next();
        System.out.println("Digite o número de telefone do contato:");
        String phoneNumber = scanner.next();
        System.out.println("Digite o e-mail do contato:");
        String email = scanner.next();
        Contact contact = new Contact(name, phoneNumber, email);
        contactList.addContact(contact);
        System.out.println("Contato adicionado com sucesso!");
    }

    private void searchContact(Scanner scanner) {
        System.out.println("Digite o nome ou número de telefone do contato:");
        String nameOrPhone = scanner.next();
        Contact contact = contactList.searchContact(nameOrPhone);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    private void removeContact(Scanner scanner) {
        System.out.println("Digite o nome ou número de telefone do contato:");
        String nameOrPhone = scanner.next();
        contactList.removeContact(nameOrPhone);
        System.out.println("Contato removido com sucesso!");
    }

    private void listContacts() {
        contactList.listContacts();
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.run();
    }
}
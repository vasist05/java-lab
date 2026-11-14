
    class Book {
    public int bookId = 101;
    private double price = 500;
    protected String author = "Ravi";
    String title = "Java";

    public void display() {
        System.out.println(bookId);
        System.out.println(price);
        System.out.println(author);
        System.out.println(title);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}


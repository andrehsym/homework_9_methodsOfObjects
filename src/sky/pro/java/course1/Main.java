package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {

//ПРОСТОЙ УРОВЕНЬ

        Author kathy = new Author("Kathy", "Sierra");
        Book javaHeadFirst = new Book("Java Head First", 2010, kathy);

        Author joanne = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", 1999, joanne);

        Author chuck = new Author("Chuck", "Palahniuk");
        Book lullaby = new Book("Lullaby", 2002, chuck);

        Author chuckRe = new Author("Chuck", "Johnson");
        Book lullabyRe = new Book("Lullaby", 2010, chuck);

        System.out.println(javaHeadFirst);
        System.out.println(kathy);

        System.out.println();

        System.out.println(lullaby);
        System.out.println(chuck);

        System.out.println();

        System.out.println(lullaby.equals(lullabyRe));
        System.out.println(lullaby.hashCode()==lullabyRe.hashCode());

        System.out.println();

        System.out.println(chuck.equals(chuckRe));
        System.out.println(chuck.hashCode() == chuckRe.hashCode());

    }

}
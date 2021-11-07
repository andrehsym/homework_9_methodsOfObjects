package sky.pro.java.course1;

import java.util.Objects;

public class Author {
    private final String name;
    private final String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return this.secondName;
    }

//    @Override
//    public String toString() {
//        return "Имя автора: " + this.name + ". Фамилия автора: " + this.secondName;
//    }

    @Override
    public String toString() {
        return "Автор: {" +
                "Имя: '" + name + '\'' +
                ", фамилия '" + secondName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


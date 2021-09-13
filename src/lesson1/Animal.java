package lesson1;

    public abstract class Animal {

        public String getName() {
            return name;
        }

        protected String name;
        protected String color;
        protected  int age;

        public Animal(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public abstract String toString();
    }


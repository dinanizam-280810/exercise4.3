package main3;

public class Main3 {

    public static class UserDetails {

        String name, email;

        public UserDetails(String name, String email) {
            this.name = name;
            this.email = email;
        
        }
        @Override
        public String toString() {
            return name + "\n" + email;

        }
        }
     public static class Fruits {

        String name, color;
        protected double weight, price, quantity;

        public Fruits(String name) {
            this.name = name;

            System.out.println("Fruit constructor is invoked");
        }

        public void setweight(double weight) {
            this.weight = weight;
        }

        public double getweight() {
            return this.weight;
        }
     
        void calculateprice(){
            this.price=price;
        }
    }

    public static class Apple extends Fruits {

        public Apple(String name, double weight) {
            
            super(name);
            this.weight = weight;
            System.out.println("Apple constructor is invoked");
            System.out.println(this.name);
            System.out.println("weight is " + this.weight + " kg");
        }
        public double calculateprice(double price){
            this.price=10.00;
            System.out.println("Price for apple:RM "+this.price);
            return this.price;
        }
    }

    public static class Durian extends Fruits {

        public Durian(String name, String color, double weight) {
            super(name);
            this.color = color;

            this.weight = weight;
            System.out.println("Durian constructor is invoked");
            System.out.println(this.name + "." + "The color inside is " + this.color);

            System.out.println(this.name);
            System.out.println("weight is " + this.weight + " kg");
        }
       public double calculateprice(double price){
            this.price=20.00;
            System.out.println("Price for durian:RM "+this.price);
            return this.price;
        }
    }

    public static class watermelon extends Fruits {

        public watermelon(String name, String color, double weight) {
            super(name);
            this.name = name;
            this.color = color;

            this.weight = weight;
            System.out.println("Durian King constructor is invoked");
            System.out.println(this.name + "." + "The color is " + this.color);

            System.out.println(this.name + " weight is " + this.weight + " kg");
        }
           public double calculateprice(double price){
            this.price=10.00;
            System.out.println("Price for durian:RM "+this.price);
            return this.price;
        }
    }
    
        public static void main(String[] args) {

            UserDetails input1 = new UserDetails("Farhahdina", "Farhahdina@gmail.com");

            System.out.println(input1);
      Apple a = new Apple("Epal hijau", 2);

        System.out.println(a.name);

        System.out.println(a.weight + "\n");
        System.out.println("\nPrice:RM "+a.calculateprice(10.00));
        Durian b = new Durian("Durian King", "Yellow", 1);
        System.out.println(b.name);
        System.out.println(b.color);
        System.out.println(b.weight + "\n");
         System.out.println("\nPrice:RM "+b.calculateprice(20.00));
        watermelon c = new watermelon("watermelon", "green", 2);
        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.weight);
        System.out.println("\nPrice:RM "+c.calculateprice(10.00));
        }

    }


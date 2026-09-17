package OOP;

//public class OOP.Main {
//    public static void main(String[] args) {
//
//        String text = "my name is pamal pamal is my boyfried";
//
//        //split the string into words
//        String[] words = text.split(" ");
//
//        //loop through the words and map the word and its count
//        Map<String, Integer> wordCount = new HashMap<>();
//        for(String word : words){
//            if(wordCount.containsKey(word)){
//                wordCount.put(word, wordCount.get(word) + 1);
//            } else {
//                wordCount.put(word, 1);
//            }
//        }
//        System.out.println(wordCount);
//    }
//}

// Interface
interface Shape {
    void draw();
    double findArea();
}

// OOP.Circle class implementing OOP.Shape
class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing OOP.Circle");
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

// OOP.Rectangle class implementing OOP.Shape
class Rectangle implements Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing OOP.Rectangle");
    }

    @Override
    public double findArea() {
        return length * width;
    }
}

class Student {
    private final Shape shape;
    Student(Shape shape){
         this.shape = shape;
     }


     public void getArea(){
        shape.draw();
     }
}

// OOP.Main class
public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        //s1.draw();
        //System.out.println("OOP.Circle Area: " + s1.findArea());

        //s2.draw();
        //System.out.println("OOP.Rectangle Area: " + s2.findArea());

        Student c1 = new Student(s1);
        Student c2 = new Student(s2);
        c1.getArea();
        c2.getArea();
    }
}
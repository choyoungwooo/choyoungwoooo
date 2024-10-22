package oop1.ex;

public class RectengleOopMain {
    public static void main(String[] args) {
        Rectengle rectengle = new Rectengle();
        rectengle.width = 8;
        rectengle.height = 8;

        int area = rectengle.calculateArea();
        System.out.println("넓이 : "+area);

        int perimiter = rectengle.calculatePerimeter();
        System.out.println("둘레 : "+perimiter);

        boolean square = rectengle.isSquare();
        System.out.println("사각형 여부 : "+square);
    }
}

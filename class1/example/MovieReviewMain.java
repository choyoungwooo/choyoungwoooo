package class1.example;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "재밌음";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "패션왕";
        movieReview2.review = "재미없음";
        System.out.println("영화 제목 : "+movieReview1.title+" 영화 리뷰 : "+movieReview1.review);
        System.out.println("영화 제목 : "+movieReview2.title+" 영화 리뷰 : "+movieReview2.review);


    }
}

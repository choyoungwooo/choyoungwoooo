package class1.example;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[]reviews = new MovieReview[2];
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "재밌음";
        reviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "패션왕";
        movieReview2.review = "재미없음";

        reviews[1] = movieReview2;

        for(MovieReview review : reviews){
            System.out.println("영화 제목 : "+ review.title+" 영화 리뷰 : "+review.review);
        }


    }
}

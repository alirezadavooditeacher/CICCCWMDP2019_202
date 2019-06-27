package assignment3;

import java.util.ArrayList;
import java.util.List;

/**
 * The class Movie is started below. An instance of class Movie represents a film.
 * This class has the following three class variables:
 * - title, which is a String representing the title of the movie
 * - studio, which is a String representing the studio that made the movie
 * - rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)
 *
 * Movieクラスは以下の通りです。 Movieクラスのインスタンスは映画を表します。
 * このクラスには、以下の3つのクラス変数があります。
 * -  title。映画のタイトルを表すStringです。
 * -  studio、映画を制作したスタジオを表すString
 * -  rating、これは映画のレーティングを表す文字列（すなわちPG-13、Rなど）
 *
 * public class Movie {
 *  private String title;
 *  private String studio;
 *  private String rating;
 * // your code goes here
 * }
 *
 * Write a constructor for the class Movie, which takes a String representing the title of the movie,
 * a String representing the studio, and a String representing the rating as its arguments, and sets
 * the respective class variables to these values.
 *
 * ムービーのタイトルを表すString、スタジオを表すString、および評価を表すStringを引数として取り、
 * それぞれのクラス変数をこれらの値に設定するMovieクラスのコンストラクタを作成します。
 *
 * Write a second constructor for the class Movie, which takes a String representing the title of
 * the movie and a String representing the studio as its arguments, and sets the respective class
 * variables to these values, while the class variable rating is set to "PG".
 *
 * クラスMovieの2番目のコンストラクタを作成します。これは、ムービーのタイトルを表すStringとスタジオを表すStringを引数として取り、
 * それぞれのクラス変数をこれらの値に設定します。一方、クラス変数ratingは "PG"に設定されます。
 *
 * Write a method getPG, which takes an array of base type Movie as its argument,
 * and returns a new array of only those movies in the input array with a rating of "PG".
 * You may assume the input array is full of Movie instances. The returned array need not be full.
 *
 * getPGメソッドを作成します。このメソッドは引数としてMovieタイプの基本配列を取り、
 * 評価が "PG"の入力配列内のムービーのみの新しい配列を返します。
 * あなたは入力配列がMovieインスタンスでいっぱいであると仮定するかもしれません。
 * 返される配列はいっぱいである必要はありません。
 *
 * Write a piece of code that creates an instance of the class Movie with the title “Casino Royale”,
 * the studio “Eon Productions”, and the rating “PG-13”.
 *
 * タイトルが "Casino Royale"、スタジオが "Eon Productions"、
 * 評価が "PG-13"のMovieクラスのインスタンスを作成するコードを作成します。
 */

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }


    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public static String getPG(List<String> movielist) {
        //if文でPGのものだけを新しいリストに入れて返す
        if (movielist.get(2) == "PG") {
            System.out.println(movielist);
        }
        return "";
    }

    // receive list for getPG
    static class MovieList {
        private List<String> lst;

        public MovieList(){
            this.lst = new ArrayList<String>();
        }
        public List<String> getList(){
            return new ArrayList<String>(lst);
        }
        public void setList(List<String> lst){
            this.lst = lst;
        }
    }

    public static void main(String[] arge) {
        Movie m1 = new Movie("Done Of The Dead", "Strike Entertainment", "R");
        Movie m2 = new Movie("Minions", "Illumination");
        Movie m3 = new Movie("Casino Royale", "Eon Productions", "PG-13");

        MovieList mr1 = new MovieList();
        List<String> l1 = mr1.getList();
        l1.add(m1.getTitle());
        l1.add(m1.getStudio());
        l1.add(m1.getRating());
        System.out.print(getPG((List<String>) l1));

        MovieList mr2 = new MovieList();
        List<String> l2 = mr2.getList();
        l2.add(m2.getTitle());
        l2.add(m2.getStudio());
        l2.add(m2.getRating());
        System.out.print(getPG((List<String>) l2));

        MovieList mr3 = new MovieList();
        List<String> l3 = mr3.getList();
        l3.add(m3.getTitle());
        l3.add(m3.getStudio());
        l3.add(m3.getRating());
        System.out.print(getPG((List<String>) l3));
    }
}

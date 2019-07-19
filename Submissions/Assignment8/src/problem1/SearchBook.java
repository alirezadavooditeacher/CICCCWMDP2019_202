package problem1;

public class SearchBook {

    public BookResult search(Book book){
        int pagesWithImages = 0;
        int pageCount = 0;
        for ( Page pa : book){
            if(pa.hasImage()){
                pagesWithImages += 1;
            }
            pageCount += 1;
        }
        return new BookResult(pagesWithImages, pageCount % 2 == 0);
    }
}

package app;

import app.entity.Book;
import app.entity.Page;

public class SearchBook {

    public SearchBookResult search(Book book) {
        int pagesWithImages = 0;
        int pageCount = 0;
        for (Page el: book) {
            if (el.isHasImage()) {
                pagesWithImages += 1;
            }
            pageCount += 1;
        }

        return new SearchBookResult(pagesWithImages, pageCount % 2 == 0);
    }
}

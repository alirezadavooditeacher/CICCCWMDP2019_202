package Problem1;

import Problem1.Models.Book;

import java.util.HashMap;

public class BookMapper extends Book implements Mappable {

    public BookMapper(String author, String title, int year){
        super(author, title, year);
    }

    @Override
    public HashMap<String, String> createMap() {
        HashMap<String, String > bookMap = new HashMap<>();
        bookMap.put("Author", this.getAuthor());
        bookMap.put("Title", this.getTitle());
        bookMap.put("Year", Integer.toString(this.getYear()));
        return bookMap;
    }
}

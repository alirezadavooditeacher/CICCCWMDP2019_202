package problem1;

public class BookResult {
    private int numberOfPagesWithImages;
    private boolean isEvenNumber;

    public BookResult(int numberOfPagesWithImages, boolean isEvenNumber) {
        this.numberOfPagesWithImages = numberOfPagesWithImages;
        this.isEvenNumber = isEvenNumber;
    }

    public int getNumberOfPagesWithImages() {
        return numberOfPagesWithImages;
    }

    public void setNumberOfPagesWithImages(int numberOfPagesWithImages) {
        this.numberOfPagesWithImages = numberOfPagesWithImages;
    }

    public boolean isEvenNumber() {
        return isEvenNumber;
    }

    public void setEvenNumber(boolean evenNumber) {
        isEvenNumber = evenNumber;
    }
}

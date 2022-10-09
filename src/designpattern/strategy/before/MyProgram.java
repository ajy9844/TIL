package designpattern.strategy.before;

public class MyProgram {

    private SearchButton searchButton = new SearchButton(this);

    public Mode mode = Mode.ALL;

    public void setModeAll() {
        this.mode = Mode.ALL;
    }

    public void setModeImage() {
        this.mode = Mode.IMAGE;
    }

    public void setModeNews() {
        this.mode = Mode.NEWS;
    }

    public void setModeMap() {
        this.mode = Mode.MAP;
    }
}

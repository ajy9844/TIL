package designpattern.strategy.after;

public class MyProgram {

    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll()); // 모드를 바꿀 때마다 객체 생성? 싱글턴을 사용해보면 어떨까!
    }

    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }

    public void setModeNews() {
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }

    public void setModeMap() {
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void testProgram() {
        searchButton.onClick(); // "SEARCH ALL" 출력
        setModeImage();         // 이미지검색 모드로
        searchButton.onClick(); // "SEARCH IMAGE" 출력
        setModeNews();          // 뉴스검색 모드로
        searchButton.onClick(); // "SEARCH NEWS" 출력
        setModeMap();           // 지도검색 모드로
        searchButton.onClick(); // "SEARCH MAP" 출력
    }
}

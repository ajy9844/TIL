package designpattern.strategy.before;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram myProgram) {
        this.myProgram = myProgram;
    }

    public void onClick() {
     if (myProgram.mode == Mode.ALL) {
         System.out.println("SEARCH ALL");
         // 전체검색하는 코드
         // ...
         // ...
     } else if (myProgram.mode == Mode.IMAGE) {
         System.out.println("SEARCH IMAGE");
         // 이미지검색하는 코드
         // ...
         // ...
     } else if (myProgram.mode == Mode.NEWS) {
         System.out.println("SEARCH NEWS");
         // 뉴스검색하는 코드
         // ...
         // ...
     } else if (myProgram.mode == Mode.MAP) {
         // 지도검색하는 코드
         // ...
         // ...
     }
    }
}

package designpattern.adapter.search;

public interface FindAlgorithm {
    void find(boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm {
    public void find(boolean global) {
        System.out.println("find movie" + (global ? " globally" : ""));
        // 동영상검색하는 코드
        // ...
        // ...
    }
}

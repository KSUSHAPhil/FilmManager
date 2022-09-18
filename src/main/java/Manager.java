public class Manager {
    private String[] movies = new String[0];
    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public int getMovies() {
        return movies.length;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        String[] resultLength;
        int index = 0;
        if (limit < movies.length) {
            resultLength = new String[limit];
        } else {
            resultLength = new String[movies.length];
        }
        for (int i = 0; i < resultLength.length; i++) {
            index = movies.length - 1 - i;
            resultLength[i] = movies[index];
        }
        return resultLength;
    }
}

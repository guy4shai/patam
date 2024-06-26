package test;

import java.util.Arrays;
import java.util.Objects;

public class Word {

    private Tile[] tiles[];
    private int row;
    private int col;
    private boolean isVertical;

    public Word(int row, int col, boolean isVertical) {
        this.tiles = tiles;
        this.row = row;
        this.col = col;
        this.isVertical = isVertical;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isVertical() {
        return isVertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return row == word.row && col == word.col && isVertical == word.isVertical && Objects.deepEquals(tiles, word.tiles);
    }

    @Override
    public String toString() {
        return "Word{" +
                "tiles=" + Arrays.toString(tiles) +
                ", row=" + row +
                ", col=" + col +
                ", isVertical=" + isVertical +
                '}';
    }
}

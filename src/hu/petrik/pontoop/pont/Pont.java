package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double ketPontTavolsag (Pont b) {
        int xtengelyTavolsag = this.x-b.x;
        int ytengelyTavolsag = this.y-b.y;

        return Math.sqrt(Math.pow(xtengelyTavolsag, 2) + Math.pow(ytengelyTavolsag, 2));
    }
    public String elhelyezkedes() {
        if (this.x>= 0 && this.y>=0) {
            return "jobb felsül";
        }else if (this.x< 0 && this.y>=0) {
            return "bal felül";
        }else if (this.x< 0 && this.y<0) {
            return "bal alul";
        }else{
            return "jobb alul";
        }
    }
}

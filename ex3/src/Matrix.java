/**
 * Created by digibrose on 06/11/2014.
 */
public class Matrix {

    public int[][] twod;
    private int A1;
    private int A2;

    public Matrix(int A1, int A2){

        this.twod = new int[A1][A2];
        this.A1 = A1;
        this.A2 = A2;
        for (int i=0; i < A1; i++) {
            for (int j=0; j<A2; j++) {
                this.twod[i][j] = 1;
            }
        }

    }

    public void setElement(int A1, int A2, int val) {

        this.twod[A1][A2] = val;
    }

    public void setRow(int A1, String Input) {

        int l1 = Input.length();

        if (l1 != this.A2) {
            return;
        }
        else {
        for (int i=0; i<this.A2; i++) {
            this.twod[A1][i] = Character.getNumericValue(Input.charAt(i));
        }
        }

    }

    public void setColumn(int A2, String Input) {

        int l1 = Input.length();

        if (l1 != this.A1) {
            return;
        }
        else {
            for (int i=0; i<this.A1; i++) {
                this.twod[i][A2] = Character.getNumericValue(Input.charAt(i));
            }
        }
    }

    public String toString() {
        String OutString = "";


        for (int i=0; i < this.A1; i++) {
            for (int j=0; j < this.A2; j++) {
                if (i==0 && j==0) {
                    OutString = "[" + this.twod[i][j];
                }
                else {
                    OutString = OutString + "," + this.twod[i][j];
                }
            }
            OutString = OutString + ";";
        }
        OutString = OutString + "]";
        return OutString;

    }


}

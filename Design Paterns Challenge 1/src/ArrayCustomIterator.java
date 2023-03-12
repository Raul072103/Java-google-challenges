public class ArrayCustomIterator {

    private int[] arr;
    private int pos = 0;

    public ArrayCustomIterator(int[] arr){
        this.arr = arr;
    }

    public boolean hasNext(){
        if(this.pos != arr.length ){
            this.pos++;
            return true;
        }
        else
            return false;
    }

    public int next() {
        return arr[this.pos-1];
    }
}



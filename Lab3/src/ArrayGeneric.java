public class ArrayGeneric<T> {
     private T[] array; 

    public ArrayGeneric(T[] array) {
        this.array = array;
    }

    public T[] Array() {
        return array;
    }

    public T FirstName() {
        if (this.array.length == 0) {
            return null;
        }
        return this.array[0];
    }

    public T LastName() {
        if (this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }
}

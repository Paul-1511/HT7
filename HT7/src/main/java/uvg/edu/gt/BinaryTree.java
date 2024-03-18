package uvg.edu.gt;
import java.util.*;
class BinaryTree<E extends Comparable<E>> {
    E value;
    BinaryTree<E> left;
    BinaryTree<E> right;

    public BinaryTree(E value) {
        this.value = value;
    }

    public void insert(E value) {
        if (value.compareTo(this.value) < 0) {
            if (left == null) {
                left = new BinaryTree<>(value);
            } else {
                left.insert(value);
            }
        } else if (value.compareTo(this.value) > 0) {
            if (right == null) {
                right = new BinaryTree<>(value);
            } else {
                right.insert(value);
            }
        }
    }

    public E search(E value) {
        if (value.compareTo(this.value) == 0) {
            return this.value;
        } else if (value.compareTo(this.value) < 0 && left != null) {
            return left.search(value);
        } else if (value.compareTo(this.value) > 0 && right != null) {
            return right.search(value);
        }
        return null;
    }
}
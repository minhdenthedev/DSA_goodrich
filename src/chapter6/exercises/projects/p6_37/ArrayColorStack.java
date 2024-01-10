package chapter6.exercises.projects.p6_37;

/**
 * @author hminh
 * A dynamic two-headed stack.
 * @param <E>   generic type
 */
public class ArrayColorStack<E> implements DoubleColorStack<E> {
    private E[] data;
    private int redSize = 0;
    private int blueSize = 0;
    private int redCap = 1;
    private int blueCap = 1;
    private int redTop = 1;
    private int blueTop = 0;
    public ArrayColorStack() {
        data = (E[]) new Object[2];
    }
    @Override
    public void redPush(E e) {
        if (redSize == redCap) {
            expandRed();
        }
        data[--redTop] = e;
        redSize++;
    }

    private void expandRed() {
        E[] newData = (E[]) new Object[data.length + redCap * 2];
        redCap *= 2;
        redTop = redCap - redSize;
        blueTop = redCap + blueSize - 1;
        System.arraycopy(data, 0, newData, redTop, redSize + blueSize);
        data = newData;
    }

    private void expandBlue() {
        E[] newData = (E[]) new Object[data.length + blueCap * 2];
        blueCap *= 2;
        System.arraycopy(data, redTop, newData, redTop, redSize + blueSize);
        data = newData;
    }

    @Override
    public void bluePush(E e) {
        if (blueSize == blueCap) {
            expandBlue();
        }
        data[++blueTop] = e;
        blueSize++;
    }

    @Override
    public E redPop() {
        if (isRedEmpty()) return null;
        E answer = data[redTop++];
        redSize--;
        data[redTop - 1] = null;
        return answer;
    }

    @Override
    public E bluePop() {
        if (isBlueEmpty()) return null;
        E answer = data[blueTop--];
        blueSize--;
        data[blueTop + 1] = null;
        return answer;
    }

    @Override
    public int redSize() {
        return redSize;
    }

    @Override
    public int blueSize() {
        return blueSize;
    }

    @Override
    public boolean isRedEmpty() {
        return redSize == 0;
    }

    @Override
    public boolean isBlueEmpty() {
        return blueSize == 0;
    }

    @Override
    public E redTop() {
        if (isRedEmpty()) return null;
        return data[redTop];
    }

    @Override
    public E blueTop() {
        if (isBlueEmpty()) return null;
        return data[blueTop];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = redTop; i <= blueTop; i++) {
            if (i != blueTop) {
                sb.append(data[i]);
                sb.append(", ");
            } else {
                sb.append(data[i]);
            }
        }
        sb.append("]");

        return sb.toString();
    }
}

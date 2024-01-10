package chapter6.exercises.projects.p6_37;

public interface DoubleColorStack<E> {
    void redPush(E e);
    void bluePush(E e);
    E redPop();
    E bluePop();
    int redSize();
    int blueSize();
    boolean isRedEmpty();
    boolean isBlueEmpty();
    E redTop();
    E blueTop();
}

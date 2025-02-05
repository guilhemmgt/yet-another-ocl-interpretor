package oclCollections;

@FunctionalInterface
public interface TwoArgExp<T1, T2, R> {
    R apply(T1 t1, T2 t2);

}


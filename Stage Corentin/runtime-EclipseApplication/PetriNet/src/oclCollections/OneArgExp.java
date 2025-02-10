package oclCollections;

@FunctionalInterface
public interface OneArgExp<T, R> {
    R apply(T t);

}

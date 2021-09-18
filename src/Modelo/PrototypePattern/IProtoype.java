package Modelo.PrototypePattern;

public interface IProtoype<T> {
    T clone();
    T deepClone();
}

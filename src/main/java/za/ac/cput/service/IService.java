package za.ac.cput.service;

public interface IService <Type, Id> {

    Type create (Type type);
    Type read (Id id);
    Type update (Type type);
    boolean delete (Id id);

}

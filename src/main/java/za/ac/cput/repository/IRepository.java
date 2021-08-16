package za.ac.cput.repository;

public interface IRepository <entityType, entityID>{

    entityType create (entityType t);
    entityType read (entityID id);
    entityType update (entityType t);
    boolean delete (entityID id);

}

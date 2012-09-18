package com.tournament;

import java.util.List;

public class DbProvider<T> extends Db4oHelper {
    public Class<T> persistentClass;

    public DbProvider( Class<T> persistentClass, android.content.Context ctx ) {
        super( ctx );
        this.persistentClass = persistentClass;
    }

    public void store( T obj ) {
         db().store( obj );
    }

    public void delete( T obj ) {
         db().delete( obj );
    }

    public List<T> findAll() {
        return db().query( persistentClass );
    }
    
    public void listResult(List<T> result){
        for (Object o : result) {
            System.out.println(o);
        }
    }
}

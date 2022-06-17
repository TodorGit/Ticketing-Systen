package pkg;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkg.Scheduletable;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-06-14T23:08:05")
@StaticMetamodel(Stations.class)
public class Stations_ { 

    public static volatile SingularAttribute<Stations, Integer> stZone;
    public static volatile SingularAttribute<Stations, Integer> stid;
    public static volatile CollectionAttribute<Stations, Scheduletable> scheduletableCollection;
    public static volatile SingularAttribute<Stations, String> stname;

}
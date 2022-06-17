package pkg;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkg.Stations;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-06-14T23:08:05")
@StaticMetamodel(Scheduletable.class)
public class Scheduletable_ { 

    public static volatile SingularAttribute<Scheduletable, Integer> schid;
    public static volatile SingularAttribute<Scheduletable, Stations> fkstation;
    public static volatile SingularAttribute<Scheduletable, Date> arrivalTime;

}
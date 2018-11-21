package deliver.database.interfaces;

import java.lang.reflect.Field;

import static deliver.database.controllers.HelperFunctions.deserialize;
import static deliver.database.controllers.HelperFunctions.getJsonById;
import static deliver.database.controllers.HelperFunctions.getObjects;

public abstract class Savable {
    public long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    final public String recieveFilename() {
        String[] reference = (this.getClass() + "").split("\\.");
        String className = reference[reference.length - 1];
        return className;
    }

    public Object get(Savable object) {
        Class<?> aClass = this.getClass();

        String filename = object.recieveFilename();

        try {
            Field f = aClass.getDeclaredField(filename.toLowerCase()+"Id");
            f.setAccessible(true);
            long fieldId = (long) f.get(this);

            return deserialize(getJsonById(fieldId, getObjects(object.getClass())), object.getClass());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}

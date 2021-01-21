import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Singleton {
    //Se necesita un constructor vacio
    private Singleton() {}
    public String str;
    //Una instancia para poder comparar si esta inicializada o no
    private static Singleton instance;
    
    static Singleton getSingleInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    
}

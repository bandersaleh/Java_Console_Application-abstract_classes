import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.ArrayList;
import static java.lang.System.out;

// New Class
public class Player {

    // Fields
    private String Name;
    private int Number;

    // Constructors
    public Player(String playerName, int playerNumber){
        this.Name = playerName;
        this.Number = playerNumber;
    }

    // Properties
    public String playerName() {
        return Name;
    }
    public int playerNumber() {
        return Number;
    }




}
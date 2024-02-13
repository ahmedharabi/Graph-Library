import java.util.ArrayList;

public class Vertex<T>{

    //attributes
    private T data;
    private ArrayList<Vertex<T>> neighbours;

    //constructor
    public Vertex(T data){
        this.data=data;
        neighbours=new ArrayList<>();
    }



    //operations;
    public T value(){
        return data;
    }

    public void updateValue(T data){
        this.data=data;
    }
    public int degree(){
        return neighbours.size();
    }
    public void addNeighbour(Vertex V){
        neighbours.add(V);
    }

}
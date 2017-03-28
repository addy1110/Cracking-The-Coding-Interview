package main.java.edu.nyu.algorithms.graph;

import java.util.ArrayList;
import java.util.List;
import static main.java.edu.nyu.algorithms.graph.Color.NONE;

/**
 * Created by ADDY on 28/03/17.
 */
public class Vertex<T> {

    private static final long NILL = -1;
    private static final int NOT_DISCOVERED = -1;
    private static final int NOT_FINISHED = -1;

    private long id;
    private Color color = NONE;
    private long predecessor = NILL;
    private int discover = NOT_DISCOVERED;
    private int finish = NOT_FINISHED;

    private List<Edge<T>> edges;
    private List<Vertex<T>> adjacentVertex;

    Vertex(Long id){

        this.edges = new ArrayList<>();
        this.adjacentVertex = new ArrayList<>();
        this.id = id;
        this.color = NONE;
        this.predecessor = NILL;
        this.discover = NOT_DISCOVERED;
        this.finish = NOT_FINISHED;
    }

    public long getId(){
        return this.id;
    }

    public Color getColor(){
        return this.color;
    }

    public long getPredecessor(){
        return this.predecessor;
    }

    public long getDiscover(){
        return this.discover;
    }

    public long getFinish(){
        return this.finish;
    }

    public List<Vertex<T>> getAdjacentVertexes(){
        return adjacentVertex;
    }

    public List<Edge<T>> getEdges(){
        return edges;
    }

    public int getDegree(){
        return edges.size();
    }

    public void addAdjacentVertex(Edge<T> e, Vertex<T> v){
        this.edges.add(e);
        this.adjacentVertex.add(v);
    }

    @Override
    public String toString(){
        return "Vertex: "+getId()+" color- "+getColor()+" predecessor- "+getPredecessor()+
                "discover- "+getDiscover()+" finish- "+getFinish();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (int) (predecessor ^ (predecessor >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        return (this.getId() == other.getId() && this.getColor() == other.getColor() &&
                this.getPredecessor() == other.getPredecessor() &&
                this.getDiscover() == other.getDiscover() && this.getFinish() == other.getFinish());

    }


}

package main.java.edu.nyu.algorithms.graph;

/**
 * Created by ADDY on 28/03/17.
 */
public class Edge<T> {

    private boolean isDirected = false;
    private Vertex<T> leftVertex;
    private Vertex<T> rightVertex;
    private int weight;

    Edge(Vertex<T> leftVertex, Vertex<T> rightVertex){
        this.leftVertex = leftVertex;
        this.rightVertex = rightVertex;
    }

    Edge(Vertex<T> leftVertex, Vertex<T> rightVertex,boolean isDirected,int weight){
        this.leftVertex = leftVertex;
        this.rightVertex = rightVertex;
        this.weight = weight;
        this.isDirected = isDirected;
    }

    Edge(Vertex<T> leftVertex, Vertex<T> rightVertex,boolean isDirected){
        this.leftVertex = leftVertex;
        this.rightVertex = rightVertex;
        this.isDirected = isDirected;
    }

    Vertex<T> getLeftVertex(){
        return leftVertex;
    }

    Vertex<T> getRightVertex(){
        return rightVertex;
    }

    int getWeight(){
        return weight;
    }

    public boolean isDirected(){
        return isDirected;
    }

    public boolean isIncident(Vertex v){
        return (v == this.getLeftVertex()) || (v == this.getRightVertex());
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((leftVertex == null) ? 0 : leftVertex.hashCode());
        result = prime * result + ((rightVertex == null) ? 0 : rightVertex.hashCode());
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
        Edge other = (Edge) obj;
        if (getLeftVertex() == null) {
            if (other.getLeftVertex() != null)
                return false;
        } else if (!getLeftVertex().equals(other.getLeftVertex()))
            return false;
        if (getRightVertex() == null) {
            if (other.getRightVertex() != null)
                return false;
        } else if (!getRightVertex().equals(other.getRightVertex()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(getLeftVertex())+"---------"+String.valueOf(getRightVertex()+" "+getWeight());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import graph_t1.Edge;
import graph_t1.Graph;
import graph_t1.GraphLinked;
import graph_t1.InvalidVertexException;
import graph_t1.Vertex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author patricia.macedo
 */
public class UniversityNetwork {

    private Graph<Person, Relationship> network;

    public UniversityNetwork() {
        network = new GraphLinked<>();
    }

    private Vertex<Person> findPerson(int id) {
        for (Vertex<Person> v : network.vertices()) {
            if (v.element().getId() == id) {
                return v;
            }
        }
        return null;
    }



}

package DSA.Graphs;
import java.util.*;

//practise dfs,bfs,all paths
public class class4 {
    static class Edge{
        int src,dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>(); 
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void bfs(ArrayList<Edge> graph[],int V,boolean[] vis,int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(q.size()!=0){
            int el = q.remove();
            if(vis[el] == false){
            System.out.print(el+" ");
            vis[el]  = true;

            for(int i=0;i<graph[el].size();i++){
                Edge e = graph[el].get(i);
                q.add(e.dest);
            }
            }
           
        }
    }

    public static void dfs(ArrayList<Edge> graph[], boolean[] vis , int curr){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, vis, e.dest);
            }
        }


    }
    public static void printallpath(ArrayList<Edge> graph[],boolean vis[],int src , int tar,String path){
        if(src == tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(vis[e.dest] == false){
                vis[src] = true;
                printallpath(graph, vis, e.dest, tar, path+e.dest);
                vis[src] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);

        boolean[] vis = new boolean[V];
        // for(int i=0;i<V;i++){
        //     if(vis[i] == false){
        //         bfs(graph,V,vis,i);
        //     }
        // }

        // for(int i=0;i<V;i++){
        //     if(vis[i] == false){
        //         dfs(graph,vis,i);
        //     }
        // }


        int src =0;
        int tar = 5;
        printallpath(graph,vis,src,tar,"0");

        
        

    }
}

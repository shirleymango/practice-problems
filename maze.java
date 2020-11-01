//Problem Description in README
import java.util.*;

public class maze {
    public static boolean hasExit(String[] maze) {
    //finding Kate's starting position
    int startX = -1; int startY = -1;
    boolean kateAlreadyFound = false;
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[i].length(); j++) {
        if(maze[i].charAt(j) == 'k' && !kateAlreadyFound) {
          startY = i; startX = j;
          kateAlreadyFound = true;
        }
        else if (maze[i].charAt(j) == 'k' && kateAlreadyFound) {
          throw new RuntimeException();
        }
      }
    }
        
    LinkedList<String> toVisit = new LinkedList<String>();
    ArrayList<String> hasBeenVisited = new ArrayList<String>();
    toVisit.add(startX + "," + startY);
        
    while (!toVisit.isEmpty()) {
      String s = toVisit.poll();
      int indexOfComma = s.indexOf(',');
      int x = Integer.parseInt(s.substring(0, indexOfComma));
      int y = Integer.parseInt(s.substring(indexOfComma + 1));
      
      //check to is if this is an exit (on the edge of the maze)
      if (x == 0 || x == maze[y].length() - 1 || y == 0 || y == maze.length - 1) {
        return true;
      }
      else {
        //if the maze is not rectangular
        if (y > 0 && maze[y - 1].length() - 1 < x) {
          return true;
        }
        if (y < maze.length - 1 && maze[y + 1].length() - 1 < x) {
          return true;
        }
      }
          
      //left
      if (x > 0 && maze[y].charAt(x - 1) == ' ') {
        String temp = (x - 1) + "," + y;
        if (!hasBeenVisited.contains(temp)) {
          toVisit.add(temp);
        }
      }
      //right
      if (x < maze[y].length() - 1 && maze[y].charAt(x + 1) == ' ') {
        String temp = (x + 1) + "," + y;
        if (!hasBeenVisited.contains(temp)) {
          toVisit.add(temp);
        }
      }
      //up
      if (y > 0 && x < maze[y - 1].length() && maze[y - 1].charAt(x) == ' ') {
        String temp = x + "," + (y - 1);
        if (!hasBeenVisited.contains(temp)) {
          toVisit.add(temp);
        }
      }
      //down
      if (y < maze.length - 1 && x < maze[y + 1].length() && maze[y + 1].charAt(x) == ' ') {
        String temp = x + "," + (y + 1);
        if (!hasBeenVisited.contains(temp)) {
          toVisit.add(temp);
        }
      }
          
      //update hasBeenVisited
      hasBeenVisited.add(s);
    }
        return false;
    }
}

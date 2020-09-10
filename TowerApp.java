package week03;

public class TowerApp{
    public static void main (String args[]){
        Tower t = new Tower();
        t.add('G');
        System.out.println(t.isEmpty());
        System.out.println(t.toString());
            System.out.println(t.height());
    }
}

package hs.kr.study.beans;

public class BaseBall implements Sports{
    String name;
    int player;
    public String getName(String name){
        this.name = name;
    }
    public int getPlayer(int player){
        this.player = player;
    }
}

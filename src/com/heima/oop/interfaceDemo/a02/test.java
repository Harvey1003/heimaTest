package com.heima.oop.interfaceDemo.a02;


public class test {
    public static void main(String[] args) {
        basketballCoach bc = new basketballCoach("ydd", 42);
        bc.teachar();
        basketballSportman bs = new basketballSportman("lcr", 24);
        bs.Study();
        pingpongCoach pc = new pingpongCoach();
        pc.talkEnglish();
        pc.teachar();
        pingpongSportman ps = new pingpongSportman();
        ps.talkEnglish();
        ps.Study();


    }
}

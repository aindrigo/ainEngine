package net.aindrigo.ainEngine.test;

import net.aindrigo.ainEngine.main.Engine;
/**
 * @author aindrigo
 */
public class Tester {

    public Tester(){

    }

    public void test(){
        Engine e = new Engine("TEST ENV");
        e.startRendering();
    }
}

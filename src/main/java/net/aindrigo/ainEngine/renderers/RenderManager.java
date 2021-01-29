package net.aindrigo.ainEngine.renderers;

import java.util.ArrayList;
/**
 * @author aindrigo
 */
public class RenderManager {
    public ArrayList<BaseRenderer> renderers = new ArrayList<>();
    public RenderManager(){

    }

    public void start(){
        for(BaseRenderer r:renderers){
            r.start();
        }
    }
    public void update(){
        for(BaseRenderer r:renderers){
            r.update();
        }
    }
}

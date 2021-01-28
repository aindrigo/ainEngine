package net.aindrigo.ainEngine.renderers;

import java.util.ArrayList;

public class RenderManager {
    public ArrayList<BaseRenderer> renderers = new ArrayList<>();
    public RenderManager(){

    }


    public void update(){
        for(BaseRenderer r:renderers){
            r.update();
        }
    }
}

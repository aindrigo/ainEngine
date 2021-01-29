package net.aindrigo.ainEngine.renderers;

import net.aindrigo.ainEngine.main.Engine;
/**
 * @author aindrigo
 */
public class BaseRenderer {
    public Engine e;
    public BaseRenderer(Engine e){
        this.e = e;
        e.renderManager.renderers.add(this);
    }

    public void update(){};
    public void start(){};
}

package net.aindrigo.ainEngine.main;

import net.aindrigo.ainEngine.renderers.RenderManager;
import net.aindrigo.ainEngine.renderers.WindowRenderer;

import java.awt.*;
/**
 * @author aindrigo
 */
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;

public class Engine {
    public RenderManager renderManager = new RenderManager();
    private String windowTitle;
    private boolean shouldRender = false;
    private WindowRenderer windowRenderer;
    public Engine(String windowTitle){
        this.windowTitle = windowTitle;
        this.windowRenderer = new WindowRenderer(this);
    }
    public void startRendering(){
        renderManager.start();
        this.shouldRender = true;
        this.loop();
    }

    public boolean shouldRender() {
        return shouldRender;
    }

    private void loop(){
        while(shouldRender){
            shouldRender = !glfwWindowShouldClose(windowRenderer.window);
            renderManager.update();
        }
    }

    public String getWindowTitle() {
        return windowTitle;
    }
}

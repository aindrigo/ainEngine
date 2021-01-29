package net.aindrigo.ainEngine.renderers;

import net.aindrigo.ainEngine.main.Engine;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import static org.lwjgl.opengl.GL40.*;
import java.nio.IntBuffer;
/**
 * @author aindrigo
 */
import static org.lwjgl.glfw.GLFW.*;
public class WindowRenderer extends BaseRenderer{
    public long window;
    public int WIDTH;
    public int HEIGHT;
    public WindowRenderer(Engine e) {
        super(e);
        this.WIDTH = 800;
        this.HEIGHT = 600;
    }

    @Override
    public void start() {
        if(!glfwInit()){
            glfwTerminate();
            System.exit(-1);
        }
        window = glfwCreateWindow(WIDTH,HEIGHT,e.getWindowTitle(),0,0);
        try(MemoryStack stack = MemoryStack.stackPush()){
            IntBuffer pWidth = stack.mallocInt(1);
            IntBuffer pHeight = stack.mallocInt(1);

            glfwGetWindowSize(window,pWidth,pHeight);

            GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            glfwSetWindowPos(window,(vidMode.width() - pWidth.get(0)) / 2, (vidMode.height() - pHeight.get(0)) / 2);
        }
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        glfwShowWindow(window);
        glfwSwapInterval(1);
        glClearColor(0.0f,0.0f,1.0f,0.0f);
    }

    @Override
    public void update() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glfwSwapBuffers(window);
        glfwPollEvents();
    }
}

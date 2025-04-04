package dev.kgamble;

import java.lang.reflect.Method;

public class IconViewer {
    public static void main(String[] args) {
        try {
            // Load the VectorIcons class using reflection
            Class<?> vectorIconsClass = Class.forName("com.inductiveautomation.ignition.client.icons.VectorIcons");

            // Get the main method
            Method mainMethod = vectorIconsClass.getMethod("main", String[].class);

            // Invoke the main method
            mainMethod.invoke(null, (Object) new String[0]);

            System.out.println("VectorIcons viewer launched successfully");
        } catch (Exception e) {
            System.err.println("Failed to run VectorIcons.main()");
            e.printStackTrace();
        }
    }
}
# Ignition Vector Icons Viewer

This is a simple Java application that allows you to view all available Vector Icons in the Inductive Automation Ignition SDK.

## How It Works

This application uses Java reflection to access and run the `main` method of the `VectorIcons` class from the Ignition client API. The `VectorIcons` class has a built-in dialog viewer that displays all available icons.

The key components:
1. A simple Java class that uses reflection to find and run the VectorIcons.main() method
2. Dependencies on the Ignition SDK libraries (specifically client-api and ignition-common)

## Setup Instructions

### Option 1: Using Gradle

1. Clone this repository
2. Open it in VS Code or your preferred IDE
3. Run the application using the provided Gradle task:
   ```
   ./gradlew run
   ```

### Option 2: Manual Setup

1. Create a directory for the project
2. Download the required JAR files:
   - ignition-common-8.1.24.jar
   - client-api-8.1.24.jar
3. Place them in a `lib` folder
4. Compile and run the IconViewer class with these JARs in the classpath

## Why Reflection?

We use reflection because:
1. The `VectorIcons` class is part of a larger framework
2. This approach avoids creating a direct dependency on internal implementation details
3. We can access the built-in viewer functionality without needing to reimplement it

## Expected Output

When run successfully, a dialog window will open showing all available Vector Icons in the Ignition framework, allowing you to browse and select icons for your application.